package glyph.laf.green;

import glyph.Composition;
import glyph.laf.Button;
import window.Window;

public class GreenButton extends Button {

    public GreenButton(Composition c) {
        super(c);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Window w) {
        w.drawButton(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "green");
        super.draw(w);
    }
    
}
