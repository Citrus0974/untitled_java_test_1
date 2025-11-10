package edu.khityaev.roads;

import java.util.Objects;

public class WayToTown {
    private Town destination;
    private int cost;

    public WayToTown(Town city, int cost){
        this.destination=city;
        this.cost=cost;

    }

    public Town getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return destination.getName() + ":" + cost;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WayToTown wayToTown)) return false;
        return cost == wayToTown.cost && destination == wayToTown.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination.getName(), cost);
    }
}
