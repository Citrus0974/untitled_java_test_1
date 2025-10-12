public class Square {
    private Point base;
    private int size;

    public Square(Point base, int size) {
        this.base = base;
        this.size = size;
    }
    public Square(int baseX, int baseY, int size) {
        this(new Point(baseX, baseY), size);
    }

    public Polyline toPolyline(){
        Point p2 = new Point(base.getX()+size, base.getY());
        Point p3 = new Point(base.getX()+size, base.getY()+size);
        Point p4 = new Point(base.getX(), base.getY()+size);
        return new Polyline(base, p2, p3, p4);
    }


    @Override
    public String toString(){
        return "Квадрат в точке " + base + " со стороной " + size;
    }
}


