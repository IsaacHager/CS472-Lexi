package glyph;

import window.*;

/**
 * Represents a glyph that can be composed. That is,
 * it can format itself in relation to its children.
 * 
 * Functions as the "Component" part of the Decorator(175) pattern.
 * @author Isaachager
 */
public abstract class Composition extends CompositeGlyph {
    protected Compositor comp;
    protected Window window;

    protected Composition() {
        this.comp = new SimpleCompositor();
        comp.setComposition(this);
    }

    protected Composition(Window w) {
        this();
        setWindow(w);
    }

    /**
     * Sets the window to use
     * @param window
     */
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public Window window() {
        return window;
    }

    @Override
    public void compose() {
        comp.compose();
    }

    @Override
    public void insert(Glyph g, int pos) {
        super.insert(g, pos);
        // compose();
    }

    @Override
    public Glyph remove(int pos) {
        Glyph g = super.remove(pos);
        // compose();
        return g;
    }
}
