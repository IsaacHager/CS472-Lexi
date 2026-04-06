package glyph;

import window.Window;

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
  }

  @Override
  public Bounds cursorNext(Bounds cursor, Glyph child) {
    return children.get(0).cursorNext(cursor, child);
  }

  @Override
  public void adjust(Bounds cursor, Glyph child) {
    children.get(0).adjust(cursor, child);
    setBounds(children.get(0).bounds());
  }

  @Override
  public void insert(Glyph g, int index) {
    throw new UnsupportedOperationException("Cannot insert into a decorator.");
  }
  
}
