package glyph.laf;

import command.Command;
import command.History;
import glyph.Composition;
import glyph.Embellishment;
import glyph.Glyph;

/**
 * Represents a Button
 * 
 * Functions as the 'AbstractProduct' part of the AbstractFactory(87) pattern.
 * // Command(233): Invoker
 * // ChainOfResponsibility(223): ConcreteHandler
 */
public abstract class Button extends Embellishment {
    Command command;

    protected Button(Composition c, Command command) {
        super(c);
        this.command = command;
    }

  @Override
  public Glyph get(int x, int y) {
    Glyph g = childAt(0).get(x, y);
    if (g != null) {
      return g;
    }
    if (intersects(x, y)) {
      return this;
    }
    return null;
  }

  @Override
  public void click() {
    command.execute();
    History.instance().push(command.clone());
  }
    
}
