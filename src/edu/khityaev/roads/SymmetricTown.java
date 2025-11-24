package edu.khityaev.roads;

public class SymmetricTown extends Town{

    public SymmetricTown(String name, WayToTown... roads) {
        super(name, roads);
    }
    public void putRoad(WayToTown road){
        super.putRoad(road);
        Town target=road.getDestination();

        if(target.containsRoad(this)) return;
        target.putRoad(this, road.getCost());
    }


}
