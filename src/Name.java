public class Name {
    public String fam = "";
    public String nam = "";
    public String otch = "";

    public Name(){
    }
    public Name(String surname, String name, String otchestvo){
        this(surname, name);
        this.otch = otchestvo;
    }
    public Name(String name){
        this.nam = name;
    }
    public Name(String surname, String name){
        this(name);
        this.fam = surname;
    }

    @Override
    public String toString(){
        String out = "";
        if(fam!="") out = fam + " ";
        if(nam!="") out = out + nam;
        if(otch!="") out = out + " " + otch;
        return out;
    }
}
