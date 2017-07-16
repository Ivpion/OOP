package week6_command_line.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 16.07.17.
 */
public abstract class ACommand implements ICommand {

    protected List<String> options = new ArrayList<>();
    protected List<String> commandArgs = new ArrayList<>();


    @Override
    public  String help(){
        return "Help manual for this command";
    }

    @Override
    public  String man(){
        return "Manual haw to use this command";
    }

    @Override
    public abstract String execute();

    @Override
    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public void setArguments(List<String> commandArg) {
        this.commandArgs = commandArg;
    }

    @Override
    public boolean hesHelpOptions() {
        return this.options.contains("help");
    }
}
