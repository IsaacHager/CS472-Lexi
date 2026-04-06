package glyph;

import window.Window;

/**
 * Vertical container for Glyphs.
 * 
 * Functions as the "ConcreteComponent" part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Column extends Composition {

    public Column() {}

    public Column(String[] strings, Window window) {
        super(window);
        for (int i=0; i<strings.length; i++)
            insert(new Row(strings[i],window), i);
    }

    @Override
    public Bounds cursorNext(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x(), cursor.position().y() + child.bounds().height());
        int maxWidth = Math.max(cursor.width(), child.bounds().width());
        int height = cursor.height() + child.bounds().height();
        return new Bounds(newAnchor, maxWidth, height);
    }

    @Override
    public void adjust(Bounds cursor, Glyph child) {
        Point newAnchor = new Point(cursor.position().x(), cursor.position().y() + child.bounds().height());
        int maxWidth = Math.max(bounds.width(), child.bounds().width());
        cursor.setPosition(newAnchor);
        setBounds(new Bounds(bounds.position(), maxWidth, bounds.height()));
    }
}
