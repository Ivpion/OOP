package week6_command_line.model;

import week6_command_line.controller.CommandFactory;
import week6_command_line.exeptions.CommandNotFoundException;

/**
 * Created by ivan on 18.07.17.
 */
public class Man extends ACommand {
    @Override
    public String execute() {
        StringBuffer sb = new StringBuffer();
        if (commandArgs.isEmpty()) {
            return "manual command line you can read in google";
        }
        try {
            for (String commandArg : commandArgs) {
                sb.append(CommandFactory.createCommand(commandArg).man() + "\n");
            }
            return sb.toString();
        } catch (CommandNotFoundException e) {
            return "no manual entry for this command";
        }
    }
}
