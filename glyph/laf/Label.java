package glyph.laf;

import glyph.Composition;
import glyph.Embellishment;
import glyph.Glyph;

/**
 * Represents a Label
 * 
 * Functions as the 'AbstractProduct' part of the AbstractFactory(87) pattern.
 */
public abstract class Label extends Embellishment {

    protected Label(Composition c) {
        super(c);
    }

    @Override
    public Glyph get(int x, int y) {
        Glyph g = childAt(0).get(x, y);
        if (g != null) {
        return g;
        }
        if (intersects(x, y)) {
        return this;
        }
        return null;
    }
    
}
