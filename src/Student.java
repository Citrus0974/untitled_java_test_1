public class Student {
    public String name = "";
    int[] marks;

    public Student(String name, int...marks){
        this.name=name;
        this.marks=marks;
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
