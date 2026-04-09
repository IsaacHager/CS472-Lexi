package window;

public class SwingFactory implements WindowSystemFactory {
  
  private static SwingFactory instance;

  public static SwingFactory instance() {
      if (instance == null) {
          instance = new SwingFactory();
      }
      return instance;
  }

  @Override
  public WindowImp createWindowImp(String title, Window window) {
      return new SwingWindow(title, window);
  }
  
}
