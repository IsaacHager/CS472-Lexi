package glyph;

import window.*;
/**
 * Visual rectangle element
 */
public class Rectangle extends Glyph {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        x = 0;
        y = 0;
    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(x, y, width, height);
    }
}
