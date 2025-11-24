package edu.khityaev.main;

import edu.khityaev.math.geometry.Line;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.office.Department;
import edu.khityaev.office.Employee;

public class Start1_2 {
    public static void main(String []args){
        System.out.println("1.2.1");

        Point p1 = new Point(1, 3);
        Point p2 = new Point(23, 8);
        Line l1 = new Line(p1, p2);
        System.out.println("line l1" + l1);
        Point p3 = new Point(5 , 10);
        Point p4 = new Point(25, 10);
        Line l2 = new Line(p3, p4);
        System.out.println("line l2 " + l2);
        Line l3 = new Line(p1, p4);
        System.out.println("line l3 " + l3);

        System.out.println(" ");
        p1.setX(2);
        p4.setY(11);
        System.out.println(" ");
        System.out.println("line l1" + l1);
        System.out.println("line l2" + l2);
        System.out.println("line l3" + l3);

        Point p5 = new Point();
//        l1.setA(p5);
        System.out.println(" ");
        System.out.println("line l1" + l1);
        System.out.println("line l2" + l2);
        System.out.println("line l3" + l3);

        System.out.println("1.2.2");

//        edu.khityaev.life.Name n1 = new edu.khityaev.life.Name();
//        n1.nam = "Клеопатра";
//        edu.khityaev.life.Name n2 = new edu.khityaev.life.Name();
//        n2.fam = "Пушкин";
//        n2.nam = "Александр";
//        n2.otch = "Сергеевич";
//        edu.khityaev.life.Name n3 = new edu.khityaev.life.Name();
//        n3.fam = "Маяковский";
//        n3.nam = "Владимир";
//        edu.khityaev.life.Human h1 = new edu.khityaev.life.Human(n1, 152);
//        edu.khityaev.life.Human h2 = new edu.khityaev.life.Human(n2, 167);
//        edu.khityaev.life.Human h3 = new edu.khityaev.life.Human(n3, 189);
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
        //скрыто из-за закрытия полей класса edu.khityaev.life.Name согласно 1.6.2

        System.out.println("1.2.3");

//        edu.khityaev.life.Name n4 = new edu.khityaev.life.Name("Чудов", "Иван", "");
//        edu.khityaev.life.Name n5 = new edu.khityaev.life.Name("Чудов", "Петр", "");
//        edu.khityaev.life.Name n6 = new edu.khityaev.life.Name("", "Борис", "");
//        edu.khityaev.life.Human h4 = new edu.khityaev.life.Human(n4);
//        edu.khityaev.life.Human h5 = new edu.khityaev.life.Human(n5, h4);
//        edu.khityaev.life.Human h6 = new edu.khityaev.life.Human(n6, h5);
//        System.out.println(h4);
//        System.out.println(h5);
//        System.out.println(h6);
        //скрыто из-за закрытия полей класса edu.khityaev.life.Name согласно 1.6.7

        System.out.println("1.2.4");
        Department dep1 = new Department("IT");
        Employee e1 = new Employee("Петров", dep1);
        Employee e2 = new Employee("Козлов", dep1);
        Employee e3 = new Employee("Сидоров", dep1);
//        dep1.boss=e2;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);



    }
}
