package glyph;

import window.*;
/**
 * Represents a single character in the editor
 */
public class Character extends Glyph {
    private char c;

    public Character(char c) {
        this.c = c;
    }

    @Override
    public void draw(Window w) {
        w.drawCharacter(c, bounds.position().x(), bounds.position().y());
    }
    
    @Override
    public void setSize(Window w) {     
        bounds.setHeight(w.charHeight(c));
        bounds.setWidth(w.charWidth(c));
    }
}
