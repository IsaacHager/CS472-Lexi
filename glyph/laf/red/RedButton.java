package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Button;
import window.Window;

/**
 * Represents a red Button
 * 
 * Functions as the 'ConcreteProduct' part of the AbstractFactory(87) pattern
 * and the FactoryMethod(107) pattern.
 */
public class RedButton extends Button {

    protected RedButton(Composition c) {
        super(c);
    }

    @Override
    public void draw(Window w) {
        w.drawButton(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "red");
        super.draw(w);
    }
    
}
