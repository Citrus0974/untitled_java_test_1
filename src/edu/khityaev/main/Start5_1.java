package edu.khityaev.main;

import edu.khityaev.math.geometry.ClosedPolyline;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Polyline;
import edu.khityaev.roads.SymmetricTown;
import edu.khityaev.roads.Town;
import edu.khityaev.roads.WayToTown;
import edu.khityaev.university.Student;

public class Start5_1 {
    public static void main(String[] args) {
        System.out.println("5.1.4");
        Polyline pl1 = new Polyline(new Point(1, 2), new Point(2, 3), new Point(3, 4));
        ClosedPolyline pl2= new ClosedPolyline(new Point(1, 2), new Point(2, 3), new Point(3, 4));
        System.out.println(pl1.equals(pl2));

        System.out.println("5.1.5");
        Town t1 = new Town("t1");
        SymmetricTown t2 = new SymmetricTown("t1");
        Town t3 = new Town("toroads");
        t1.putRoad(new WayToTown(t3, 125));
        t2.putRoad(new WayToTown(t3, 125));
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

        System.out.println("5.1.6");
        Student st1 = new Student("student1", 5, 4, 3, 5);
        Student st2 = new Student("student1", 4, 4, 4, 5);
        System.out.println(st1.equals(st2));
    }
}
