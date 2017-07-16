package week6_command_line.controller;

import week6_command_line.exeptions.CommandNotFoundException;
import week6_command_line.model.Exit;
import week6_command_line.model.ICommand;
import week6_command_line.model.Ls;
import week6_command_line.model.Pwd;

/**
 * Created by ivan on 16.07.17.
 */
public class CommandFactory {

    public static ICommand createCommand(String cmdName) throws CommandNotFoundException{
        ICommand command;
        switch (cmdName){
            case "pwd": command = new Pwd();
            break;
            case "ls": command = new Ls();
            break;
            case "exit": command = new Exit();
            break;
            default: throw new CommandNotFoundException();

        }
        return command;
    }
}
