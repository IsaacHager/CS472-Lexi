package glyph;

import window.Window;

/**
 * An embellishment that adds a scrollbar to the outside of a Composition.
 * 
 * Functions as the 'ConcreteDecorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class BorderDecorator extends Decorator {
  private int width;

  public BorderDecorator(Composition c, int width) {
    super(c);
    this.width = width;
  }

  @Override
  public void compose() {
    Point originalPosition = bounds.position();
    Point paddedPostion = new Point(originalPosition.x() + width, originalPosition.y() + width);
    bounds.setPosition(paddedPostion);
    comp.compose();
    bounds.setPosition(originalPosition);
    bounds.setWidth(c.bounds.width() + width * 2);
    bounds.setHeight(c.bounds.height() + width * 2);
  }

  @Override
  public void draw(Window w) {
    c.draw(w);
    int x1 = bounds.position().x();
    int y1 = bounds.position().y();
    int x2 = x1 + bounds.width();
    int y2 = y1 + bounds.height();
    w.addBorder(x1, y1, x2, y2, width);
  }
  
}
