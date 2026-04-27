package command;

import window.Window;

/**
 * Command that decreases document font size by 1. Undoable.
 * 
 * // Prototype(117): ConcretePrototype1
 * // Command(233): ConcreteCommand
 */
public class DecFontSize implements Command {
    protected Window receiver;

    public DecFontSize(Window receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.setFontSize(receiver.getFontSize() - 1);
        receiver.compose();
        receiver.repaint();
    }

    @Override
    public void undo() {
        receiver.setFontSize(receiver.getFontSize() + 1);
        receiver.compose();
        receiver.repaint();
    }

    @Override
    public boolean isUndoable() {
        return true;
    }

    @Override
    public Command clone() {
        return new DecFontSize(receiver);
    }
    
}
