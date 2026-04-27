package glyph.laf;

import command.Command;
import glyph.Composition;

/**
 * Factory interface creating Buttons and Labels of a certain color.
 * 
 * Functions as the 'AbstractFactory' part of the AbstractFactory(87) pattern
 * and the 'Creator' part of the FactoryMethod(107) pattern.
 */
public abstract class ColorFactory {
    public static final ColorFactory INSTANCE = instance();
    
    private static ColorFactory instance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        String s = System.getenv("LexiWidget");
        return (s != null && s.equals("Green")) ? new GreenFactory() : new RedFactory();
    }
    
    protected abstract Button coloredButton(Composition c ,Command command);
    protected abstract Label coloredLabel(Composition c);

    public Button createButton(Composition c, Command command) {
        return coloredButton(c, command);
    }
    public Label createLabel(Composition c) {
        return coloredLabel(c);
    }

}
