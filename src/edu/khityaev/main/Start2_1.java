package edu.khityaev.main;

import edu.khityaev.math.geometry.ClosedPolyline;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Point3D;
import edu.khityaev.math.geometry.Polyline;
import edu.khityaev.roads.SymmetricTown;
import edu.khityaev.roads.Town;
import edu.khityaev.roads.WayToTown;

public class Start2_1 {
    public static void main(String[] args) {
        System.out.println("2.1.1");
        //А как? Разве final-поле можно переопределить в потомке каким-то образом? И как это сделать? Сделать sealed? Сам класс или поля?
        //Короче и так работает

        System.out.println("2.1.2");
        //что делать понятно, но непонятно что значит "кроме расчета длины (по очевидным причинам)"
        //надо подумать как просто добавить проверку на совпадение первой и последней точки,
        // или его как раз и добавлять в метод определения длины? или в конструктор?
        //Переопределил только метод определения длины.
        Polyline pl1 = new Polyline(new Point(1, 2), new Point(3, 2), new Point(5, 7));
        System.out.println(pl1.length());
        ClosedPolyline l2 = new ClosedPolyline(new Point(1, 2), new Point(3, 2), new Point(5, 7));
        System.out.println(l2.length());


        System.out.println("2.1.3");
        //по иронии судьбы, я изначально так и пытался сделать с изначальным классом. Теперь переделывать и его без попытки определить строки?
        //По идее опять нужно только переопределение методов и/или конструкторов
        SymmetricTown c1 = new SymmetricTown("ABC");
        Town c2 = new Town("DEF");
        c2.putRoad(c1,3);
        c1.putRoad(c2, 5);
        SymmetricTown c3 = new SymmetricTown("MSC",new WayToTown(c1,7),new WayToTown(c2,8));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);




        System.out.println("2.1.4");
        //надо быстренько сделать!!!
        //вроде уже теперь работает

        System.out.println("2.1.5");
        //тоже вроде несложно, но нужно добавить конструкторов сеттеров геттеров, и сделать sealed edu.khityaev.math.geometry.Point permits Point3d
        //вроде тоже готово
        Point3D p1 = new Point3D(1, 3, 6);
        System.out.println(p1);



    }
}
