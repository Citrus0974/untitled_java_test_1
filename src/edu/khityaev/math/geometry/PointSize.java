package edu.khityaev.math.geometry;

public class PointSize extends PointProperty{
    final int size;
    public PointSize(int size) {
        super("Size");
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + size;
    }
}
