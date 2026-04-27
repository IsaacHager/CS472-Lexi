package window;

import command.*;
import glyph.Glyph;

/**
 * Window used for an application.
 * 
 * Bridge(151): RefinedAbstraction
 * Command(233): Invoker
 */
public class ApplicationWindow extends Window {
  protected KeyMap _commands = new KeyMap();

  public ApplicationWindow(String title) {
    super(title);
    _commands.put('i', new IncFontSize(this));
    _commands.put('d', new DecFontSize(this));
    _commands.put('u', new Undo(this));
    _commands.put('r', new Redo(this));
  }

  @Override
  public void drawCharacter(char c, int x, int y) {
    _windowImp.drawCharacter(c,x,y);
  }
  @Override
  public void drawRectangle(int x, int y, int width, int height) {
    _windowImp.drawRectangle(x,y,width,height);
  }

  @Override
  public int charWidth(char c) {
    return _windowImp.charWidth(c);
  }
  @Override
  public int charHeight(char c) {
    return _windowImp.charHeight(c);
  }

  @Override
  public void setContents(Glyph glyph) {
    _contents=glyph;
    _windowImp.setContents();
  }

  @Override
  public void addBorder(int x1, int y1, int x2, int y2, int width) {
    _windowImp.addBorder(x1,y1,x2,y2,width);
  }
  @Override
  public void addScrollBar(int x, int y, int width, int height) {
    _windowImp.addScrollBar(x,y,width,height);
  }

  @Override
  public void drawButton(int x, int y, int width, int height, String color) {
    _windowImp.drawButton(x,y,width,height,color);
  }
  @Override
  public void drawLabel(int x, int y, int width, int height, String color) {
    _windowImp.drawLabel(x,y,width,height,color);
  }

  @Override
  public void key(char c) {
    Command command = _commands.get(c);
    if (command == null) {
      return;
    }
    command.execute();
    History.instance().push(command.clone());
  }

  @Override
  public void click(int x, int y) {
    Glyph g = _contents.get(x, y);
    if (g == null) {
      return;
    }
    g.click();
  }

  @Override
  public void compose() {
    _contents.composeRoot();
  }
  
}
