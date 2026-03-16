package edu.khityaev.main;

import edu.khityaev.animals.Cat;
import edu.khityaev.animals.Meowing;
import edu.khityaev.annotations.Invoke;
import edu.khityaev.annotations.MeasuringInvocationHandler;
import edu.khityaev.annotations.TimeMeasure;
import edu.khityaev.life.Human;
import edu.khityaev.shooter.Gunner;
import edu.khityaev.validation.TestInvalidException;
import edu.khityaev.validation.ValidationFramework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Start8_3 {
    public static void main(String[] args) {
        System.out.println("8.3.1");
        System.out.println(collect(List.of(Start8_2.class)));

        System.out.println("8.3.2");
        //reset присваивает дефолтное значение полям
        //Почему свойство типа Class?
        //где хранить значения по умолчанию? именно хранить? пока мысль только передавать прямо в метод в хешмапе, но очень сомнительно
        //Или в енаме хранить пары класс-значение? тоже странно
        //можно было бы через ещё одно свойство аннотации (не выйдет точно, ибо вешается на класс тоже) или другую аннотацию, но тогда нестандартные типы не укажешь
        //что значит "использовать умолчания в соответствии со спецификацией языка"? их можно откуда-то получить?

        System.out.println("8.3.3");
        Gunner g1 = new Gunner("test");
        System.out.println(g1);

        System.out.println("8.3.4");
        //Вроде бы уже и так сделано в лучшем виде на паре

        System.out.println("8.3.5");
        Human human = new Human("kto");
        Human human2 = new Human("weojrawherauwehhrewh");
        System.out.println(ValidationFramework.validate(human));
        System.out.println(ValidationFramework.validate(human2));

        System.out.println("8.3.6");


        System.out.println("8.3.X - time measure");
        Cat cat = new Cat("test");
        Class[] interfaces = cat.getClass().getInterfaces();
        ClassLoader loader = Start8_2.class.getClassLoader();


        Meowing cat2 = (Meowing) Proxy.newProxyInstance(loader, interfaces, new MeasuringInvocationHandler(cat));
        cat2.meow();


    }


    public static Map<String, Object> collect(List<Class<?>> classList){
        Map<String, Object> result = new HashMap<>();
        for(Class<?> clz : classList){
//            boolean isProxed = false;
            Method[] methods = clz.getDeclaredMethods();
            List<Method> invokable = new ArrayList<>();
            for(Method m: methods){
                if(!m.isAnnotationPresent(Invoke.class)) continue;
                if(m.getParameterCount()>0) continue;
                if(m.getReturnType() == void.class) continue;
//                if(m.isAnnotationPresent(TimeMeasure.class)) isProxed=true;
                m.setAccessible(true);
                invokable.add(m);
            }
            Constructor<?> constructor;
            try{
                constructor = clz.getDeclaredConstructor();
            } catch (NoSuchMethodException ex){
                throw new RuntimeException("Test class must have an empty constructor");
            }
            constructor.setAccessible(true);
            Object classObj;
            try{
                classObj=constructor.newInstance();
                classObj=timeMeasure(classObj, clz.getInterfaces(), clz.getClassLoader());
            } catch (Exception ex){
                throw new RuntimeException(ex);
            }
//            if(isProxed){
//                Class[] interfaces = classObj.getClass().getInterfaces();
//                ClassLoader loader = classObj.getClass().getClassLoader();
//
//            }
            for(Method m : invokable){
                try{
                    result.put(m.getName(), m.invoke(classObj));
                } catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

    public static<T> T timeMeasure(T object, Class<?>[] interfaces, ClassLoader loader){
        Method[] methods = object.getClass().getMethods();
        for(Method m : methods){
            if(m.isAnnotationPresent(TimeMeasure.class)){
                createProxy(object, interfaces, loader);
            }
        }
        return object;

    }

    private static <T> T createProxy(T object, Class<?>[] interfaces, ClassLoader loader){
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method=object.getClass().getMethod(method.getName(), method.getParameterTypes());
                if(!method.isAnnotationPresent(TimeMeasure.class)) {
                    return method.invoke(object, args);
                }
                long start = System.currentTimeMillis();
                Object result = method.invoke(object, args);
                long end = System.currentTimeMillis();
                System.out.println("elapsed time: " + (end-start) + " ms");
                return result;
            }
        };
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
