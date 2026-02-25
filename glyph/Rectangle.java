package glyph;

import window.*;
/**
 * Visual rectangle element
 */
public class Rectangle extends Glyph {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Window w) {
        w.drawRectangle(bounds.position().x(), bounds.position().y(), width, height);
    }

    @Override
    public void setSize(Window w) {
        bounds.setHeight(height);
        bounds.setWidth(width);
    }
}
