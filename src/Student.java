public class Student {
    public String name = "";
    int[] marks;

    public Student(String name, int...marks){
        this.name=name;
        this.marks=marks;
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
    public String toString(){
        if(this.marks.length>0){
            String out=name + ": [";
            for(int i=0; i<this.marks.length-1; i++){
                out+= this.marks[i];
                out+= "; ";
            }
            return out + this.marks[this.marks.length-1] + "]";
        } else return name;
    }
}
