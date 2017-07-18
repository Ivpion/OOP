package week6_command_line.model;

import week6_command_line.controller.CommandLineController;

import java.io.File;
import java.io.IOException;

/**
 * Created by ivan on 18.07.17.
 */
public class Touch extends ACommand {
    @Override
    public String execute() {
        File newFile = null;
        for (String args : commandArgs) {
            newFile = new File(
                    CommandLineController.getCurrentDir().getPath() + "/"+args);
            try {
                if (newFile.createNewFile()){
                    return String.format("create file %s", newFile.getName());
                }
            } catch (IOException e) {
                return "Can`t create this file";
            }
        }
        return String.format("You have file %s", commandArgs.get(0));
    }


}
