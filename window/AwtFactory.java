package window;

/**
 * Factory for making AwtWindows.
 * 
 * AbstractFactory(87): ConcreteFactory1
 * FactoryMethod(107): ConcreteCreator
 */
class AwtFactory extends WindowSystemFactory {
  protected static final AwtFactory INSTANCE = instance();

  private AwtFactory() {}

  protected static AwtFactory instance() {
    if (INSTANCE != null) {
      return INSTANCE;
    }
    return new AwtFactory();
  }

  @Override
  protected final WindowImp createWindowImp(String title, Window window) {
    return new AwtWindow(title, window);
  }
  
}
