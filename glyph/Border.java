package glyph;

import window.Window;

/**
 * An embellishment that adds a scrollbar to the outside of a Composition.
 * 
 * Functions as the 'ConcreteDecorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class Border extends Embellishment {
  private int width;

  public Border(Composition c, int width) {
    super(c);
    this.width = width;
  }

  @Override
  public void adjustBounds(Bounds cursor) {
    Bounds newBounds = new Bounds(bounds.position(), cursor.width() + width * 2, cursor.height() + width * 2);
    setBounds(newBounds);
  }

  @Override
  public void offsetCursor(Bounds cursor) {
    int x = cursor.position().x() + width;
    int y = cursor.position().y() + width;
    cursor.setPosition(new Point(x, y));
  }

  @Override
  public void draw(Window w) {
    children.get(0).draw(w);
    int x1 = bounds.position().x();
    int y1 = bounds.position().y();
    int x2 = x1 + bounds.width();
    int y2 = y1 + bounds.height();
    w.addBorder(x1, y1, x2, y2, width);
  }
  
}
