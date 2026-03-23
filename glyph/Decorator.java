package glyph;

import window.Window;

public abstract class Decorator extends Composition {
  protected Composition c;

  public Decorator(Composition c) {
    this.c = c;
    this.c.parent = this;
    children.add(c);
  }

  @Override
  public abstract Bounds cursorNext(Bounds cursor, Glyph child);

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
