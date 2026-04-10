package window;

public class SwingFactory extends WindowSystemFactory {
  
  private static SwingFactory instance;

  public static SwingFactory instance() {
      if (instance == null) {
          instance = new SwingFactory();
      }
      return instance;
  }

  @Override
  protected WindowImp createWindowImp(String title, Window window) {
    return new SwingWindow(title, window);
  }
  
}
