package command;

import window.Window;

/**
 * Command that undoes the most recently executed command. Not undoable.
 * 
 * // Prototype(117): ConcretePrototype4
 * // Command(233): ConcreteCommand
 */
public class Undo implements Command {
    protected Window receiver;

    public Undo(Window receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        History.instance().undo();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Cannot undo an undo command");
    }

    @Override
    public boolean isUndoable() {
        return false;
    }

    @Override
    public Command clone() {
        return new Undo(receiver);
    }
    
}
