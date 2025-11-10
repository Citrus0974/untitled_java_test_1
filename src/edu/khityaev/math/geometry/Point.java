package edu.khityaev.math.geometry;

import java.util.Objects;

public sealed class Point permits Point3D {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this(0, 0);
    }
    public Point(Point point){
        //this(point.getX(), point.getY());
        this(point.x, point.y);
    }


    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return "(" + x + "; " + y +")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
