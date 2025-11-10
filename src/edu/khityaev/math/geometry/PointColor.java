package edu.khityaev.math.geometry;

public class PointColor extends PointProperty{
    private final String color;

    public PointColor(String color) {
        super("Color");
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + color;
    }
}
