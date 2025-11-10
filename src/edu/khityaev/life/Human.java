package edu.khityaev.life;

public class Human{
    private Name name;
    private int height = 0;
    private Human father;

    public Human(Name name, int h){
        this(name);
        this.height = h;
    }
//    public edu.khityaev.life.Human(){
//        this.name = new edu.khityaev.life.Name();
//    }
    public Human(Name name, int h, Human father){
        this(name, h);
        this.father = father;
    }
    public Human(Name name, Human father){
        this(name);
        this.father = father;
    }
    public Human(Name name){
        this.name = name;
    }
    public Human(String name){
        this(new Name(name));
    }
    public Human(String name, Human father){
        this(new Name(name), father);
    }


    public String getNameString(){
        return this.name.getNam();
    }
    public String getOtch(){
        return this.name.getOtch();
    }
    public String getSurname(){
        if (this.name.getFam()=="") return this.father.name.getFam();
        else return this.name.getFam();
    }

    public Name getName() {
        return name;
    }

    public Human getFather() {
        return father;
    }

    @Override
    public String toString(){
        String out = "";
        if (father==null){
            out += name;
            if (height!=0) out = out + ", рост: " + height;
            return out;
        }
//        if (name.fam=="") out += father.name.fam; else out+= name.fam;
        out+=this.getSurname();
        if (name.getNam()!="") out = out + " " + name.getNam();
        if (name.getOtch()=="") out = out + " " + father.name.getNam() + "ович";
        if (height!=0) out = out + ", рост: " + height;
        return out;
    }
}

