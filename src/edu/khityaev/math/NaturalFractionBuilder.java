package edu.khityaev.math;

import java.util.ArrayList;
import java.util.List;

public class NaturalFractionBuilder {
    private static List<NaturalFraction>  pool = new ArrayList<>();

    private NaturalFractionBuilder(){}

    public static NaturalFraction getNaturalFraction(int numerator, int denominator){
        if(denominator==0) throw new IllegalArgumentException();
        if (denominator<0) {
            numerator*=(-1);
            denominator*=(-1);
        }
        NaturalFraction fraction = new NaturalFraction(numerator, denominator);
        for(NaturalFraction f : pool){
            if(fraction.equals(f)){
                return f;
            }
        }
        pool.add(fraction);
        return fraction;
    }
}
