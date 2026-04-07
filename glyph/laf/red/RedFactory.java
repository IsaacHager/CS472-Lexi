package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Button;
import glyph.laf.ColorFactory;
import glyph.laf.Label;

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
