package glyph;

import window.*;

/**
 * Horizontal container for Glyphs
 * 
 * Functions as the "ConcreteComponent" part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Row extends Composition {
    int prevHeight;

    public Row() {}

    public Row(Window window) {
        super(window);
    }

    public Row(String string, Window window) {
        super(window);
        for (int i=0; i<string.length(); i++)
            insert(new Character(string.charAt(i)), i);
    }

    @Override
    public void adjustCursor(Bounds cursor, Glyph child) {
        if (child.equals(childAt(0))) {
            prevHeight = 0;
        }
        Point newAnchor = new Point(cursor.position().x() + child.bounds().width(), cursor.position().y());
        int maxHeight = Math.max(prevHeight, child.bounds().height());
        cursor.setPosition(newAnchor);
        cursor.setWidth(cursor.width() + child.bounds().width());
        cursor.setHeight(maxHeight);
        prevHeight = maxHeight;
    }

    @Override
    public Glyph get(int x, int y) {
        for (int i=0; i<children.size(); i++) {
            Glyph g = childAt(i).get(x, y);
            if (g != null) {
                return g;
            }
        }
        if (intersects(x, y)) {
            return this;
        }
        return null;
    }
}
