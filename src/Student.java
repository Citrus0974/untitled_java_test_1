import java.util.ArrayList;

public class Student {
    private String name = "";
    private int[] marks;
    private MarkCriteria criteria;

    public Student(String name, int...marks){
        this(name, null, marks);
    }

    public Student(String name, MarkCriteria criteria, int...marks){
        this.criteria=criteria;
        this.name=name;
        if(criteria==null){
            this.marks=marks;
        } else{
            for (int mark : marks) {
                if (!criteria.isMarkCorrect(mark)) throw new IllegalArgumentException("wrong marks");
            }
            this.marks=marks;
        }
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public double averageMark(){
        if(this.marks.length == 0){
            return 0;
        }
        int all=0;
        int sz=marks.length;
        for(int i=0; i<sz; i++) all+=marks[i];
        return all/sz;
    }

    public boolean isExcellent(){
        if(this.marks.length == 0) return false;
        for(int i=0; i<this.marks.length; i++){
            if(marks[i]<5) return false;
        }
        return true;
    }



    @Override
    public String toString() {
        if (this.marks == null) return name;
        if (this.marks.length > 0) {
            String out = name + ": [";
            for (int i = 0; i < this.marks.length - 1; i++) {
                out += this.marks[i];
                out += "; ";
            }
            return out + this.marks[this.marks.length - 1] + "]";
        } else return name;
    }
}
