package glyph;

import window.*;

/**
 * Horizontal container for Glyphs
 * @author Isaachager
 */
public class Row extends Composition {

    /**
     * Basic constructor
     */
    public Row() {
        super();
    }

    @Override
    public Bounds cursorNext(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x() + child.bounds().width(), cursor.position().y());
        int maxHeight = Math.max(cursor.height(), child.bounds().height());
        return new Bounds(newAnchor, 0, maxHeight);
    }
}
