import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariablePoint {
    private final int[] coordinates;
    private ArrayList<PointProperty> properties = new ArrayList<PointProperty>();
    public VariablePoint(int[] coordinates, ArrayList<PointProperty> properties) {
        this(coordinates);
        this.properties = properties;
    }

    public VariablePoint(int...coordinates){
        if(coordinates.length>3) throw new IllegalArgumentException("point must have 1 to 3 coordinates");
        this.coordinates = coordinates;
    }

    public VariablePoint(int[] coordinates, PointProperty...properties){
        this(coordinates);
        this.properties = new ArrayList<>(List.of(properties));
    }
    public void addProperty(PointProperty property){
        for(PointProperty currentProperty: properties) {
            if(property.getPropertyName()==currentProperty.getPropertyName()){
                throw new IllegalArgumentException("the point already has this type of property");
            }
        }
        properties.add(property);
    }


    @Override
    public String toString() {
        return "Point " + Arrays.toString(coordinates) + " with properties " + properties;
    }
}
