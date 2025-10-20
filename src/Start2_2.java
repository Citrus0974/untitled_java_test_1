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
    }
}
