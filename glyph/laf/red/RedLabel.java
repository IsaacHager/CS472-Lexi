package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Label;
import window.Window;

public class RedLabel extends Label {

    public RedLabel(Composition c) {
        super(c);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Window w) {
        w.drawLabel(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "red");
        super.draw(w);
    }
    
}
