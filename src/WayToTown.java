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
}
