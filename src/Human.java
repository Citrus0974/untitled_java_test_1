public class Human{
    public Name name;
    public int height = 0;
    public Human father;

    public Human(Name name, int h){
        this(name);
        this.height = h;
    }
    public Human(){
        this.name = new Name();
    }
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
        return this.name.nam;
    }
    public String getOtch(){
        return this.name.otch;
    }
    public String getSurname(){
        if (this.name.fam=="") return this.father.name.fam;
        else return this.name.fam;
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
        if (name.nam!="") out = out + " " + name.nam;
        if (name.otch=="") out = out + " " + father.name.nam + "ович";
        if (height!=0) out = out + ", рост: " + height;
        return out;
    }
}

