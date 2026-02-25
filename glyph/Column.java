package glyph;

import window.Window;

/**
 * Vertical container for Glyphs
 */
public class Column extends Composition {
    public Column() {
        super();
    }

    @Override
    public void draw(Window window) {
        for (Glyph g : children) {
            g.draw(window);
        }
    }

    @Override
    public void adjustBounds(Glyph child) {
        int childWidth = child.bounds().width();
        int childHeight = child.bounds().height();
        int newHeight = bounds().height() + childHeight;
        int newWidth = Math.max(bounds().width(), childWidth);

        Bounds newBounds = new Bounds(bounds().position(), newWidth, newHeight);
        setBounds(newBounds);
    }

    @Override
    public Point nextCursorPos() {
        return new Point(bounds.position().x(), bounds.position().y() + bounds.height());
    }

}
