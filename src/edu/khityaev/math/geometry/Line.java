package edu.khityaev.math.geometry;

import java.util.Objects;

public class Line implements Lengthening{
    private Point a = new Point(0, 0);
    private Point b = new Point(0, 0);


    public Line(Point a, Point b){
//        this.a = a;
//        this.b = b;
        this(a.getX(), a.getY(), b.getX(), b.getY());
    }
    public Line(){
        this(0, 0, 0, 0);
    }
    public Line(int x1, int y1, int x2, int y2){
//        this(new edu.khityaev.math.geometry.Point(x1, y1), new edu.khityaev.math.geometry.Point(x2, y2));
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
    }
    public Line(Line line){
        this(line.a, line.b);
    }

    public void setA(Point a) {
        this.a = new Point(a);
    }

    public void setB(Point b) {
        this.b = new Point(b);
    }

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
}
