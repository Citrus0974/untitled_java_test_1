package edu.khityaev.math.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Polyline implements Lengthening, PolygonalChain{
    private List<Point> points = new ArrayList<>();

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
//    public void addPoints(edu.khityaev.math.geometry.Polyline...newPoints) {
//        for(int i=0; i<newPoints.length; i++){
//            for(int j=0; j<newPoints[i].getSegmentCount(); j++){
//                this.addPoint(newPoints[i].getPoint(j));
//            }
//        }
//    }

    public Point getPoint(int index){
        if(index<this.getSegmentCount()){
            return this.points.get(index);
        } else throw new IllegalArgumentException();
    }
    public int getSegmentCount(){
        return this.points.size();
    }

    public List<Point> getPoints() {
        return points;
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

    protected ArrayList<Line> toLines(){
        ArrayList<Line> linesList = new ArrayList<>();
        for(int i=1; i<this.points.size(); i++){
            linesList.add(new Line(this.points.get(i - 1), this.points.get(i)));
        }
        return linesList;
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


    @Override
    public Polyline getPolyline() {
        return this;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Polyline polyline)) return false;
        Polyline polyline1 = (Polyline) o;
        ArrayList<Line> list1 = this.toLines();
        ArrayList<Line> list2 = polyline1.toLines();
        if(list1.size() != list2.size()) return false;
        return list1.containsAll(list2);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(toLines());
    }
}
