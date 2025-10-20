import javax.xml.transform.Source;

public class Start1_5 {

    public static void main(String[] args) {
        System.out.println("1.5.1");
        Gun g1 = new Gun(3);
        for (int i = 0; i < 5; i++) {
            g1.shoot();
        }

        System.out.println("1.5.2");
        Kot k1 = new Kot("Barsik");
        k1.meow();
        k1.meow(3);

        System.out.println("1.5.3");
        Line l1 = new Line(1, 1, 10, 15);
        System.out.println(l1.lineLength());

        System.out.println("1.5.4");
        //вроде и так работает

        System.out.println("1.5.5");
        NaturalFraction fr1 = new NaturalFraction(1, 3);
        NaturalFraction fr2 = new NaturalFraction(2, 3);
        NaturalFraction fr3 = new NaturalFraction(2, 9);
        System.out.println(NaturalFraction.sum(fr1, fr2));
        System.out.println(NaturalFraction.sum(fr1, 5));
        System.out.println(NaturalFraction.minus(fr1, fr2));
        System.out.println(NaturalFraction.milti(fr1, fr3));
        System.out.println(NaturalFraction.div(fr1,fr2));
        System.out.println(fr1 + " * " + fr2 + " = " + NaturalFraction.milti(fr1, fr2));
        System.out.println(NaturalFraction.minus(NaturalFraction.div(NaturalFraction.sum(fr1, fr2), fr3), 5));

        System.out.println("1.5.6");
        Student s1 = new Student("Вася", 3,4,5);
        Student s2 = new Student("Максим");
        System.out.println(s1.averageMark());
        System.out.println(s2.averageMark());
        Student s3 = new Student("Вася2", 5,5,5);
        System.out.println(s3.averageMark());
        System.out.println(s1.isExcellent());
        System.out.println(s2.isExcellent());
        System.out.println(s3.isExcellent());

        System.out.println("1.5.7");
        Polyline pl1 = new Polyline(new Point(1, 5), new Point(2, 8), new Point(5, 3));
        System.out.println(pl1.fullLength());
        pl1.addPoint(new Point(5, 15), new Point(8, 10));
        System.out.println(pl1.fullLength());

        System.out.println("1.5.8");
        Square sq1 = new Square(5, 3, 23);
        Polyline pl2 = sq1.toPolyline();
        System.out.println(pl2.fullLength());
        pl2.changePoint(3, new Point(15, 25));
        System.out.println(pl2.fullLength());
    }
}
