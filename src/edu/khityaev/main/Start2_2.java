package edu.khityaev.main;

import edu.khityaev.animals.Cuckoo;
import edu.khityaev.animals.Parrot;
import edu.khityaev.animals.Sparrow;
import edu.khityaev.math.geometry.*;
import edu.khityaev.shooter.Gun;

public class Start2_2 {
    public static void main(String[] args){
        System.out.println("2.2.1");
        Gun g1 = new Gun(7);
        g1.reloadGun(3);
        g1.shoot();
        g1.shoot();
        g1.shoot();
        g1.shoot();
        g1.shoot();
        g1.reloadGun(8);
        g1.shoot();
        g1.shoot();
        g1.dischargeGun();
        g1.shoot();

        System.out.println("2.2.2");
        //вроде готово

        System.out.println("2.2.3");
        Cuckoo ck1 = new Cuckoo();
        ck1.sing();
        Sparrow sp1 = new Sparrow();
        sp1.sing();
        Parrot p1 = new Parrot("hello");
        p1.sing();
        p1.sing();

        System.out.println("2.2.4");
        Triangle t1 = new Triangle(new Point(10,10), new Point(20,20), new Point(30, 10));
        System.out.println(t1.area());
        Circle c1 = new Circle(1, 1, 5);
        System.out.println(c1.area());
        Rectangle rc1 = new Rectangle(34, 34, 34, 50);
        System.out.println(rc1.area());
        System.out.println(rc1.isSquare());
        rc1 = new Rectangle(new Point(1, 1), 45);
        System.out.println(rc1.area());
        System.out.println(rc1.isSquare());


        System.out.println("2.2.5");
        PointColor color1 = new PointColor("red");
        PointColor color2 = new PointColor("blue");
        PointProperty color3 = new PointColor("green");
        PointProperty siz1 = new PointSize(5);
        VariablePoint vp1 = new VariablePoint(1, 3, 4);
        vp1.addProperty(color2);
        vp1.addProperty(siz1);
        System.out.println(vp1);
        VariablePoint vp2 = new VariablePoint(new int[]{1, 2}, color3, siz1);
        System.out.println(vp2);
    }
    // git test
}
