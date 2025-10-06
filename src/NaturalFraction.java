public class NaturalFraction {
    public int numerator;
    public int denominator;

    public NaturalFraction(int numerator, int denominator){
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
}
