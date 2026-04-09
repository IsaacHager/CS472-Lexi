package window;

import glyph.*;

public abstract class Window {
  WindowImp _windowImp;
  Glyph _contents;

  protected Window(String title) {
    String  s=System.getenv("LexiWindow");
    if  (s!=null  &&  s.equals("Awt")) {
      _windowImp = AwtFactory.instance().createWindowImp(title, this);
    } else {
      _windowImp = SwingFactory.instance().createWindowImp(title, this);
    }
  }

  public void draw() {
    _contents.draw(this);
  }

  public void drawCharacter(char c, int x, int y) {
    _windowImp.drawCharacter(c,x,y);
  }
  public void drawRectangle(int x, int y, int width, int height) {
    _windowImp.drawRectangle(x,y,width,height);
  }

  public int charWidth(char c) {
    return _windowImp.charWidth(c);
  }
  public int charHeight(char c) {
    return _windowImp.charHeight(c);
  }

  public void setContents(Glyph glyph) {
    _contents=glyph;
    _windowImp.setContents();
  }

  public void addBorder(int x1, int y1, int x2, int y2, int width) {
    _windowImp.addBorder(x1,y1,x2,y2,width);
  }
  public void addScrollBar(int x, int y, int width, int height) {
    _windowImp.addScrollBar(x,y,width,height);
  }

  public void drawButton(int x, int y, int width, int height, String color) {
    _windowImp.drawButton(x,y,width,height,color);
  }
  public void drawLabel(int x, int y, int width, int height, String color) {
    _windowImp.drawLabel(x,y,width,height,color);
  }

}