package glyph;
/**
 * Defines an interface for a Compositor, which is responsible for
 * composing Glyphs together.
 * 
 * Functions as the 'Strategy' part of the Strategy(315) pattern.
 * @author Isaachager
 */
public interface Compositor {

    /**
     * Sets the composition to compose
     * @param c
     */
    public void setComposition(Composition c);

    /**
     * Composes the attatched composition
     */
    public void compose();
}
