package edu.khityaev.math.geometry;

public class Circle extends Figure{
    private final int radius;

    public Circle(Point base, int radius) {
        super(base);
        if(radius<=0) throw new IllegalArgumentException();
        this.radius=radius;
    }

    public Circle(int x, int y, int radius){
        super(new Point(x, y));
        if(radius<=0) throw new IllegalArgumentException();
        this.radius=radius;
    }

    @Override
    public int area() {
        return (int) (radius*radius*Math.PI);
    }
}
