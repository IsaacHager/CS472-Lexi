package window;

import glyph.*;

/**
 * Represents a Window.
 * 
 * Bridge(151): Abstraction
 */
public abstract class Window {
  protected final WindowImp _windowImp;
  protected Glyph _contents;

  protected Window(String title) {
    _windowImp = WindowSystemFactory.instance().getWindowImp(title, this);
  }

  public void draw() {
    _contents.draw(this);
  }

  public abstract void drawCharacter(char c, int x, int y);
  public abstract void drawRectangle(int x, int y, int width, int height);

  public abstract int charWidth(char c);
  public abstract int charHeight(char c);

  public abstract void setContents(Glyph glyph);

  public abstract void addBorder(int x1, int y1, int x2, int y2, int width);
  public abstract void addScrollBar(int x, int y, int width, int height);

  public abstract void drawButton(int x, int y, int width, int height, String color);
  public abstract void drawLabel(int x, int y, int width, int height, String color);

}