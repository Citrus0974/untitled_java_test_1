package edu.khityaev.math.geometry;

public abstract class PointProperty {
    private final String propertyName;

    public PointProperty(String propertyName){
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    @Override
    public String toString() {
        return propertyName + ": ";
    }
}
