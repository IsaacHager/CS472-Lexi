package window;

public class AwtFactory extends WindowSystemFactory {
  
  private static AwtFactory instance;

  public static AwtFactory instance() {
    if (instance == null) {
    instance = new AwtFactory();
    }
    return instance;
  }

  @Override
  protected WindowImp createWindowImp(String title, Window window) {
    return new AwtWindow(title, window);
  }
  
}
