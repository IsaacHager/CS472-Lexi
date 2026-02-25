package glyph;

import window.Window;
/**
 * 
 */
public class Composition extends CompositeGlyph {
    private Compositor comp;
    private Window window;

    public Composition() {
        super();
        this.comp = new SimpleCompositor();
        comp.setComposition(this);
    }

    public void compose() {
        comp.compose();
    }

    public Window window() {
        return window;
    }

    public void setWindow(Window w) {
        window = w;
    }

    public void adjustBounds(Glyph child) {
        
    }

    public Point nextCursorPos() {
        return null; // TODO throw error
    }
}
