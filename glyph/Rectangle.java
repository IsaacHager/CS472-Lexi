package glyph;

import window.*;

/**
 * Visual rectangle element.
 * 
 * Functions as the 'Leaf' part of the Composite(163) pattern.
 * @author Isaachager
 */
public class Rectangle extends Glyph {
    private int height;
    private int width;

    /**
     * Basic constructor
     * @param height
     * @param width
     */
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Window w) {
        w.drawRectangle(bounds().position().x(), bounds().position().y(), width, height);
    }

    @Override
    public void setSize(Window w) {
        bounds.setHeight(height);
        bounds.setWidth(width);
    }
}
