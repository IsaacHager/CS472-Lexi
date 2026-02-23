package glyph;

import window.*;
/**
 * Horizontal container for Glyphs
 */
public class Row extends CompositeGlyph {
    int height;
    int width;

    public Row() {

    }

    @Override
    public void draw(Window window) {
        for (Glyph g : children) {
            g.draw(window);
        }
    }

    // TODO: formatting
}
