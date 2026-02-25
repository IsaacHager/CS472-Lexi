package glyph;

import window.*;
/**
 * Horizontal container for Glyphs
 */
public class Row extends Composition {

    public Row() {
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
        int newWidth = bounds().width() + childWidth;
        int newHeight = Math.max(bounds().height(), childHeight);

        Bounds newBounds = new Bounds(bounds().position(), newWidth, newHeight);
        setBounds(newBounds);
    }

    @Override
    public Point nextCursorPos() {
        return new Point(bounds.position().x() + bounds.width(), bounds.position().y());
    }

    // TODO: formatting
}
