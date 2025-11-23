package edu.khityaev.main;

import edu.khityaev.exception.LostConnectionException;
import edu.khityaev.office.ExampleConnector;
import edu.khityaev.office.RemoteConnection;
import edu.khityaev.university.Mark1or0;
import edu.khityaev.university.Marks2to5;
import edu.khityaev.university.Student;
import edu.khityaev.exception.WrongMarkException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start4_2 {
    public static void main(String[] args) {
        System.out.println("4.2.1");
        connectTest();


        System.out.println("4.2.2");
        System.out.println(divisionOfStrings("fdg", "awf", "123", "55", "34"));

        System.out.println("4.2.3");
        List<Student> lst = new ArrayList<Student>();
        lst.add(new Student("st1", new Marks2to5()));
        lst.add(new Student("st2", new Mark1or0()));
        lst.add(new Student("st3", new Mark1or0()));
//        addRandomMarkToStudents(lst);

        System.out.println("4.2.4");
        ExampleConnector exc1 = new ExampleConnector();
        try{
            exc1.makeConnection(new RemoteConnection("edudu"));

        } catch (LostConnectionException e) {
            exc1.unregister();
            return;
        } catch (RuntimeException e){
            return;
        }

    }

    public static void connectTest(){
        RemoteConnection rm = new RemoteConnection("ermakov.edu");
        try{
            for(int i=0; i<10; i++){
                System.out.println(rm.requestConnectionData());
            }
        } catch (LostConnectionException e) {
            System.out.println("random exception of lost connection");
//            throw new RuntimeException(e);
        } finally {
            rm.closeConnection();
            System.out.println("connection closed");
        }
    }

    public static double divisionOfStrings(String...strings){
        double res;
        List<Double> list = new ArrayList<>();
        if(strings == null) throw new NullPointerException();
        if(strings.length<2) throw new IllegalArgumentException("must be at least 2 numbers");
        double tmp = 1;
        for(int i=0; i<strings.length; i++){
            try{
                tmp = Integer.parseInt(strings[i]);
            } catch (NumberFormatException e){
                continue;
            }
            list.add(tmp);
        }
        if(list.size()<2) throw new IllegalArgumentException("must be at least 2 numbers");
        res= list.getFirst();
        for(int i=1; i<list.size(); i++){
            tmp=list.get(i);
            if(tmp==0) throw new ArithmeticException();
            res /= tmp;
//            try{
//                res /= tmp;
//            } catch (ArithmeticException e){
//                throw new IllegalArgumentException("cannot divide", e);
//            }
        }
        return res;
    }

    public static void addRandomMarkToStudents(List<Student> students){
        //Нужно переделать, добавив копирующий конструктор в студента. (вроде переделал)
        Random rnd = new Random();
        int mark = rnd.nextInt(1, 10);
        List<Student> newStudents = new ArrayList<>(students);
        for (Student value : students) {
            newStudents.add(new Student(value));
        }
        for(Student student : newStudents){
            try{
                student.addMark(mark);
            } catch (WrongMarkException e){
                throw new IllegalArgumentException("wrong mark", e);
//                return ;
            }
        }
        for(Student student : students) {
            student.addMark(mark);
        }
    }

}
