package edu.khityaev.roads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Town {
    private String name;
    private List<WayToTown> roads = new ArrayList<>();


    public Town(String name, WayToTown...roads){
        this.name=name;
        for(int i=0; i< roads.length; i++){
            this.putRoad(roads[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WayToTown> getRoads() {
        return new ArrayList<>(roads);
    }

    public void setRoads(List<WayToTown> roads) {
        for(int i=0; i< roads.size(); i++){
            this.putRoad(roads.get(i));
        }
    }

    public void putRoad(WayToTown wayToTown) {
        for (WayToTown currWayToTown : roads) {
            if (currWayToTown.getDestination() == wayToTown.getDestination()) {
                wayToTown.setCost(currWayToTown.getCost());
                return;
            }
        }
        this.roads.add(wayToTown);
    }
    public void putRoad(Town destination, int cost){
        putRoad(new WayToTown(destination, cost));
    }
    public boolean containsRoad(Town destination){
        for (WayToTown wayToTown : roads) {
            if(wayToTown.getDestination()==destination){
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString(){
        return "edu.khityaev.roads.Town: " + name + ", Ways list: " + roads;
    }

    @Override
    public final boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Town town)) return false;
        if(town.getRoads().size() != town.getRoads().size()) return false;
        return Objects.equals(name, town.getName()) && roads.containsAll(town.getRoads());
    }

    @Override
    public int hashCode() {
        int res = 0;
         for(int i=0; i<getRoads().size(); i++){
             res += getRoads().get(i).hashCode();
         }
        return Objects.hash(name, res);
    }
}
