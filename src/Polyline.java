public class Polyline {
    public Point[] points;

    public Polyline(Point...points){
        this.points=points;
    }
    public Polyline(){
    }

    public void addPoint(Point point){
        int sz = points.length;
        Point[] newPoints = new Point[sz+1];
        System.arraycopy(points, 0, newPoints, 0, sz);
        newPoints[sz] = point;
        points = newPoints;
    }
    public void addPoint(Point...newPoints) {
        for(int i=0; i<newPoints.length; i++){
            this.addPoint(newPoints[i]);
        }
    }

    public Point getPoint(int index){
        if(index<this.getSegmentCount()){
            return this.points[index];
        } else throw new IllegalArgumentException();
    }
    public int getSegmentCount(){
        return this.points.length;
    }

    public void changePoint(int index, Point point){
        if(index>points.length-1) throw new ArrayIndexOutOfBoundsException();
        points[index]=point;
    }

    public int fullLength(){
        int res=0;
        Line tmp;
        int sz = points.length;
        for(int i=0; i<sz-1; i++){
            tmp=new Line(points[i], points[i+1]);
            res+= tmp.lineLength();
        }
        return res;
    }

    @Override
    public String toString(){
        String out = "[";
        for(int i =0; i<this.points.length-1; i++){
            out+= this.points[i];
            out+=", ";
        }
        return out + this.points[this.points.length-1] + "]";
    }
}
