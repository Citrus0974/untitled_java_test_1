public class WayToTown {
    private Town town;
    private int cost;

    public WayToTown(Town town, int cost){
        this.town=town;
        this.cost=cost;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        if(town!=null){
            this.town = town;
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}


