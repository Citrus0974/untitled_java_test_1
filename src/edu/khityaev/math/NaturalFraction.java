package edu.khityaev.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NaturalFraction extends Number implements Cloneable{
    final int numerator;
    final int denominator;

    //Должен быть package-private для 7.1.3, но остаётся публичным для старых файлов
    public NaturalFraction(int numerator, int denominator){
        if(denominator==0) throw new IllegalArgumentException();
        if (denominator<0) {
            numerator*=(-1);
            denominator*=(-1);
        }
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public static NaturalFraction sum(NaturalFraction a, NaturalFraction b){
        int denom = a.denominator * b.denominator;
        int numenator = a.numerator*b.denominator+b.numerator*a.denominator;
        return new NaturalFraction(numenator, denom);
    }
    public static NaturalFraction sum(NaturalFraction a, int b){
        return new NaturalFraction(a.numerator+b*a.denominator, a.denominator);
    }
    public static NaturalFraction minus(NaturalFraction a, NaturalFraction b){
        int denom = a.denominator * b.denominator;
        int numenator = a.numerator*b.denominator-b.numerator*a.denominator;
        return new NaturalFraction(numenator, denom);
    }
    public static NaturalFraction minus(NaturalFraction a, int b) {
        return new NaturalFraction(a.numerator-b*a.denominator, a.denominator);
    }
    public static NaturalFraction milti(NaturalFraction a, NaturalFraction b){
        return new NaturalFraction(a.numerator*b.numerator, a.denominator*b.denominator);
    }
    public static NaturalFraction milti(NaturalFraction a, int b){
        return new NaturalFraction(a.numerator*b, a.denominator);
    }
    public static NaturalFraction div(NaturalFraction a, NaturalFraction b){
        return new NaturalFraction(a.numerator*b.denominator, a.denominator*b.numerator);
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator/denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator/denominator;
    }

    @Override
    public Number clone(){
        try {
            return (Number) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NaturalFraction that = (NaturalFraction) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }


}
