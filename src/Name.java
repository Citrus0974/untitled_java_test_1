public class Name {
    private String fam;
    private String nam;  //или всё-таки final?
    private String otch;

//    public Name(){
//    }
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

    public String getFam() {
        return fam;
    }

    public String getNam() {
        return nam;
    }

    public String getOtch() {
        return otch;
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
