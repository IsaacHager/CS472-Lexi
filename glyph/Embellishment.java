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
    return children.getFirst().cursorNext(cursor, child);
  }

  @Override
  public void insert(Glyph g, int index) {
    throw new UnsupportedOperationException("Cannot insert into a decorator.");
  }
  
}
