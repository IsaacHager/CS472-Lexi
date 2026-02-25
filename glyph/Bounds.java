package glyph;

/**
 * Represents an area that begins at a point and extends for to a width and height.
 * @author Isaachager
 */
public class Bounds {
    private Point position;
    private int width;
    private int height;

    /**
     * Basic constructor
     * @param pos top-left corner
     * @param width
     * @param height
     */
    public Bounds(Point pos, int width, int height) {
        this.position = pos;
        this.width = width;
        this.height = height;
    }

    /**
     * Copy constructor
     * @param bounds
     */
    public Bounds(Bounds bounds) {
        position = new Point(bounds.position());
        width = bounds.width();
        height = bounds.height();
    }

    /**
     * Returns a copy of position
     * @return position
     */
    public Point position() {
        return new Point(position);
    }

    /**
     * Sets the position
     * @param position
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Returns width
     * @return width
     */
    public int width() {
        return width;
    }

    /**
     * Sets the width
     * @param width width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Returns height
     * @return height
     */
    public int height() {
        return height;
    }

    /**
     * Sets the height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
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
