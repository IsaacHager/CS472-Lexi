package command;

import window.Window;

/**
 * Command that redoes the most recently undone command. Not undoable.
 * 
 * // Prototype(117): ConcretePrototype3
 * // Command(233): ConcreteCommand
 */
public class Redo implements Command {
    protected Window receiver;

    public Redo(Window receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        History.instance().redo();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Cannot undo a redo command");
    }

    @Override
    public boolean isUndoable() {
        return false;
    }

    @Override
    public Command clone() {
        return new Redo(receiver);
    }
    
}
