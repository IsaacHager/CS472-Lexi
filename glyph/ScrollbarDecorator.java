package glyph;

import window.Window;

public class ScrollbarDecorator extends Decorator {
  private int width;

  public ScrollbarDecorator(Composition c, int width) {
    super(c);
    this.width = width;
  }

  @Override
  public void compose() {
    comp.compose();
    bounds.setWidth(c.bounds.width() + width);
  }

  @Override
  public Bounds cursorNext(Bounds cursor, Glyph child) {
    return c.cursorNext(cursor, child);
  }

  @Override
  public void draw(Window w) {
    c.draw(w);
    int x = bounds.position().x() + bounds.width() - width;
    int y = bounds.position().y();
    w.addScrollBar(x, y, width, bounds.height());
  }
  
}
