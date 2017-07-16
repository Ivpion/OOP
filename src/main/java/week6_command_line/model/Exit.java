package week6_command_line.model;

/**
 * Created by ivan on 16.07.17.
 */
public class Exit extends ACommand {
    @Override
    public String help() {
        return "exit";
    }

    @Override
    public String man() {
        return "cloth console";
    }

    @Override
    public String execute() {
        return "exit";
    }
}
