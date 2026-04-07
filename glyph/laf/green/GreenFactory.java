package glyph.laf.green;

import glyph.Composition;
import glyph.laf.Button;
import glyph.laf.ColorFactory;
import glyph.laf.Label;

/**
 * Factory for creating Buttons and Labels that are green.
 * 
 * Functions as the 'ConcreteFactory' part of the AbstractFactory(87) pattern
 * and the 'ConcreteCreator' part of the FactoryMethod(107) pattern
 * and the 'Singleton' part of the Singleton(127) pattern.
 */
public class GreenFactory implements ColorFactory {
    private static GreenFactory instance;

    public static GreenFactory instance() {
        if (instance == null) {
            instance = new GreenFactory();
        }
        return instance;
    }

    @Override
    public Button createButton(Composition c) {
        return new GreenButton(c);
    }

    @Override
    public Label createLabel(Composition c) {
        return new GreenLabel(c);
    }
    
}
