import glyph.*;
import glyph.Character;
import window.SwingWindow;
/**
 * Lexi editor for creating and editing text files. Supports
 * formatting of text in rows and columns and rectangle characters.
 * 
 * Represents the 'Client' part of the Composite(163) pattern.
 * @author Isaachager
 * @version 1.0
 */
public class Lexi {
    
    // TODO: placeholder method
    public static void main(String[] args) {
        SwingWindow window = new SwingWindow("Lexi");
        Composition row = new Row();
        row.insert(new Rectangle(10, 20), 0);
        row.insert(new Character('b'), 1);
        row.insert(new Character('c'), 1);
        row.setWindow(window);
        Composition column = new Column();
        column.insert(new Character('x'), 0);
        column.insert(new Character('y'), 1);
        column.insert(row, 2);
        column.insert(new Character('z'), 3);
        column.setWindow(window);
        row.composeRoot();

        window.setContents(column);
    }
}
