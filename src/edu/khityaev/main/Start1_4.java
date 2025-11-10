package edu.khityaev.main;

import edu.khityaev.life.House;
import edu.khityaev.life.Human;
import edu.khityaev.life.Name;
import edu.khityaev.math.geometry.Point;
import edu.khityaev.math.geometry.Polyline;
import edu.khityaev.university.Student;

public class Start1_4 {
    public static void main(String[] args){
        System.out.println("1.4.1");
        Point p1 = new Point(12 ,5);
        Point p2 = new Point();
        Point p3 = new Point(p1);
        //и так работает

        System.out.println("1.4.2");
        //и так работает

        System.out.println("1.4.3");
        Polyline pl1 = new Polyline(p1, p2, p3);
        System.out.println(pl1);
        //и так работает

        System.out.println("1.4.4");
        //тогда edu.khityaev.main.Main(1.1) сломается. надо только поменять public на private и удалить конструктор без параметров
        //а вообще и так работает //поменял и из 1.1 убрал
        House h1 = new House(2);
        System.out.println(h1);
        House h2 = new House(31);
        System.out.println(h2);
        House h3 = new House(95);
        System.out.println(h3);

        System.out.println("1.4.5");
        //в конструкторе с тремя аргументами фамилия-имя, потому что уже так применялось
        //про цепочки конструкторов забыл напрочь, надо переделывать. вроде поменял местами, где понял возможность этого
        Name n1 = new Name("Клеопатра");
        Name n2 = new Name("Пушкин", "Сергей", "Александтрович");
        Name n3 = new Name("Маяковский", "Владимир");
        Name n4 = new Name("Бонифатьевич", "Христофор");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        System.out.println("1.4.6");
        Human hu1 = new Human("Лев");
        Human hu2 = new Human(new Name("Пушкин", "Сергей"), hu1);
        Human hu3 = new Human("Александр", hu2);
        System.out.println(hu1);
        System.out.println(hu2);
        System.out.println(hu3);

        System.out.println("1.4.7");
        Student s1 = new Student("Вася", 3,4,5);
        Student s2 = new Student("Максим");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("1.4.8");
        //пока нету. всё ещё слишком сомневаюсь о том как надо было делать 1.3.3. потом доделаю
        //сделал как-то 1.3.3, но всё равно не знаю, как сделать это, ибо нужно два варарга, а так нельзя
        //видимо нужно переделать с дополнительной сущностью Ways
        //Сущность создана, методы созданы, конструкторы созданы. Но не работает. Не понимаю, почему
    }
}
