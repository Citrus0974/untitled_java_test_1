package edu.khityaev.main;

import edu.khityaev.annotations.*;

import java.util.Arrays;

@Cache
@Two(first = "first method", second = 9)
public class Start8_2 {
    @ToString
    @Default(Integer.class)
    static Integer test = 5;

    @TimeMeasure
    public static void main(String[] args) {
        System.out.println("8.2.1");
        System.out.println(invocableMethod());
        System.out.println("8.2.2");
        System.out.println(test);
        System.out.println("8.2.3");
        try {
            System.out.println(Start8_2.class.getDeclaredField("test").isAnnotationPresent(ToString.class));
            System.out.println(Start8_2.class.getDeclaredField("test").getAnnotation(ToString.class).value());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("8.2.4");
        try {
            System.out.println(Arrays.toString(Invoke.class.getAnnotation(Validate2.class).value()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("8.2.5");
        System.out.println("8.2.6");
    }

    @Invoke
    public static String invocableMethod(){
        System.out.println("invoked");
        return "invoked returned";
    }
}
