public class Rectangle extends Figure{
    private final int height;
    private final int width;

    public Rectangle(Point base, int width, int height) {
        super(base);
        if(height<=0 || width<=0) throw new IllegalArgumentException();
        this.height=height;
        this.width=width;
    }
    public Rectangle(Point base, int size) {
        this(base, size, size);
    }

    public Rectangle(int baseX, int baseY, int width, int height) {
        this(new Point(baseX, baseY), width, height);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isSquare(){
        return width == height;
    }
    @Override
    public int area() {
        return width*height;
    }
}
