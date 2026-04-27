package glyph.laf;

import command.Command;
import glyph.Composition;
import window.Window;

/**
 * Represents a red Button
 * 
 * Functions as the 'ConcreteProduct' part of the AbstractFactory(87) pattern
 * and the FactoryMethod(107) pattern.
 */
class RedButton extends Button {

    protected RedButton(Composition c, Command command) {
        super(c, command);
    }

    @Override
    public void draw(Window w) {
        w.drawButton(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "red");
        super.draw(w);
    }
    
}
