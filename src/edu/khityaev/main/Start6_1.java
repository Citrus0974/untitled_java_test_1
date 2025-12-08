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
        Storage<Number> storage1 = Storage.ofNullable(null);
        System.out.println(storage1.orElse(0));
        Storage<Number> storage2 = Storage.ofNullable(99);
        System.out.println(storage2.orElse(-1));
        Storage<String> storage3 = Storage.ofNullable(null);
        System.out.println(storage3.orElse("default"));
        Storage<String> storage4 = Storage.ofNullable("hello");
        System.out.println(storage4.orElse("hello world"));

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
