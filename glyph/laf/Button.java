package glyph.laf;

import glyph.Composition;
import glyph.Embellishment;

/**
 * Represents a Button
 * 
 * Functions as the 'AbstractProduct' part of the AbstractFactory(87) pattern.
 */
public abstract class Button extends Embellishment {

    protected Button(Composition c) {
        super(c);
    }
    
}
