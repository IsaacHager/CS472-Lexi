package glyph;
public class Bounds {
    private Point position;
    private int width;
    private int height;

    public Bounds(Point pos, int width, int height) {
        this.position = pos;
        this.width = width;
        this.height = height;
    }

    public Bounds(Bounds b) {
        position = new Point(b.position());
    }

    public Point position() {
        return position;
    }

    public void setPosition(Point p) {
        position = p;
    }

    public int width() {
        return width;
    }

    public void setWidth(int x) {
        width = x;
    }

    public int height() {
        return height;
    }

    public void setHeight(int y) {
        height = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position: ");
        sb.append(position);
        sb.append(", Width: ");
        sb.append(width);
        sb.append(", Height: ");
        sb.append(height);
        return sb.toString();
    }
}
