package glyph;

import java.util.LinkedList;
import java.util.List;

import window.*;

/**
 * A version of a Glyph that can have children. That is,
 * it can contain other Glyphs.
 * 
 * Functions as the 'Composite' part of the Composite(163) pattern.
 * @author Isaachager
 */
public abstract class CompositeGlyph extends Glyph {
    protected List<Glyph> children;

    protected CompositeGlyph() {
        super();
        children = new LinkedList<Glyph>();
    }
    
    /**
     * Returns a copy of this Glyph's children
     * @return children
     */
    public List<Glyph> children() {
        return new LinkedList<Glyph>(children);
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
        g.parent = this;
    }

    @Override
    public Glyph remove(int pos) {
        return children.remove(pos);
    }

    @Override
    public Glyph childAt(int pos) {
        return children.get(pos);
    }

    @Override
    public void setSize(Window w) {}
}
