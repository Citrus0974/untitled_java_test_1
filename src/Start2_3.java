import java.rmi.AlreadyBoundException;
import java.util.SortedMap;

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
}
