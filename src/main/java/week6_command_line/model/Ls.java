package week6_command_line.model;

import week6_command_line.controller.CommandLineController;

import java.io.File;

/**
 * Created by ivan on 16.07.17.
 */
public class Ls extends ACommand {



    @Override
    public String execute() {

        StringBuilder result = new StringBuilder();
        String[] filesList;
        // take current working directory
        if (commandArgs.size() == 0) {
            filesList = CommandLineController.currentDir.list();
            result.append(getFileListAsString(filesList));
        } else {
            try {
                for (String fileName : commandArgs) {
                    filesList = new File(fileName).list();
                    result.append(getFileListAsString(filesList));
                }
                return result.toString();
            } catch (NullPointerException exception) {
                return "Files not found. Perhaps directory does not exist";
            }

        }
        return result.toString();

    }

    private String getFileListAsString(String[] fileList) {

        String separator = " ";
        if (this.options.contains("l"))
            separator = "\n";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fileList.length; i++) {
            if (this.options.contains("a")){
                result.append(fileList[i]).append(separator);
            }
            else {if (!fileList[i].startsWith("."))
                result.append(fileList[i]).append(separator);
            }
        }
        return result.toString();

    }


}
