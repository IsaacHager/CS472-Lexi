package glyph;
/**
 * Simple implementation of compositor interface.
 * 
 * Functions as the 'ConcreteStrategy' part of the Strategy(315) pattern.
 * @author Isaachager
 */
public class SimpleCompositor implements Compositor {
    private Composition c;

    @Override
    public void setComposition(Composition c) {
        this.c = c;
    }

    @Override
    public void compose() {
        
        if (c.parent != null && c.parent.window() != null) {    // Inherit window from parent
            this.c.setWindow(this.c.parent.window());
        }

        // create cursor based on parent
        Bounds cursor = new Bounds(c.bounds.position(), 0, 0);

        for (Glyph child : c.children) {
            // ask (leaf) child to set size, based on window
            child.setSize(c.window());

            // ask child to set position, based on cursor
            child.computePosition(cursor);

            // ask child to compose itself, recursively
            child.compose();

            // ask parent to adjust itself and cursor, based on child
            c.adjustCursor(cursor, child);
        }
        // ask parent to adjust itself, based on cursor
        c.adjustBounds(cursor);
    }
    
}
