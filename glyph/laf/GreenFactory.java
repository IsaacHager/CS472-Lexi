package glyph.laf;

import command.Command;
import glyph.Composition;

/**
 * Factory for creating Buttons and Labels that are green.
 * 
 * Functions as the 'ConcreteFactory' part of the AbstractFactory(87) pattern
 * and the 'ConcreteCreator' part of the FactoryMethod(107) pattern
 * and the 'Singleton' part of the Singleton(127) pattern.
 */
class GreenFactory extends ColorFactory {

    @Override
    protected Button coloredButton(Composition c, Command command) {
        return new GreenButton(c, command);
    }

    @Override
    protected Label coloredLabel(Composition c) {
        return new GreenLabel(c);
    }
    
}
