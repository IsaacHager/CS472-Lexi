package glyph.laf.green;

import glyph.Composition;
import glyph.laf.Label;
import window.Window;

public class GreenLabel extends Label {

    public GreenLabel(Composition c) {
        super(c);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Window w) {
        w.drawLabel(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "green");
        super.draw(w);
    }
    
}
