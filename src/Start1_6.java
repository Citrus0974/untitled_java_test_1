public class Start1_6 {
    public static void main(String[] args){
        System.out.println("1.6.1");
        House h1 = new House(25);
        System.out.println(h1);
//        House h2 = new House(-1);


        System.out.println("1.6.2");
        //ну вообще работает, но как гарантировать не пустую строку? тупо добавить в каждый конструктор проверку на "" ?

        System.out.println("1.6.3");
        Square sq1 = new Square(1, 1, 5);
        System.out.println(sq1);
        sq1.setSize(25);

        System.out.println("1.6.4");
        NaturalFraction fr1 = new NaturalFraction(5, -9);
        System.out.println(fr1);
        NaturalFraction fr2 = new NaturalFraction(-10, -10);
        System.out.println(fr2);

        System.out.println("1.6.5");
        Gun g1 = new Gun(7);
        g1.reloadGun(3);
        g1.gunShoot();
        g1.gunShoot();
        g1.gunShoot();
        g1.gunShoot();
        g1.gunShoot();
        g1.reloadGun(8);
        g1.gunShoot();
        g1.gunShoot();
        g1.dischargeGun();
        g1.gunShoot();

        System.out.println("1.6.6");
        //и так уже делали на прошлой паре

        System.out.println("1.6.7");
        //вроде и так работает, но при некоторых изменениях ругается. поэтому private а не final и рост остался

        System.out.println("1.6.8");
        //наверное работает. Разве там не должно было быть метода добавления новой оценки с перекопированием массива опять?

        System.out.println("1.6.9");
        //те же проблемы, что и 1.4.8 и 1.3.3. Почему-то с нулевым размером всё равно проскакивает в цикл и спотыкается об брейк

        System.out.println("1.6.10");
        //Вроде должно работать
    }
}
