public class Start1_3 {
    public static void main(String []args){
        System.out.println("1.3.1");
//        Student s1 = new Student("Вася", 3,4,5);
//        Student s2 = new Student("Петя");
//        s2.marks=s1.marks;
//        s2.marks[0]=5;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println("ссылка на один и тот же массив скопировалась, а не само содержание массива");
//        Student s3 = new Student("Андрей");
//        s3.marks=new int[s1.marks.length];
//        for(int i=0; i<s3.marks.length; i++){
//            s3.marks[i]=s1.marks[i];
//        }
//        s3.marks[0]=2;
//        System.out.println(s3);
//        System.out.println(s1);
        //пришлось скрыть из-за закрытия полей согласно 1.6.8

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
        System.out.println(a);
        Town b = new Town("B", new WayToTown(a, 5));
        Town c = new Town("C", new WayToTown(b, 3));
        Town d = new Town("D", new WayToTown(c,  4), new WayToTown(a, 6));
        Town e = new Town("E", new WayToTown(d, 2));
        Town f = new Town("F", new WayToTown(a, 1), new WayToTown(b, 1), new WayToTown(e, 2));
        System.out.println(a);
        System.out.println(d);
        a.putRoad(new WayToTown(b, 5));
        System.out.println(a);
        //попытка номер два через дополнительную сущность WayToTown
        //попытка не увенчалась успехом. Я не понимаю, почему в методе addTownWay оно спотыкается даже при пустом списке



        System.out.println("1.3.4");
        //как использовать массив вместо списка? каждый раз генерировать новый и перекопировать?
        //и вообще добавлять в конструкторе сотрудника как-то сомнительно... и при замене ниче не удалится... кривая страшная инкапсуляция потом будет
        Department dep1 = new Department("IT");
        Employee e1 = new Employee("Петров", dep1);
        Employee e2 = new Employee("Козлов", dep1);
        Employee e3 = new Employee("Сидоров", dep1);
//        dep1.boss=e2;
        e3.department.getAllEmployees();
    }
}
