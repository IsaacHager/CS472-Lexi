package window;

/**
 * Factory for making AwtWindows.
 * 
 * AbstractFactory(87): ConcreteFactory1
 * FactoryMethod(107): ConcreteCreator
 */
class AwtFactory extends WindowSystemFactory {

  @Override
  protected WindowImp createWindowImp(String title, Window window) {
    return new AwtWindow(title, window);
  }
  
}
