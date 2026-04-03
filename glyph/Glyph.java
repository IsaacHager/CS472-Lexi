package glyph;
import window.Window;

/**
 * A Glyph is the most basic element of a document, which
 * can be implemented in many different ways (e.g. a character,
 * a container like a row or a column, etc.).
 *
 * Functions as the 'Component' part of the Composite(163) pattern.
 * @author Isaachager
 */
public abstract class Glyph {
    protected Bounds bounds;
    protected Glyph parent;

    protected Glyph() {
        bounds = new Bounds(new Point(0, 0), 0, 0);
    }

    /**
     * Draws this Glyph on the given window
     * @param window
     */
    public abstract void draw(Window window);
    
    /**
     * This Glyph sets its bounds according to the given window
     * @param window
     */
    public abstract void setSize(Window window);

    /**
     * This Glyph recursively arranges its children and sets its own size accordingly
     */
    public void compose() {}

    /**
     * This glyph navigates to the root and calls compose
     */
    public void composeRoot() {
        Glyph next = this;
        while (next.parent != null) {
            next = next.parent;
        }
        next.compose();
    }

    /**
     * Returns updated cursor bounds given a child
     * @param cursor
     * @param child
     * @return cursor bounds
     */
    public Bounds cursorNext(Bounds cursor, Glyph child) {
        return cursor;
    }


    /**
     * Adjusts cursor before placing child
     * @param cursor
     * @param child
     * @return cursor bounds
     */
    public Bounds adjustCursor(Bounds cursor, Glyph child) {
        return cursor;
    }

    /**
     * Inserts a child Glyph at a given position
     * @param g
     * @param pos
     */
    public void insert(Glyph g, int pos) {
        throw new IllegalCallerException("Cannot call insert on Glyph");
    }

    /**
     * Removes and returns the Glyph at the given position
     * @param pos
     */
    public Glyph remove(int pos) { 
        throw new IllegalCallerException("Cannot call remove on Glyph");
    }

    /**
     * Returns the Glyph at the given position in the child list
     * @param pos
     */
    public Glyph childAt(int pos) {
        throw new IllegalCallerException("Cannot call childAt on Glyph");
    }

    /**
     * Sets starting position (top-left corner) for this Glyph
     * @param p
     */
    public void setPosition(Point p) {
        bounds.setPosition(p);
    }

    /**
     * Returns a copy of this Glyph's bounds
     * @return bounds
     */
    public Bounds bounds() {
        return new Bounds(bounds);
    }

    /**
     * Sets this Glyph's bounds
     * @param bounds
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    /**
     * Returns the window associated with this Composition
     * @return window
     */
    public Window window() {
        throw new IllegalCallerException("Cannot call window on Glyph");
    }
}