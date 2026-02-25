package glyph;
import window.Window;

/**
* A Glyph is the most basic element of a document, which
* can be implemented in many different ways (e.g. a character,
* a container like a row or a column, etc.).
* @author Isaachager
* @version 1.0
*/
public abstract class Glyph {
    protected Bounds bounds;

    protected Glyph() {
        bounds = new Bounds(new Point(0, 0), 0, 0);
    }

    public void draw(Window window) {
        // TODO: implement method
    }

    public void insert(Glyph g, int pos) {

    }

    public void setPosition(Point p) {
        bounds.setPosition(p);
    }

    public Bounds bounds() {
        return bounds;
    }

    public void setBounds(Bounds b) {
        bounds = b;
    }

    public void setSize(Window w) {
    }

    public void compose() {

    }

    // Maybe include compose() and composeRoot()?
}