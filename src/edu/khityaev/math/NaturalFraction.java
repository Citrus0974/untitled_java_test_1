package edu.khityaev.math;

public class NaturalFraction extends Number{
    final int numerator;
    final int denominator;

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
}
