package glyph;

import window.*;

/**
 * Represents a single character in the editor.
 * 
 * Functions as the 'Leaf' part of the Composite(163) pattern.
 * @author Isaachager
 */
public class Character extends Glyph {
    private char c;

    /**
     * Basic constructor
     * @param c
     */
    public Character(char c) {
        this.c = c;
    }

    @Override
    public void draw(Window w) {
        w.drawCharacter(c, bounds().position().x(), bounds().position().y());
    }
    
    @Override
    public void setSize(Window w) {     
        bounds.setHeight(w.charHeight(c));
        bounds.setWidth(w.charWidth(c));
    }
}
