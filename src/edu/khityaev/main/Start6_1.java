package edu.khityaev.main;

import edu.khityaev.math.geometry.Line;
import edu.khityaev.math.geometry.Point3D;
import edu.khityaev.structure.Box;
import edu.khityaev.structure.Storage;
import edu.khityaev.university.Student;

public class Start6_1 {
    public static void main(String[] args) {
        System.out.println("6.1.1");
        Box<Integer> b1 = new Box<>();
        b1.putObj(3);
        System.out.println(b1.getObj());
        System.out.println(b1.getObj());

        System.out.println("6.1.2");
        //а как? а вот так
        Storage<Number> storage1 = new Storage<>(null);
        System.out.println(storage1.getObj(0));
        Storage<Number> storage2 = new Storage<>(99);
        System.out.println(storage2.getObj(-1));
        Storage<String> storage3 = new Storage<>(null);
        System.out.println(storage3.getObj("default"));
        Storage<String> storage4 = new Storage<>("hello");
        System.out.println(storage4.getObj("hello world"));

        System.out.println("6.1.3");
        //ну интерфейс и всё вроде быы

        System.out.println("6.1.4");
        Student st1 = new Student("1", 1, 2, 3, 4, 5);
        Student st2 = new Student("2", 2, 3, 4, 5, 5);
        System.out.println(st1.compare(st2));
        System.out.println(st2.compare(st1));
        System.out.println(st1.compare(st1));

        System.out.println("6.1.5");
        //ломаются конструкторы: создающий новые точки (конструктор T не вызвать, мб через клон переделывать) и копирующий
        Line<Point3D> l1 = new Line<>(new Point3D(1, 2, 3), new Point3D(4, 5, 6));
        System.out.println(l1);

        System.out.println("6.1.6");
        //стек из списка это конечно умом а не умом
    }
}
