package edu.khityaev.main;

import edu.khityaev.animals.AttentionMeowWrapper;
import edu.khityaev.animals.Cat;
import edu.khityaev.animals.MeowCounterWrapper;
import edu.khityaev.animals.Meowing;

import java.util.Random;

public class Start7_X_1512 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("brs");
        MeowCounterWrapper catCounterWrapper = new MeowCounterWrapper(cat1);
        testMeow(catCounterWrapper);
        System.out.println(catCounterWrapper.getMeowCount());
        AttentionMeowWrapper attentionMeowWrapper = new AttentionMeowWrapper(cat1);
        testMeow(attentionMeowWrapper);

        Cat cat2 = new Cat("brs2");
        AttentionMeowWrapper attentionMeowWrapper2 = new AttentionMeowWrapper(cat2);
        MeowCounterWrapper meowCounterWrapper2 = new MeowCounterWrapper(attentionMeowWrapper2);
        testMeow(meowCounterWrapper2);
        System.out.println(meowCounterWrapper2.getMeowCount());
    }

    static void testMeow(Meowing meowing){
        Random rnd = new Random();
        int i = Math.abs(rnd.nextInt()%100);
        for(; i>0; i--){
            meowing.meow();
        }
    }
}
