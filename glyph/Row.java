package glyph;

import window.*;

/**
 * Horizontal container for Glyphs
 * 
 * Functions as the "ConcreteComponent" part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Row extends Composition {

    public Row() {}

    public Row(String string, Window window) {
        super(window);
        for (int i=0; i<string.length(); i++)
            insert(new Character(string.charAt(i)), i);
    }

    @Override
    public Bounds cursorNext(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x() + child.bounds().width(), cursor.position().y());
        int maxHeight = Math.max(cursor.height(), child.bounds().height());
        int width = cursor.width() + child.bounds().width();
        return new Bounds(newAnchor, width, maxHeight);
    }

    @Override
    public void adjust(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x() + child.bounds().width(), cursor.position().y());
        int maxHeight = Math.max(bounds.height(), child.bounds().height());
        cursor.setPosition(newAnchor);
        setBounds(new Bounds(bounds.position(), bounds.width(), maxHeight));
    }
}
