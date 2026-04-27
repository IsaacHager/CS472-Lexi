package command;

import java.util.Set;

import window.Window;

/**
 * Command that sets document font size. Undoable.
 * 
 * // Prototype(117): ConcretePrototype6
 * // Command(233): ConcreteCommand
 */
public class SetFontSize implements Command {
    protected Window receiver;
    protected int fontSize;
    protected int prevFontSize;

    public SetFontSize(Window receiver, int fontSize) {
        this.receiver = receiver;
        this.fontSize = fontSize;
    }

    private SetFontSize(SetFontSize original) {
        this.receiver = original.receiver;
        this.fontSize = original.fontSize;
        this.prevFontSize = original.prevFontSize;
    }

    @Override
    public void execute() {
        prevFontSize = receiver.getFontSize();
        receiver.setFontSize(fontSize);
        receiver.compose();
        receiver.repaint();
    }

    @Override
    public void undo() {
        receiver.setFontSize(prevFontSize);
        receiver.compose();
        receiver.repaint();
    }

    @Override
    public boolean isUndoable() {
        return true;
    }

    @Override
    public Command clone() {
        return new SetFontSize(this);
    }
    
}
