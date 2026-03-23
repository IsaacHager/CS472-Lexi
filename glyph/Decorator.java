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
  protected Composition c;

  public Decorator(Composition c) {
    this.c = c;
    this.c.parent = this;
    children.add(c);
  }

  @Override
  public Bounds cursorNext(Bounds cursor, Glyph child) {
    return c.cursorNext(cursor, child);
  }

  public void setWindow(Window window) {
    c.window = window;
  }

  @Override
  public Window window() {
    return c.window;
  }

  @Override
  public void compose() {
    c.comp.compose();
    this.setBounds(c.bounds);
  }
  
}
