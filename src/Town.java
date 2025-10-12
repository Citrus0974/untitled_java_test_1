import java.util.ArrayList;
import java.util.List;

public class Town {
    public String name = "";
    public List<Town> townWays = new ArrayList<>();
    public List<Integer> costs = new ArrayList<>();

    public Town(String name){
        this.name = name;
    }

    public void addTownWay (Town town, int cost){
        this.townWays.add(town);
        this.costs.add(cost);
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        String out = "Город " + this.name;
        int sz = townWays.size();
        if(sz != 0) out+= ". Список путей: \n";
        for(int i=0; i<sz; i++){
            out = out  + this.townWays.get(i).getName() + ", цена: " + this.costs.get(i) + "\n";
        }
        return out;
    }
}


