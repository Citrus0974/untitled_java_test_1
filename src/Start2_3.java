public class Start2_3 {
    public static void main(String[] args){
        System.out.println("2.3.1");
        NaturalFraction f1 = new NaturalFraction(3, 5);
        System.out.println(differentNumberSum(2, f1, 2.3));
        System.out.println(differentNumberSum(3.6, new NaturalFraction(49, 12), 3, new NaturalFraction(3, 2)));
        System.out.println(differentNumberSum(new NaturalFraction(1, 3), new Integer(1)));

        System.out.println("2.3.2");
        singAll(new Sparrow(), new Cuckoo(), new Parrot("something"), new Cuckoo());

        System.out.println("2.3.3");
        System.out.println(areaOfAll(new Rectangle(5, 5, 5), new Circle(1, 1, 1), new Rectangle(5, 5, 2, 1)));
        System.out.println("2.3.4");
        meowAll(new Cat("cat1"), new Cat("cat2"), new AlienCat(), new AlienCat());
        System.out.println("2.3.5");
        System.out.println(lengthOfAll(new Polyline(new Point(1, 1), new Point(3, 2), new Point(4, 5)),
                        new Line(1,2, 5, 6),
                new ClosedPolyline(new Point(1, 1), new Point(3, 2), new Point(4, 5))));
        System.out.println("2.3.6");
        System.out.println(new Square(1, 1, 5).getPolyline().length());
        System.out.println(new Square(1, 1, 5).getPolyline().getClass());
        System.out.println("2.3.7");
        System.out.println(fullPolyline(new Square(1, 1, 5), new Polyline(new Point(1, 2), new Point(2, 3))));
        System.out.println("2.3.8");
        Gunner g1 = new Gunner("ACPerry");
        Gunner g2 = new Gunner("SkyTrooper");
        g2.setGun(new AutoGun(10, 3));
        Gunner g3 = new Gunner("AgentPea");
        g3.setGun(new Gun(5, 5));
        g1.shoot();
        g2.shoot();
        g3.shoot();
        System.out.println("2.3.9");
        Student st1 = new Student("Vasya", new Mark1or0(), 1, 0, 1);
        Student st2 = new Student("Petya", new MarksEvenNumber(), 2, 10, 100);
        System.out.println(st1);
        System.out.println(st2);

    }

    public static double differentNumberSum(Number...numbers){
        if(numbers.length<=0) throw new IllegalArgumentException("must be at least one number");
        double res = 0.0;
        for(int i = 0; i<numbers.length; i++){
            res = res + numbers[i].doubleValue();
        }
        return res;
    }

    public static void singAll(Singing...singers){
        if(singers.length<=0) throw new IllegalArgumentException("must be at least 1 singer");
        for(int i =0; i< singers.length; i++){
            singers[i].sing();
        }
    }

    public static int areaOfAll(Figure...figures){
        if(figures.length<=0) throw new IllegalArgumentException("must be at least 1 figure");
        int res=0;
        for(int i =0; i< figures.length; i++){
            res+=figures[i].area();
        }
        return res;
    }

    public static void meowAll(Meowing...meowers){
        if(meowers.length<=0) throw new IllegalArgumentException("must be at least 1 singer");
        for(int i =0; i< meowers.length; i++){
            meowers[i].meow();
        }
    }

    public static int lengthOfAll(Lengthening...figures){
        if(figures.length<=0) throw new IllegalArgumentException("must be at least 1 figure");
        int res=0;
        for(int i =0; i< figures.length; i++){
            res+=figures[i].length();
        }
        return res;
    }

    public static Polyline fullPolyline(PolygonalChain...figures){
        if(figures.length<=0) throw new IllegalArgumentException("must be at least 1 figure");
        Polyline res= new Polyline();
        for(int i =0; i< figures.length; i++){
            Polyline tmp = figures[i].getPolyline();
            for(int j=0; j<tmp.getSegmentCount(); j++){
                res.addPoint(tmp.getPoint(j));
            }
        }
        return res;
    }
}
