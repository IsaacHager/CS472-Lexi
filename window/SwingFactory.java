package window;

/**
 * Factory for making SwingWindows.
 * 
 * AbstractFactory(87): ConcreteFactory2
 * FactoryMethod(107): ConcreteCreator
 */
class SwingFactory extends WindowSystemFactory {

  @Override
  protected WindowImp createWindowImp(String title, Window window) {
    return new SwingWindow(title, window);
  }
  
}
