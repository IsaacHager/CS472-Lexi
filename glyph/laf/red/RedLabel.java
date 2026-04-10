package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Label;
import window.Window;

/**
 * Represents a red Label
 * 
 * Functions as the 'ConcreteProduct' part of the AbstractFactory(87) pattern
 * and the FactoryMethod(107) pattern.
 */
public class RedLabel extends Label {

    protected RedLabel(Composition c) {
        super(c);
    }

    @Override
    public void draw(Window w) {
        w.drawLabel(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "red");
        super.draw(w);
    }
    
}
