package window;

public class AwtFactory implements WindowSystemFactory {
  
  private static AwtFactory instance;

  public static AwtFactory instance() {
      if (instance == null) {
          instance = new AwtFactory();
      }
      return instance;
  }

  @Override
  public WindowImp createWindowImp(String title, Window window) {
      return new AwtWindow(title, window);
  }
  
}
