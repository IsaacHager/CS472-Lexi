package command;

import java.util.Stack;

/**
 * Tracks the history of commands and allows undoing and redoing
 * 
 * // Singleton(127): Singleton
 * // Command(233): Invoker
 */
public class History {
    protected static final History INSTANCE = instance();
    protected Stack<Command> undoStack = new Stack<Command>();
    protected Stack<Command> redoStack = new Stack<Command>();

    private History() {}

    /**
     * Gets the singleton instance of the history.
     * @return
     */
    public static History instance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        return new History();
    }

    /**
     * Pushes a command onto the history stack if it is undoable.
     * @param command
     */
    public void push(Command command) {
        if (command == null || command.isUndoable() == false) {
            return;
        }
        undoStack.push(command);
        redoStack.clear();
    }

    /**
     * Undoes the most recently executed command if there is one to undo.
     */
    public void undo() {
        if (undoStack.isEmpty()) {
            return;
        }
        Command command = undoStack.pop();
        command.undo();
        redoStack.push(command);
    }

    /**
     * Redoes the most recently undone command if there is one to redo.
     */
    public void redo() {
        if (redoStack.isEmpty()) {
            return;
        }
        Command command = redoStack.pop();
        command.execute();
        undoStack.push(command);
    }
}
