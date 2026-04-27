package glyph.laf;

import command.Command;
import glyph.Composition;

/**
 * Factory for creating Buttons and Labels that are red.
 * 
 * Functions as the 'ConcreteFactory' part of the AbstractFactory(87) pattern
 * and the 'ConcreteCreator' part of the FactoryMethod(107) pattern
 * and the 'Singleton' part of the Singleton(127) pattern.
 */
class RedFactory extends ColorFactory {

    @Override
    protected Button coloredButton(Composition c, Command command) {
        return new RedButton(c, command);
    }

    @Override
    protected Label coloredLabel(Composition c) {
        return new RedLabel(c);
    }
    
}
