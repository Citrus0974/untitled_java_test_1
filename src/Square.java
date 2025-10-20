public class Square extends Figure{
    private final int size;

    public Square(Point base, int size) {
        super(base);
        if(size<=0) throw new IllegalArgumentException("Negative size of square is not allowed");
        this.size = size;
    }
    public Square(int baseX, int baseY, int size) {
        this(new Point(baseX, baseY), size);
    }

    public int getSize() {
        return size;
    }

//    public void setSize(int size) {
//        if(size>0) this.size = size;
//        else throw new IllegalArgumentException("Negative size of square is not allowed");
//    }

    public Polyline toPolyline(){
        Point base = super.getBase();
        Point p2 = new Point(base.getX()+size, base.getY());
        Point p3 = new Point(base.getX()+size, base.getY()+size);
        Point p4 = new Point(base.getX(), base.getY()+size);
        return new Polyline(base, p2, p3, p4);
    }


    @Override
    public String toString(){
        return "Квадрат в точке " + super.getBase() + " со стороной " + size;
    }

    @Override
    public int area() {
        return size*size;
    }
}


