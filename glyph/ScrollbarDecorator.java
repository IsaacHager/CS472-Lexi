package glyph;

import window.Window;

/**
 * An embellishment that adds a scrollbar to the right side of a
 * Composition. It is not functional, only visual.
 * 
 * Functions as the 'ConcreteDecorator' part of the Decorator(175) pattern.
 * @author Isaachager
 */
public class ScrollbarDecorator extends Decorator {
  private int width;

  public ScrollbarDecorator(Composition c, int width) {
    super(c);
    this.width = width;
  }

  @Override
  public void compose() {
    comp.compose();
    bounds.setWidth(children.getFirst().bounds.width() + width);
  }

  @Override
  public void draw(Window w) {
    children.getFirst().draw(w);
    int x = bounds.position().x() + bounds.width() - width;
    int y = bounds.position().y();
    w.addScrollBar(x, y, width, bounds.height());
  }
  
}
