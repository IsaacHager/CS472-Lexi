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

        Bounds cursor = new Bounds(c.bounds.position(), 0, 0);
        c.setBounds(new Bounds(cursor));    // reset bounds

        // create cursor based on parent
        for (Glyph child : c.children) {
            // ask (leaf) child to set size, based on window
            child.setSize(c.window());

            // ask child to set position, based on cursor
            cursor = c.adjustCursor(cursor, child); // TODO: ask about this
            child.setPosition(cursor.position());

            // ask child to compose itself, recursively
            child.compose();

            // ask parent to adjust itself and cursor, based on child
            c.adjust(cursor, child);
        }
        // ask parent to adjust itself, based on cursor
        Bounds newBounds = new Bounds(c.bounds().position(), Math.max(c.bounds().width(), cursor.position().x() - c.bounds().position().x()), Math.max(c.bounds().height(), cursor.position().y() - c.bounds().position().y()));
        c.setBounds(newBounds);
    }
    
}
