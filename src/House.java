public class House {
    final int floors;

    public House(int floors){
        if (floors>0){
            this.floors=floors;
        } else throw new IllegalArgumentException();
    }
    public House(){
        this(1);
    }

    @Override
    public String toString(){
        String out = "дом с " + floors + " этаж";
//        switch (floors%10){
//            case 0, 2, 3, 4, 5, 6, 7, 8, 9,: out+= "ами"; break;
//            case 1: out+= "ом"; break;
//            case 3: out
//        }
        if(floors%10==1) out+="ом";
        else out+="ами";

        return out;
    }
}
