import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polyline implements Lengthening{
    public List<Point> points = new ArrayList<>();

    public Polyline(Point...points){
        this.points.addAll(Arrays.asList(points));
    }
    public Polyline(){
    }

    public void addPoint(Point point){
        points.add(point);
    }
    public void addPoint(Point...newPoints) {
        for(int i=0; i<newPoints.length; i++){
            this.addPoint(newPoints[i]);
        }
    }

    public Point getPoint(int index){
        if(index<this.getSegmentCount()){
            return this.points.get(index);
        } else throw new IllegalArgumentException();
    }
    public int getSegmentCount(){
        return this.points.size();
    }

    public void changePoint(int index, Point point){
        if(index>points.size()-1) throw new ArrayIndexOutOfBoundsException();
        points.set(index, point);
    }

    public void setPoints(List<Point> points) {
        if(points.size()<=2)
        this.points = points;
    }

    public int length(){
        int res=0;
        Line tmp;
        int sz = points.size();
        for(int i=0; i<sz-1; i++){
            tmp=new Line(points.get(i), points.get(i + 1));
            res+= tmp.length();
        }
        return res;
    }

    @Override
    public String toString(){
        String out = "[";
        for(int i =0; i<this.points.size()-1; i++){
            out+= this.points.get(i);
            out+=", ";
        }
        return out + this.points.get(this.points.size() - 1) + "]";
    }
}
