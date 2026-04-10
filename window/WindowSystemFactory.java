package window;

public abstract class WindowSystemFactory {
  public static final WindowSystemFactory INSTANCE = instance();
    
  private static WindowSystemFactory instance() {
    if (INSTANCE != null) {
      return INSTANCE;
    }
    String s = System.getenv("LexiWindow");
    return (s != null && s.equals("Awt")) ? new AwtFactory() : new SwingFactory();
  }

  protected abstract WindowImp createWindowImp(String title, Window window);

  public WindowImp getWindowImp(String title, Window window) {
    return createWindowImp(title, window);
  }

}
