public class Cat implements Meowing{
    public String name;

    public Cat(String name){
        this.name=name;
    }


    public void meow(int amount){
        if(amount>1){
            String out= name + ": ";
            for(int i=0; i<amount-1; i++){
                out+="meow-";
            }
            out+="meow!";
            System.out.println(out);
        } else this.meow();
    }
    public void meow(){
        System.out.println(name + ": meow!");
    }

    @Override
    public String toString(){
        return "kot: " + name;
    }

}
