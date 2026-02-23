import glyph.*;
import glyph.Character;
import window.SwingWindow;
/**
 * Lexi editor for creating and editing text files. Supports
 * formatting of text in rows and columns and rectangle characters.
 * @author Isaachager
 * @version 1.0
 * 
 * TODO: For homework- mention which patterns are used in each class
 */
public class Lexi {
    
    // TODO: placeholder method
    public static void main(String[] args) {
        SwingWindow window = new SwingWindow("Lexi");
        CompositeGlyph row = new Row();
        row.insert(new Rectangle(100, 200), 0);
        row.insert(new Character('b'), 1);
        window.setContents(row);

    }
}
