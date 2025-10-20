public class Rectangle extends Square{
    private final int height;

    public Rectangle(Point base, int width, int height) {
        super(base, width);
        if(height<=0) throw new IllegalArgumentException();
        this.height=height;
    }

    public Rectangle(int baseX, int baseY, int width, int height) {
        this(new Point(baseX, baseY), width, height);
    }

    @Override
    public int area() {
        return super.getSize()*height;
    }
}
