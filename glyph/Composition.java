package glyph;
/**
 * 
 */
public class Composition extends Glyph{
    private Compositor comp;

    public void compose() {
        comp.compose();
    }
}
