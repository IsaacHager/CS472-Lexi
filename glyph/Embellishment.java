package glyph;

/**
 * An embellishment that adds some functionality to a Composition,
 * visual or behavioral.
 * 
 * Functions as the 'Decorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public abstract class Embellishment extends Composition {

  public Embellishment(Composition c) {
    children.add(c);
    c.parent = this;
    window = c.window();
  }

    @Override
    public void adjustCursor(Bounds cursor, Glyph child) {
        children.get(0).adjustCursor(cursor, child);
    }

  @Override
  public void insert(Glyph g, int index) {
    throw new UnsupportedOperationException("Cannot insert into a decorator.");
  }
  
}
