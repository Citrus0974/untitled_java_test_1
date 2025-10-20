
public abstract class Figure {
    private Point base;
    public Figure(Point base){
        if(base == null) throw new IllegalArgumentException();
        this.base = base;
    }

    public abstract int area();

    public Point getBase() {
        return base;
    }
}
