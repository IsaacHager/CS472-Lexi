package glyph.laf.green;

import glyph.Composition;
import glyph.laf.Button;
import glyph.laf.ColorFactory;
import glyph.laf.Label;

public class GreenFactory implements ColorFactory {
    private static GreenFactory instance;

    private GreenFactory() {
        // TODO Auto-generated constructor stub
    }

    public static GreenFactory instance() {
        if (instance == null) {
            instance = new GreenFactory();
        }
        return instance;
    }

    @Override
    public Button createButton(Composition c) {
        return new GreenButton(c);
    }

    @Override
    public Label createLabel(Composition c) {
        return new GreenLabel(c);
    }
    
}
