package week6_command_line.exeptions;

/**
 * Created by ivan on 16.07.17.
 */
public class CommandNotFoundException extends Exception {
    public CommandNotFoundException() {
        super("Command not found");
    }
}
