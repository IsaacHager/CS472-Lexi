package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Button;
import glyph.laf.ColorFactory;
import glyph.laf.Label;

public class RedFactory implements ColorFactory{

    @Override
    public Button createButton(Composition c) {
        return new RedButton(c);
    }

    @Override
    public Label createLabel(Composition c) {
        return new RedLabel(c);
    }
    
}
