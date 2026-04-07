package glyph.laf;

import glyph.Composition;

/**
 * Factory for creating Buttons and Labels of a certain color.
 * 
 * Functions as the 'Abstract Factory' part of the AbstractFactory(87) pattern.
 */
public interface ColorFactory {
    
    public Button createButton(Composition c);
    public Label createLabel(Composition c);
}
