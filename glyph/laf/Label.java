package glyph.laf;

import glyph.Composition;
import glyph.Embellishment;

/**
 * Represents a Label
 * 
 * Functions as the 'AbstractProduct' part of the AbstractFactory(87) pattern.
 */
public abstract class Label extends Embellishment {

    protected Label(Composition c) {
        super(c);
    }
    
}
