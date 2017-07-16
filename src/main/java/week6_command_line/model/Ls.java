package week6_command_line.model;

import java.util.List;

/**
 * Created by ivan on 16.07.17.
 */
public class Ls extends ACommand {
    @Override
    public String help() {
        return null;
    }

    @Override
    public String man() {
        return null;
    }

    @Override
    public String execute() {
        return null;
    }

    @Override
    public void setOptions(List<String> options) {

    }

    @Override
    public void setArguments(List<String> commandArg) {

    }

    @Override
    public boolean hesHelpOptions() {
        return false;
    }
}
