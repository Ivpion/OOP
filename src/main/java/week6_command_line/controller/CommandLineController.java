package week6_command_line.controller;

import week6_command_line.exeptions.CommandNotFoundException;
import week6_command_line.model.Cd;
import week6_command_line.model.ICommand;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 16.07.17.
 */
public class CommandLineController {
    private static File currentDir = new File(".");
    private String userName = System.getProperty("user.name");

    public List<String> findOpinions(String[] strng) {
        List<String> listOpinions = new ArrayList<>();
        for (int i = 1; i < strng.length; i++) {
            if (strng[i].startsWith("--") && strng.length > 2) {
                listOpinions.add(strng[i].substring(2));
            } else if (strng[i].startsWith("-")) {
                String[] args = strng[i].substring(1).split("");
                for (int j = 0; j < args.length; j++) {
                    listOpinions.add(args[j]);
                }
            }
        }
        return listOpinions;
    }

    public List<String> findArgs(String[] args) {
        List<String> listArgs = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            if (!args[i].startsWith("-")) {
                listArgs.add(args[i]);
            }
        }
        return listArgs;
    }

    public String getStartLine() {
        return String.format("[%s~%s]$", userName, currentDir.getPath().substring(1));
    }

    public String executeCommand(String command) {

        String[] parts = command.split(" ");
        String cmdName = parts[0];
        //cmdName.toCharArray();
        try {
            ICommand commandObject = CommandFactory.createCommand(cmdName);
            commandObject.setArguments(findArgs(parts));
            commandObject.setOptions(findOpinions(parts));
            if (commandObject.hesHelpOptions()) {
                return commandObject.help();
            }
            if (commandObject instanceof Cd ) {
                currentDir = addToFilePath(commandObject.execute());
            }
            return commandObject.execute();
        } catch (CommandNotFoundException exception) {
            return "command was not recognized";
        }
    }

    private static File addToFilePath(String s) {
        try {
            if (s.equals("..")) {
                String str = currentDir.getPath().substring(0, currentDir.getPath().lastIndexOf("/"));
                return currentDir = new File(str);
            }
            if (s.contains(".") && !s.startsWith(".")) return currentDir;

        } catch (StringIndexOutOfBoundsException e){
            return currentDir;
        }

        return currentDir = new File(currentDir.getPath() + "/" + s);
    }

    public static File getCurrentDir() {
        return currentDir;
    }
}
