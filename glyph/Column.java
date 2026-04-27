package glyph;

import window.Window;

/**
 * Vertical container for Glyphs.
 * 
 * Functions as the "ConcreteComponent" part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Column extends Composition {
    private int prevWidth;

    public Column() {}

    public Column(Window window) {
        super(window);
    }

    public Column(String[] strings, Window window) {
        super(window);
        for (int i=0; i<strings.length; i++)
            insert(new Row(strings[i],window), i);
    }

    @Override
    public void adjustCursor(Bounds cursor, Glyph child) {
        if (child.equals(childAt(0))) {
            prevWidth = 0;
        }
        Point newAnchor = new Point(cursor.position().x(), cursor.position().y() + child.bounds().height());
        int maxWidth = Math.max(prevWidth, child.bounds().width());
        cursor.setPosition(newAnchor);
        cursor.setWidth(maxWidth);
        cursor.setHeight(cursor.height() + child.bounds().height());
        prevWidth = maxWidth;
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
