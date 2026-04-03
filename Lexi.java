import glyph.*;
import glyph.Character;
import window.*;
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
        Window window = new SwingWindow("Lexi");
        String[] content = {
            "This is a",
            "border demonstration.",
            "Scroller too!"
        };
        Composition column = new Column(content, window);
        Composition scrollbar = new Scrollbar(column, 10);
        scrollbar.setWindow(window);
        Composition border = new Border(scrollbar, 3);
        border.setWindow(window);
        // column.setWindow(window);
        // column.insert(new Character('X'), 0);
        // column.insert(new Character('Y'), 1);
        // column.insert(new Character('Z'), 2);
        Composition row = new Row();
        row.setWindow(window);
        row.insert(new Rectangle(20, 10), 0);
        row.insert(new Character('a'), 0);
        row.insert(border, 2);
        row.insert(new Character('b'), 3);
        Composition row1 = new Row();
        row1.setWindow(window);
        row1.insert(new Character('x'), 0);
        row1.insert(new Rectangle(10, 20), 1);
        row1.insert(new Character('y'), 2);
        Composition column1 = new Column();
        column1.setWindow(window);
        column1.insert(row, 0);
        column1.insert(row1, 1);

        border.composeRoot();

        window.setContents(column1);
    }
}
