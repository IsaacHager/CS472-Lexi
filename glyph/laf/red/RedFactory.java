package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Button;
import glyph.laf.ColorFactory;
import glyph.laf.Label;

/**
 * Factory for creating Buttons and Labels that are red.
 * 
 * Functions as the 'ConcreteFactory' part of the AbstractFactory(87) pattern
 * and the 'ConcreteCreator' part of the FactoryMethod(107) pattern
 * and the 'Singleton' part of the Singleton(127) pattern.
 */
public class RedFactory implements ColorFactory {
    private static RedFactory instance;

    public static RedFactory instance() {
        if (instance == null) {
            instance = new RedFactory();
        }
        return instance;
    }

    @Override
    public Button createButton(Composition c) {
        return new RedButton(c);
    }

    @Override
    public Label createLabel(Composition c) {
        return new RedLabel(c);
    }
    
}
