package week6_command_line.model;

import week6_command_line.controller.CommandLineController;

/**
 * Created by ivan on 16.07.17.
 */
public class Cd extends ACommand {
//

    @Override
    public String execute() {

        String[] s = CommandLineController.getCurrentDir().list();
        if (s == null) return "";
        for (int i = 0; i < s.length; i++) {
            if(commandArgs.contains(s[i])){
                return s[i];
            }

        }
        if (commandArgs.contains("..")){
            return "..";
        }

        return "";

    }
}
