package edu.khityaev.validation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ValidationFramework {

    public static Map<String, TestResult> validate(Object target){
        Class<?> targetClass = target.getClass();
        if(!targetClass.isAnnotationPresent(Validation.class)){
            return new HashMap<String, TestResult>();
        }

        //собирание методов
        Class<?> testClass = targetClass.getAnnotation(Validation.class).value();
        Method[] methods = testClass.getDeclaredMethods();
        List<Method> testsList = new ArrayList<>();
        for(Method m : methods){
            if(!m.isAnnotationPresent(ValidationTest.class)) continue;
            if(m.getParameterCount()!=1 || !m.getParameterTypes()[0].equals(targetClass)){
                throw new TestInvalidException(m.getName());
            }
            m.setAccessible(true);
            testsList.add(m);
        }


        //создание объекта для тестов
        Constructor<?> constructor;
        try{
            constructor = testClass.getDeclaredConstructor();
        } catch (NoSuchMethodException ex){
            throw new TestInvalidException("Test class must have an empty constructor");
        }
        constructor.setAccessible(true);
        Object testObj;
        try{
            testObj=constructor.newInstance();
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }

        //вызов методов тестов
        Map<String, TestResult> result = new HashMap<>();
        for (Method m: testsList){
            try{
                m.invoke(testObj, target);
            } catch (IllegalAccessException ex){
                throw new RuntimeException(ex);
            } catch (InvocationTargetException ex){
                if(ex.getCause().getClass() != TestFailedException.class){
                    throw new RuntimeException(ex);
                }
                result.put(m.getName(), new TestResult(EResultStatus.FAILED, ex.getCause()));
                continue;
            }
            result.put(m.getName(), new TestResult(EResultStatus.PASSED, null));
        }
        return result;
    }
}
