package week6_command_line.model;

import java.io.File;

/**
 * Created by ivan on 16.07.17.
 */
public class Pwd extends ACommand {


    @Override
    public String execute() {
        return new File("").getAbsolutePath();
    }



    @Override
    public boolean hesHelpOptions() {
        return false;
    }
}
