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
    protected int x;
    protected int y;

    public void draw(Window window) {
        // TODO: implement method
    }

    public void insert(Glyph g, int pos) {

    }

    // Maybe include compose() and composeRoot()?
}