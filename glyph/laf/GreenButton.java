package glyph.laf;

import glyph.Composition;
import window.Window;

/**
 * Represents a green Button
 * 
 * Functions as the 'ConcreteProduct' part of the AbstractFactory(87) pattern
 * and the FactoryMethod(107) pattern.
 */
class GreenButton extends Button {

    protected GreenButton(Composition c) {
        super(c);
    }

    @Override
    public void draw(Window w) {
        w.drawButton(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "green");
        super.draw(w);
    }
    
}
