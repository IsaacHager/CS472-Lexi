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
        Composition column = new Column();
        column.insert(new Character('X'), 0);
        column.insert(new Character('Y'), 1);
        column.insert(new Character('Z'), 2);
        // column.setWindow(window);
        Composition row = new Row();
        row.insert(new Rectangle(20, 10), 0);
        row.insert(new Character('a'), 0);
        row.insert(column, 2);
        row.insert(new Character('b'), 3);
        // row.setWindow(window);
        Composition row1 = new Row();
        row1.insert(new Character('x'), 0);
        row1.insert(new Rectangle(10, 20), 1);
        row1.insert(new Character('y'), 2);
        // row1.setWindow(window);
        Composition column1 = new Column();
        column1.insert(row, 0);
        column1.insert(row1, 1);
        column1.setWindow(window);
        
        row.composeRoot();

        window.setContents(column1);
    }
}
