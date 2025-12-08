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
    public Line(int x1, int y1, int z1, int x2, int y2, int z2){
        this.a = (T) new Point3D(x1, y1, z1);
        this.b = (T) new Point3D(x2, y2, z2);
    }
    //а если линия другого типа точек будет?
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

    //  По-хорошему должно было и дальше возвращать копии точек для инкапсуляции.
    //  Но в 6.2.1 слишком неудобно получается. Создавать новую линию? Тогда придётся заставлять метод возвращать новую ссылку,
    //которая будет ограниченного, а не определённого типа, она по идее не присвоится в старую переменную.
    public Point getA() {
//        return new Point(a);
        return this.a;
    }

    public Point getB() {
//        return new Point(b);
        return this.b;
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
    public Line<T> clone() {
        Line<T> newLine;
        try{
            newLine = (Line<T>) super.clone();
            newLine.a = (T) this.a.clone();
            newLine.b = (T) this.b.clone();
        } catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
        return newLine;
    }
}
