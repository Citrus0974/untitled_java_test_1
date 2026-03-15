package edu.khityaev.main;

import edu.khityaev.animals.CatDog;
import edu.khityaev.life.Human;
import edu.khityaev.math.geometry.Line;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Point3D;
import edu.khityaev.shooter.Gunner;
import edu.khityaev.structure.Entity;
import edu.khityaev.structure.Storage;
import edu.khityaev.validation.ValidationFramework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Start8_1 {
    public static void main(String[] args) {
        System.out.println("8.1.1");
        System.out.println(fieldCollection(CatDog.class));

        System.out.println("8.1.2");
        Line<Point> p1 = new Line<>(1, 1, 2, 2);
        Line<Point> p2 = new Line<>(3, 3, 4, 4);
        System.out.println(p1);
        System.out.println(p2);
        lineConnector(p1, p2);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("8.1.3");
//        System.out.println(Point.class.getDeclaredFields()[0].getName());
//        System.out.println(Point.class.getSimpleName());
        System.out.println(new Gunner("test"));


        System.out.println("8.1.4");
        Human human = new Human("kto");
        Human human2 = new Human("weojrawherauwehhrewh");
        System.out.println(ValidationFramework.validate(human));
        System.out.println(ValidationFramework.validate(human2));

//        System.out.println("8.1.5");

    }

    public static List<Field> fieldCollection(Class<?> targetCls ){

        List<Field> ownFields = Arrays.asList(targetCls.getDeclaredFields());
        List<Field> fields = new ArrayList<>(ownFields);

        Set<Class> parents = getAllParentClasses(targetCls, new HashSet<>());
        for(Class parent: parents){
            fields.addAll(Arrays.asList(parent.getDeclaredFields()));
        }

        return fields;
    }

//    public static List<Method> methodCollection(Class<?> targetCls ){
//    //не работает правильно из-за переопределённых методов
//    //возможно можно пофиксить проверкой на наличие аннотации Override и дальнейшим сравнением по чему-то
//        List<Method> methods = new ArrayList<>();
//
//        List<Method> ownMethods = Arrays.asList(targetCls.getDeclaredMethods());
//        methods.addAll(ownMethods);
//
//        Set<Class> parents = getAllParentClasses(targetCls, new HashSet<>());
//        for(Class parent: parents){
//            methods.addAll(Arrays.asList(parent.getDeclaredMethods()));
//        }
//
//        return methods;
//    }

    public static Set<Class> getAllParentClasses(Class clz, Set<Class> parents){
        Class superclass = clz.getSuperclass();

        Class[] interfaces = clz.getInterfaces();

        if(superclass==null && interfaces.length==0){
            return parents;
        }
        parents.add(superclass);
        parents.addAll(Arrays.asList(interfaces));

        parents.addAll(getAllParentClasses(superclass, parents));
        for(Class interfaceClass : interfaces){
            parents.addAll(getAllParentClasses(interfaceClass, parents));
        }
        return parents;
    }

    public static  <T extends Point> void lineConnector(Line<T> line1, Line<T> line2){
        try {
            Field firstEnd = line1.getClass().getDeclaredField("b");
            firstEnd.setAccessible(true);
            T firstEndPoint = (T) firstEnd.get(line1);
            Field secondStart = line2.getClass().getDeclaredField("a");
            secondStart.setAccessible(true);
            secondStart.set(line2, firstEndPoint);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//class Test1 extends Entity{
//    int a = 5;
//}
//
//interface Test2{
//    final int b = 3;
//
//}
//
//class Test3 extends  Test1 implements Test2{
//    String c = "1";
//}




