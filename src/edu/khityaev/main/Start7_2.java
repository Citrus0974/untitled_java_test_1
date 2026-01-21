package edu.khityaev.main;

import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Polyline;

import java.util.*;

public class Start7_2 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("deque1");
        Deque<String> deque2 = new ArrayDeque<>();
        deque2.offer("deque2");
        Queue<String> strings = new ArrayDeque<>();
        List<Deque<String>> listTest = new ArrayList<>();
        listTest.add(deque); listTest.add(deque); listTest.add(deque2); listTest.add(deque);
        System.out.println(listTest);
        Polyline polyline = new Polyline(new Point(5, 1), new Point(2, 6), new Point(3, 7));
        for(Point point : polyline){
            System.out.println(point);
        }
        System.out.println("7.2.1");

    }
}
