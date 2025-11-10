package edu.khityaev.main;

import edu.khityaev.math.geometry.ClosedPolyline;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Polyline;

public class Start5_1 {
    public static void main(String[] args) {
        System.out.println("5.1.4");
        Polyline pl1 = new Polyline(new Point(1, 2), new Point(2, 3), new Point(3, 4));
        ClosedPolyline pl2= new ClosedPolyline(new Point(1, 2), new Point(2, 3), new Point(3, 4));
        System.out.println(pl1.equals(pl2));
    }
}
