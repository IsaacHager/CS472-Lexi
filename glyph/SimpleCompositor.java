package glyph;
/**
 * Simple implementation of compositor interface
 */
public class SimpleCompositor implements Compositor {
    private Composition c;

    @Override
    public void setComposition(Composition c) {
        this.c = c;
    }

    @Override
    public void compose() {
        // TODO Auto-generated method stub

        Bounds cursor = new Bounds(c.bounds());
        // create cursor based on parent
        // for (... child= ...) {
        for (Glyph child : c.children()) {
            // ask (leaf) child to set size, based on window
            child.setSize(c.window());
            // ask child to set position, based on cursor
            child.setPosition(cursor.position());
            // ask child to compose itself, recursively
            child.compose();
            // ask parent to adjust itself and cursor, based on child
            c.adjustBounds(child);
            cursor.setPosition(c.nextCursorPos());
        }
        System.out.println(c + ": " + c.bounds());
            
        // ask parent to adjust itself, based on cursor
    }
    
}
