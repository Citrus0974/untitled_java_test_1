public final class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z=z;
    }
    public Point3D(Point3D point){
        this(point.getX(), point.getY(), point.getZ());
    }
    public Point3D(Point point){
        this(point.getX(), point.getY(), 0);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x +", " + y + ", " + z + "}";
    }
}
