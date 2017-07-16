package week6_command_line.model;

import java.util.List;

/**
 * Created by ivan on 16.07.17.
 */
public interface ICommand {

    String help();
    String man();
    String execute();
    void setOptions(List<String> options);
    void setArguments(List<String> commandArg);
    boolean hesHelpOptions();

}
