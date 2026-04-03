package glyph.laf.red;

import glyph.Composition;
import glyph.laf.Button;
import window.Window;

public class RedButton extends Button {

    public RedButton(Composition c) {
        super(c);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Window w) {
        w.drawButton(bounds().position().x(), bounds().position().y(), bounds().width(), bounds().height(), "red");
        super.draw(w);
    }
    
}
