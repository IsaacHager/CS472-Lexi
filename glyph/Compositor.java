package glyph;
/**
 * Defines an interface for a Compositor, which is responsible for
 * composing Glyphs together.
 */
public interface Compositor {
    public void setComposition(Composition c);
    public void compose();
}
