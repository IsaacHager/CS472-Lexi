package glyph;

import java.util.LinkedList;
import java.util.List;

import window.*;

/**
 * A version of a Glyph that can be composed. That is,
 * it can contain other Glyphs and is able to format
 * itself in reference to its children.
 * @author Isaachager
 * @version 1.0
 */
public class CompositeGlyph extends Composition {
    protected List<Glyph> children;

    public CompositeGlyph() {
        children = new LinkedList<Glyph>();
    }

    @Override
    public void draw(Window w) {
        for (Glyph g : children) {
            g.draw(w);
        }
    }

    @Override
    public void insert(Glyph g, int pos) {
        children.add(pos, g);
    }
}
