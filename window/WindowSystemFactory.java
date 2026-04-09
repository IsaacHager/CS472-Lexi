package window;

public interface WindowSystemFactory {

  public static WindowSystemFactory instance() {
    throw new IllegalAccessError("This method should be overridden by subclasses");
  }

  public WindowImp createWindowImp(String title, Window window);

}
