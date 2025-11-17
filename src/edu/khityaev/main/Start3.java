package edu.khityaev.main;

import edu.khityaev.math.NaturalFraction;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.office.Department;
import edu.khityaev.office.Employee;
import edu.khityaev.shooter.Gun;

import java.math.BigInteger;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Start3 {
    public static void main(String[] args){
        System.out.println("3.1.3");
        System.out.println(Start2_3.differentNumberSum(7, new NaturalFraction(11, 3), new BigInteger("12345678912345678912")));

        System.out.println("3.1.4");
        //Чтобы каждый раз не менять конфигурацию на ту, которая с аргументами запуска
        args = new String[2];
        args[0] = "2";
        args[1] = "10";
        System.out.println(powParsedInt(args));

        System.out.println("3.1.5");
        Point p1 = new Point(5, 6);
        System.out.println(p1);
        java.awt.Point p2 = new java.awt.Point(6, 5);
        System.out.println(p2);

        System.out.println("3.2.1");
        Department dep1 = new Department("IT");
        Employee e1 = new Employee("Петров", dep1);
        Employee e2 = new Employee("Козлов", dep1);
        Employee e3 = new Employee("Сидоров", dep1);
        dep1.setBoss(e2);
        System.out.println(dep1);

        System.out.println("3.2.2");
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
    }

    public static Number powParsedInt(String[] args){
        if(args==null) throw new IllegalArgumentException();
        if(args.length<2) throw new IllegalArgumentException();
        return pow(parseInt(args[0]), parseInt(args[1]));
    }
}
