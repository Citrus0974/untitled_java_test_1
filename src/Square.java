public class Square extends Rectangle{

    public Square(Point base, int size) {
        super(base, size, size);
        if(size<=0) throw new IllegalArgumentException("Negative size of square is not allowed");
    }
    public Square(int baseX, int baseY, int size) {
        this(new Point(baseX, baseY), size);
    }

    public int getSize() {
        return super.getHeight();
    }

//    public void setSize(int size) {
//        if(size>0) this.size = size;
//        else throw new IllegalArgumentException("Negative size of square is not allowed");
//    }

    public Polyline toPolyline(){
        Point base = super.getBase();
        Point p2 = new Point(base.getX()+super.getHeight(), base.getY());
        Point p3 = new Point(base.getX()+super.getHeight(), base.getY()+super.getHeight());
        Point p4 = new Point(base.getX(), base.getY()+super.getHeight());
        return new Polyline(base, p2, p3, p4);
    }


    @Override
    public String toString(){
        return "Квадрат в точке " + super.getBase() + " со стороной " + super.getHeight();
    }

    @Override
    public int area() {
        return super.area();
    }
}


