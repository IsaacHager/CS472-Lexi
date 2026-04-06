package glyph;

import window.Window;

/**
 * An embellishment that adds a scrollbar to the right side of a
 * Composition. It is not functional, only visual.
 * 
 * Functions as the 'ConcreteDecorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Scrollbar extends Embellishment {
  private int width;

  public Scrollbar(Composition c, int width) {
    super(c);
    this.width = width;
  }

  @Override
  public void compose() {
    comp.compose();
    bounds.setWidth(children.get(0).bounds.width() + width);
  }

  @Override
  public Bounds adjustCursor(Bounds cursor, Glyph child) {
    return new Bounds(cursor.position(), cursor.width() + width, cursor.height());
  }

  @Override
  public void adjust(Bounds cursor, Glyph child) {
    super.adjust(cursor, child);
    setBounds(new Bounds(bounds.position(), bounds.width() + width, bounds.height()));
  }

  @Override
  public void draw(Window w) {
    children.get(0).draw(w);
    int x = bounds.position().x() + bounds.width() - width;
    int y = bounds.position().y();
    w.addScrollBar(x, y, width, bounds.height());
  }
  
}
