package glyph.laf.green;

import glyph.Composition;
import glyph.laf.Label;
import window.Window;

/**
 * Represents a green Label
 * 
 * Functions as the 'ConcreteProduct' part of the AbstractFactory(87) pattern
 * and the FactoryMethod(107) pattern.
 */
public class GreenLabel extends Label {

    public GreenLabel(Composition c) {
        super(c);
    }

    @Override
    public void draw(Window w) {
        w.drawLabel(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "green");
        super.draw(w);
    }
    
}
