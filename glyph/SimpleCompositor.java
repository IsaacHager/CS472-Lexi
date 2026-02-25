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

        Bounds cursor = new Bounds(c.bounds().position(), 0, 0);

        // create cursor based on parent
        for (Glyph child : c.children()) {
            // ask (leaf) child to set size, based on window
            child.setSize(c.window());

            // ask child to set position, based on cursor
            child.setPosition(cursor.position());

            // ask child to compose itself, recursively
            child.compose();

            // ask parent to adjust itself and cursor, based on child
            cursor = c.cursorNext(cursor, child);
        }
        // ask parent to adjust itself, based on cursor
        int trueWidth = cursor.position().x() - c.bounds().position().x() + cursor.width();
        int trueHeight = cursor.position().y() - c.bounds().position().y() + cursor.height();
        Bounds newBounds = new Bounds(c.bounds().position(), trueWidth, trueHeight);
        c.setBounds(newBounds);    
    }
    
}
