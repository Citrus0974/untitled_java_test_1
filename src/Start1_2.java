import javax.xml.transform.Source;

public class Start1_2 {
    public static void main(String []args){
        System.out.println("1.2.1");

        Point p1 = new Point(1, 3);
        Point p2 = new Point(23, 8);
        Line l1 = new Line(p1, p2);
        System.out.println("line l1" + l1);
        Point p3 = new Point(5 , 10);
        Point p4 = new Point(25, 10);
        Line l2 = new Line(p3, p4);
        System.out.println("line l2 " + l2);
        Line l3 = new Line(p1, p4);
        System.out.println("line l3 " + l3);

        System.out.println(" ");
        p1.setX(2);
        p4.setY(11);
        System.out.println(" ");
        System.out.println("line l1" + l1);
        System.out.println("line l2" + l2);
        System.out.println("line l3" + l3);

        Point p5 = new Point();
        l1.setA(p5);
        System.out.println(" ");
        System.out.println("line l1" + l1);
        System.out.println("line l2" + l2);
        System.out.println("line l3" + l3);

        System.out.println("1.2.2");

//        Name n1 = new Name();
//        n1.nam = "Клеопатра";
//        Name n2 = new Name();
//        n2.fam = "Пушкин";
//        n2.nam = "Александр";
//        n2.otch = "Сергеевич";
//        Name n3 = new Name();
//        n3.fam = "Маяковский";
//        n3.nam = "Владимир";
//        Human h1 = new Human(n1, 152);
//        Human h2 = new Human(n2, 167);
//        Human h3 = new Human(n3, 189);
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
        //скрыто из-за закрытия полей класса Name согласно 1.6.2

        System.out.println("1.2.3");

//        Name n4 = new Name("Чудов", "Иван", "");
//        Name n5 = new Name("Чудов", "Петр", "");
//        Name n6 = new Name("", "Борис", "");
//        Human h4 = new Human(n4);
//        Human h5 = new Human(n5, h4);
//        Human h6 = new Human(n6, h5);
//        System.out.println(h4);
//        System.out.println(h5);
//        System.out.println(h6);
        //скрыто из-за закрытия полей класса Name согласно 1.6.7

        System.out.println("1.2.4");
        Department dep1 = new Department("IT");
        Employee e1 = new Employee("Петров", dep1);
        Employee e2 = new Employee("Козлов", dep1);
        Employee e3 = new Employee("Сидоров", dep1);
//        dep1.boss=e2;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);



    }
}
