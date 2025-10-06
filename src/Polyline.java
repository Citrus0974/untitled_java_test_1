public class Polyline {
    public Point[] points;

    public Polyline(Point...points){
        this.points=points;
    }
    public Polyline(){

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
