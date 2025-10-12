import java.util.ArrayList;


public class Town {
    public String name = "";
    public ArrayList<WayToTown> ways = new ArrayList<>();

    public Town(String name){
        this.name = name;
    }
    public Town(String name, WayToTown...towns){
        this(name);
        for(int i=0; i<towns.length; i++){
            this.addTownWay(towns[i]);
        }
    }

    public void addTownWay (WayToTown townWay){
        WayToTown currWay;
        for(int i=0; i<this.ways.size(); i++){
            currWay = this.ways.get(i);
            if(currWay.getTown() == townWay.getTown()){
                if(currWay.getCost() == townWay.getCost()){
                    break;
                } else{
                    currWay.setCost(townWay.getCost());
                    break;
                }
            }
            this.ways.add(townWay);
            townWay.getTown().addTownWay(new WayToTown(this, townWay.getCost()));
        }

    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        String out = "Город " + this.name;
        if (ways!=null){
            out+= ". Список путей: \n";
            WayToTown tmp;
            for(int i=0; i<ways.size(); i++){
                tmp = this.ways.get(i);
                out = out  + tmp.getTown().getName() + ", цена: " + tmp.getCost() + "\n";
            }
        }
        return out;
    }
}


