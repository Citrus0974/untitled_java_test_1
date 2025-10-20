public class Triangle extends Figure{
    private final Point p2;
    private final Point p3;
    public Triangle(Point p1, Point p2, Point p3){
        super(p1);
        if(p2==null || p3==null) throw new IllegalArgumentException();
        this.p2=p2;
        this.p3=p3;
    }
    @Override
    public int area() {
        Point p1 = super.getBase();
        int halfP = new ClosedPolyline(p1, p2, p3).fullLength()/2;
        return (int) Math.sqrt(halfP*
                (halfP- new Line(p1, p2).lineLength())*
                (halfP- new Line(p2, p3).lineLength())*
                (halfP- new Line(p3, p1).lineLength()));
    }
}
