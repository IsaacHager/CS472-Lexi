package command;

import window.Window;

/**
 * Command that does nothing. Not undoable.
 * 
 * // Prototype(117): ConcretePrototype5
 * // Command(233): ConcreteCommand
 */
public class NullCommand implements Command {
    protected Window receiver;

    public NullCommand(Window receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // Do nothing
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Cannot undo a null command");
    }

    @Override
    public boolean isUndoable() {
        return false;
    }

    @Override
    public Command clone() {
        return new NullCommand(receiver);
    }
    
}
