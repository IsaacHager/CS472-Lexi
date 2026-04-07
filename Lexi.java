import glyph.*;
import glyph.Character;
import glyph.laf.ColorFactory;
import glyph.laf.green.GreenFactory;
import glyph.laf.red.RedFactory;
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
    
    public static void main(String[] args) {
        Window window = new SwingWindow("Lexi");

        Glyph root = demo3(window);

        root.composeRoot();

        window.setContents(root);
    }

    @SuppressWarnings("unused")
    private static Glyph demo2(Window window) {

        String[] content = {
            "This is a",
            "border demonstration.",
            "Scroller too!"
        };
        Composition column = new Column(content, window);
        Composition scrollbar = new Scrollbar(column, 10);
        Composition border = new Border(scrollbar, 3);
            Composition row = new Row(window);
                row.insert(new Rectangle(20, 10), 0);
                row.insert(new Character('a'), 0);
                row.insert(border, 2);
                row.insert(new Character('b'), 3);
            Composition row1 = new Row(window);
                row1.insert(new Character('x'), 0);
                row1.insert(new Rectangle(10, 20), 1);
                row1.insert(new Character('y'), 2);
        Composition column1 = new Column(window);
            column1.insert(row, 0);
            column1.insert(row1, 1);

        return column1;
    }

    @SuppressWarnings("unused")
    private static Glyph demo3(Window window) {
        ColorFactory colorFactory = null;
        System.out.println("DEBUG: LexiWidget is set to: " + System.getenv("LexiWidget"));

        String s=System.getenv("LexiWidget");
        if (s!=null && s.equals("Green"))
            colorFactory = GreenFactory.instance();
        else
            colorFactory = RedFactory.instance();

        
        Composition column2 = new Column(window);
            Glyph row1 = new Row(window);
            Glyph a = new Character('a');
            Glyph rect = new Rectangle(20, 10);

                Glyph column1 = new Column(window);
                Glyph X = new Character('X');
                Glyph label = colorFactory.createLabel(new Row("pq", window));
                Glyph Z = new Character('Z');
                column1.insert(X, 0);
                column1.insert(label, 1);
                column1.insert(Z, 2);

            Glyph b = new Character('b');
            row1.insert(a, 0);
            row1.insert(rect, 1);
            row1.insert(column1, 2);
            row1.insert(b, 3);

            Glyph row2 = new Row(window);
            Glyph x = new Character('x');
            Glyph rect2 = new Rectangle(10, 20);
            Glyph y = new Character('y');
            row2.insert(x, 0);
            row2.insert(rect2, 1);
            row2.insert(y, 2);

            Glyph button = colorFactory.createButton(new Row("PQ", window));
            column2.insert(row1, 0);
            column2.insert(row2, 1);
            column2.insert(button, 2);

        Composition scrollbar = new Scrollbar(column2, 10);
        Glyph border = new Border(scrollbar, 6);

        return border;
    }
}
