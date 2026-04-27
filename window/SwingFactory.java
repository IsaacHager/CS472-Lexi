package window;

/**
 * Factory for making SwingWindows.
 * 
 * AbstractFactory(87): ConcreteFactory2
 * FactoryMethod(107): ConcreteCreator
 */
class SwingFactory extends WindowSystemFactory {
  protected static final SwingFactory INSTANCE = instance();

  private SwingFactory() {}

  protected static SwingFactory instance() {
    if (INSTANCE != null) {
      return INSTANCE;
    }
    return new SwingFactory();
  }

  @Override
  protected final WindowImp createWindowImp(String title, Window window) {
    return new SwingWindow(title, window);
  }
  
}
