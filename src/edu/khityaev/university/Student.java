package edu.khityaev.university;

import edu.khityaev.exception.WrongMarkException;
import edu.khityaev.structure.Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable {
    private String name = "";
    private List<Integer> marks = new ArrayList<>();
    private MarkCriteria criteria;

    public Student(String name, int...marks){
        this(name, null, marks);
    }

    public Student(String name, MarkCriteria criteria, int...marks){
        this.criteria=criteria;
        this.name=name;
        if(criteria==null){
            for(Integer mark : marks){
                this.addMark(mark);
            }
        } else{
            for (int mark : marks) {
                if (!criteria.isMarkCorrect(mark)) throw new WrongMarkException(this.name);
            }
            for(Integer mark : marks){
                this.addMark(mark);
            }
        }
    }

    public  Student(Student student){
        if(student==null) throw new NullPointerException("cannot copy null object");
        this.name = student.name;
        this.marks = student.marks;
        this.criteria = student.criteria;
    }

    public List getMarks() {
        return marks;
    }

    public void addMark(int mark){
        if(this.criteria==null){
            marks.add(mark);
            return;
        }
        if (!criteria.isMarkCorrect(mark)) throw new WrongMarkException(this.name);
        marks.add(mark);
     }

    public void addMarks(int...marks){
        if(marks.length==1) throw new IllegalArgumentException("must be at least 1 mark");
        List<Integer> newMarks = new ArrayList<>();
        for(int i=0; i<marks.length; i++){
            if(criteria==null){
                newMarks.add(marks[i]);
            } else {
                if (!criteria.isMarkCorrect(marks[i])) throw new WrongMarkException(this.name);
                newMarks.add(marks[i]);
            }
        }
        this.marks.addAll(newMarks);
    }

    public void setMarks(List<Integer> marks) {
        for(Integer mark : marks){
            if (!criteria.isMarkCorrect(mark)) throw new WrongMarkException(this.name);
        }
        this.marks = marks;
    }

    public double averageMark(){
        if(this.marks.isEmpty()){
            return 0;
        }
        int all=0;
        int sz=marks.size();
        for (Integer mark : marks) all += mark;
        return (double) all/sz;
    }

    public boolean isExcellent(){
        if(this.marks.isEmpty()) return false;
        for (Integer mark : this.marks) {
            if (mark < 5) return false;
        }
        return true;
    }



    @Override
    public String toString() {
        if (this.marks == null) return name;
        if (!this.marks.isEmpty()) {
            String out = name + ": [";
            for (int i = 0; i < this.marks.size() - 1; i++) {
                out += this.marks.get(i);
                out += "; ";
            }
            return out + this.marks.getLast() + "]";
        } else return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(averageMark(), student.averageMark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageMark());
    }

    @Override
    public <T> int compare(T value) {
        Student newStudent = (Student) value;
        if(this.averageMark() == newStudent.averageMark()) return 0;
        if(this.averageMark() > newStudent.averageMark()) return 1; else return -1;
    }
}
