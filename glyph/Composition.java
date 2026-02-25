package glyph;

import window.*;

/**
 * Represents a glyph that can be composed. That is,
 * it can format itself in relation to its children.
 * @author Isaachager
 */
public abstract class Composition extends CompositeGlyph {
    private Compositor comp;
    private Window window;

    protected Composition() {
        super();
        this.comp = new SimpleCompositor();
        comp.setComposition(this);
    }

    /**
     * Returns updated cursor bounds given a child
     * @param cursor
     * @param child
     * @return cursor bounds
     */
    public abstract Bounds cursorNext(Bounds cursor, Glyph child);

    /**
     * Returns the window associated with this Composition
     * @return window
     */
    public Window window() {
        return window;
    }

    /**
     * Sets the window to use
     * @param window
     */
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public void compose() {
        comp.compose();
    }
}
