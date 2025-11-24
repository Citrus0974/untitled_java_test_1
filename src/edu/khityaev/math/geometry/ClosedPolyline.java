package edu.khityaev.math.geometry;

import java.util.ArrayList;

public class ClosedPolyline extends Polyline{
    public ClosedPolyline(Point...points){
        super(points);
    }

    @Override
    public int length(){
        if(super.getSegmentCount()<3) return super.length();
        int res = super.length();
        Line tmp = new Line(this.getPoint(0), this.getPoint(this.getSegmentCount()-1));
        res+=tmp.length();
        return res;
    }

    protected ArrayList<Line> toLines(){
        ArrayList<Line> linesList = super.toLines();
        linesList.add(new Line(this.getPoints().get(this.getPoints().size()-1), this.getPoints().getFirst()));
        return linesList;
    }
}
