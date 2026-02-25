package glyph;

/**
 * Represents a 2 dimensional coordinate.
 * @author Isaachager
 */
public class Point {
    private int x;
    private int y;

    /**
     * Basic constructor
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor
     * @param p
     */
    public Point(Point p) {
        x = p.x();
        y = p.y();
    }

    /**
     * Returns x coordinate
     * @return x
     */
    public int x() {
        return x;
    }

    /**
     * Returns y coordinate
     * @return y
     */
    public int y() {
        return y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append("]");
        return sb.toString();
    }
}
