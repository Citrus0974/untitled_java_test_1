package edu.khityaev.main;

import edu.khityaev.math.geometry.Line;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Point3D;
import edu.khityaev.structure.Box;

import java.util.ArrayList;
import java.util.List;

public class Start6_2 {
    public static void main(String[] args) {
        System.out.println("6.2.1");
        Line<Point> l2d = new Line<>(new Point(5, 15), new Point(15, 17));
        movePointStartXBy10(l2d);
        System.out.println(l2d);
        Line<Point3D> l3d = new Line<>(new Point3D(-5, -6, -8), new Point3D(2, 3, 4));
        movePointStartXBy10(l3d);
        System.out.println(l3d);

        System.out.println("6.2.2");
        Box<Integer> b1 = new Box<>(25);
        Box<Float> b2 = new Box<>(32.5f);
        Box<Double> b3 = new Box<>(27.8);
        System.out.println(maxValueOfNumberBoxes(b1, b2, b3));

        System.out.println("6.2.3");
        Box<Point> b4 = new Box<>();
        Point3D point3D = new Point3D(1, 1, 1);
        putPoint3DToBox(b4, point3D);
        System.out.println(b4);

        System.out.println("6.2.4");
        List<Number> listNumber = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        fillListWith100Numbers(listNumber);
        fillListWith100Numbers(listInteger);
//        fillListWith100Numbers(listDouble); //не заработает из-за super. А extends не будет ничего принимать, что логично,
//        ибо это изначальные потомки Number-а умеют кастоваться друг в друга через набор методов,
//        а в "нашу" дробь, прилепленную извне, естественно нет


    }

    public static void movePointStartXBy10(Line<? extends Point> line){
        Point start = line.getA();
        int x = start.getX();
        if(x<0) start.setX(x-10);
        else start.setX(x+10);
    }

    public static double maxValueOfNumberBoxes(Box<? extends Number> ... boxes){
        double max = Double.MIN_VALUE;
        double tmp;
        for(Box<? extends Number> box : boxes){
            tmp = box.getObj().doubleValue();
            if(tmp>max) max=tmp;
        }
        return max;
    }

    public static void putPoint3DToBox(Box<? super Point3D> box, Point3D point3D){
        box.putObj(point3D);
    }

    public static void fillListWith100Numbers(List<? super Integer> list){
        for(int i=0; i<100; i++){
            list.add(i+1);
        }
    }
}
