public class Start1_3 {
    public static void main(String []args){
        System.out.println("1.3.1");
        Student s1 = new Student("Вася", 3,4,5);
        Student s2 = new Student("Петя");
        s2.marks=s1.marks;
        s2.marks[0]=5;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("ссылка на один и тот же массив скопировалась, а не само содержание массива");
        Student s3 = new Student("Андрей");
        s3.marks=new int[s1.marks.length];
        for(int i=0; i<s3.marks.length; i++){
            s3.marks[i]=s1.marks[i];
        }
        s3.marks[0]=2;
        System.out.println(s3);
        System.out.println(s1);

        System.out.println("1.3.2");
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Polyline pl1 = new Polyline(p1, p2, p3);
        System.out.println(pl1); //надо дописать остальные для приличия потом будет

        System.out.println("1.3.3");
        //двумерный массив way[][2]? и потом всё задавать руками, плюс могут остаться пустыми? или можно массивы запихнуть как варарги?;
        //надо через ArrayList<>, щас сделаю
        Town a = new Town("A");
        Town b = new Town("B");
        Town c = new Town("C");
        Town d = new Town("D");
        Town e = new Town("E");
        Town f = new Town("F");
        System.out.println(a);
        a.addTownWay(b, 5);
        b.addTownWay(a, 5);
        a.addTownWay(d, 6);
        d.addTownWay(a, 6);
        a.addTownWay(f, 1);
        f.addTownWay(a, 1);
        b.addTownWay(c, 3);
        c.addTownWay(b, 3);
        b.addTownWay(f, 1);
        f.addTownWay(b, 1);
        c.addTownWay(d, 4);
        d.addTownWay(c, 4);
        d.addTownWay(e, 2);
        e.addTownWay(d, 2);
        e.addTownWay(f, 2);
        f.addTownWay(e, 2);
        System.out.println(a);
        System.out.println(f);


        System.out.println("1.3.4");
        //как использовать массив вместо списка? каждый раз генерировать новый и перекопировать?
        //и вообще добавлять в конструкторе сотрудника как-то сомнительно... и при замене ниче не удалится... кривая страшная инкапсуляция потом будет
        Department dep1 = new Department("IT");
        Employee e1 = new Employee("Петров", dep1);
        Employee e2 = new Employee("Козлов", dep1);
        Employee e3 = new Employee("Сидоров", dep1);
        dep1.boss=e2;
        e3.department.getAllEmployees();
    }
}
