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
  public Bounds adjustCursor(Bounds cursor, Glyph child) {
    Point newAnchor = new Point(cursor.position().x() + width, cursor.position().y() + width);
    return new Bounds(newAnchor, cursor.width() + width * 2, cursor.height() + width * 2);
  }

  @Override
  public void adjust(Bounds cursor, Glyph child) {
    super.adjust(cursor, child);
    setBounds(new Bounds(new Point(bounds.position().x() - width, bounds.position().y() - width), bounds.width() + width * 2, bounds.height() + width * 2));
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
