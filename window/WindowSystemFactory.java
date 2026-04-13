package window;

/**
 * Represents a facroty for a windowing system.
 * 
 * Singleton(127): Singleton
 * AbstractFactory(87): AbstractFactory
 * FactoryMethod(107): Creator
 */
public abstract class WindowSystemFactory {
  protected static final WindowSystemFactory INSTANCE = instance();
    
  public static WindowSystemFactory instance() {
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
