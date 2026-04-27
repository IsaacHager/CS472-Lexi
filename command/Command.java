package command;

/**
 * Interface for making a command
 * 
 * // Prototype(117): Prototype
 * // Command(233): Command
 * @author Isaachager
 */
public interface Command {
    
    /**
     * Executes the command.
     */
    public void execute();

    public boolean isUndoable();

    public void undo();

    public Command clone();

}
