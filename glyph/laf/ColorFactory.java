package glyph.laf;

import glyph.Composition;

/**
 * Factory interface creating Buttons and Labels of a certain color.
 * 
 * Functions as the 'AbstractFactory' part of the AbstractFactory(87) pattern
 * and the 'Creator' part of the FactoryMethod(107) pattern.
 */
public interface ColorFactory {
    
    public Button createButton(Composition c);
    public Label createLabel(Composition c);
}
