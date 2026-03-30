package glyph;

import window.Window;

/**
 * An embellishment that adds some functionality to a Composition,
 * visual or behavioral.
 * 
 * Functions as the 'Decorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public abstract class Decorator extends Composition {

  public Decorator(Composition c) {
    children.add(c);
  }

  @Override
  public Bounds cursorNext(Bounds cursor, Glyph child) {
    return children.getFirst().cursorNext(cursor, child);
  }

  @Override
  public void compose() {
    comp.compose();
    this.setBounds(children.getFirst().bounds);
  }
  
}
