package edu.khityaev.math.geometry;

import java.util.Objects;

public class Line<T extends Point> implements Lengthening, Cloneable{
    private T a;
    private T b;


    public Line(T a, T b){
//        this.a = a;
//        this.b = b;
        this.a = a;
        this.b =b;
    }
    public Line(){
        this(0, 0, 0, 0);
    }
    public Line(int x1, int y1, int x2, int y2){
//        this(new edu.khityaev.math.geometry.Point(x1, y1), new edu.khityaev.math.geometry.Point(x2, y2));
        this.a = (T) new Point(x1, y1);
        this.b = (T) new Point(x2, y2);
    }
    public Line(Line line){
        this((T) line.a, (T) line.b);
    }

//    public void setA(T a) {
//        this.a = a;
//    }
//
//    public void setB(T b) {
//        this.b = b;
//    }

    public Point getA() {
        return new Point(a);
    }

    public Point getB() {
        return new Point(b);
    }

    public int length(){
        int tmp = (b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y);
        double sqrt = Math.sqrt(tmp);
        tmp = Math.toIntExact(Math.round(sqrt));
        return tmp;
    }



    @Override
    public String toString(){
        return "{" + a + "; " + b + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return (Objects.equals(this.a, line.a) && Objects.equals(this.b, line.b)) || (Objects.equals(this.a, line.b) && Objects.equals(this.b, line.a));
    }

    @Override
    public int hashCode() {
        return a.hashCode()+b.hashCode();
    }

    @Override
    public Line clone() {
        return new Line(a.clone(), b.clone());
    }
}
