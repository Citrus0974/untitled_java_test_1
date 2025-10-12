import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                HELLO WORLD
                """);

//        System.out.println(MyMath.sum(3, 4));
//        System.out.println(MyMath.sum(10, 12));

        int [] arr = {4, 7, 1, 10, 9};
//        System.out.println(MyMath.arrMax(arr));
//        int [] arr2 = null;
//        int [] arr3 = {};
//        System.out.println(MyMath.arrMax(arr3));
//        System.out.println(MyMath.arrMax(arr2));
//
//        arr = NewArray.InsertInArray(arr, 3, 11);
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(l1);
        System.out.println(l2);
        p1.x=10;
        System.out.println(" p1.x=10;");
        System.out.println(l1);
        System.out.println(l2);

//        System.out.println("1.1.2");
//        Human h1 = new Human();
//        h1.name="Клеопатра";
//        h1.height=152;
//        System.out.println(h1);
//        Human h2 = new Human();
//        h2.name="Пушкин";
//        h2.height=167;
//        System.out.println(h2);
//        Human h3 = new Human();
//        h3.name = "Александр";
//        h3.height = 189;
//        System.out.println(h3);

        System.out.println("1.1.3");
        Name n1 = new Name();
        n1.nam = "Клеопатра";
        System.out.println(n1);
        Name n2 = new Name();
        n2.fam = "Пушкин";
        n2.nam = "Александр";
        n2.otch = "Сергеевич";
        System.out.println(n2);
        Name n3 = new Name();
        n3.fam = "Маяковский";
        n3.nam = "Владимир";
        System.out.println(n3);

        System.out.println("1.1.4");
        Time t1 = new Time();
        t1.seconds = 3600;
        System.out.println(t1);
        Time t2 = new Time();
        t2.seconds = 12000;
        System.out.println(t2);
        Time t3 = new Time();
        t3.seconds = 91800;
        System.out.println(t3);
        Time t4 = new Time();
        t4.seconds = 10;
        System.out.println(t4);
        Time t5 = new Time();
        t5.seconds = 10000;
        System.out.println(t5);
        Time t6 = new Time();
        t6.seconds = 100000;
        System.out.println(t6);

        System.out.println("1.1.5");
        House ho1 = new House();
//        ho1.floors = 1;
        System.out.println(ho1);
//        ho1.floors = 5;
        System.out.println(ho1);
//        ho1.floors = 23;
        System.out.println(ho1);

    }
}