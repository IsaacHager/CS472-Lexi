package glyph;

import window.Window;

/**
 * Vertical container for Glyphs.
 * @author Isaachager
 */
public class Column extends Composition {

    /**
     * Basic constructor
     */
    public Column() {
        super();
    }

    @Override
    public Bounds cursorNext(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x(), cursor.position().y() + child.bounds().height());
        int maxWidth = Math.max(cursor.width(), child.bounds().width());
        return new Bounds(newAnchor, maxWidth, 0);
    }
}
