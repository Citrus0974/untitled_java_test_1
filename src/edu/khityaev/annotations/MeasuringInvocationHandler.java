package edu.khityaev.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MeasuringInvocationHandler implements InvocationHandler {
    Object object;

    public MeasuringInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method = object.getClass().getMethod(method.getName(), method.getParameterTypes());
        if(!method.isAnnotationPresent(TimeMeasure.class)){
            return method.invoke(proxy, args);
        }
        long start = System.currentTimeMillis();
        Object obj = method.invoke(object, args);
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("time elapsed: " + time);
        return obj;
    }
}
