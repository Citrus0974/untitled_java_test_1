public class ClosedPolyline extends Polyline{
    public ClosedPolyline(Point...points){
        super(points);
    }

    public int fullLength(){
        int res = super.fullLength();
        Line tmp = new Line(this.getPoint(0), this.getPoint(this.getSegmentCount()-1));
        res+=tmp.lineLength();
        return res;
    }
}
