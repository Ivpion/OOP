package week6_command_line.model;

import week6_command_line.controller.CommandLineController;

import java.io.*;

/**
 * Created by ivan on 18.07.17.
 */
public class Cat extends ACommand {
    @Override
    public String execute() {
        String[] s = CommandLineController.getCurrentDir().list();

        StringBuffer buff = new StringBuffer();

        if (s == null) return "No file";
        for (int i = 0; i < s.length; i++) {
            if (commandArgs.contains(s[i]) && s[i].contains(".")) {

                String path;
                if (CommandLineController.getCurrentDir().getPath().equals(".")){
                    path = ((CommandLineController.getCurrentDir().getPath() + s[i]).substring(1));
                } else {
                    path = ((CommandLineController.getCurrentDir().getPath() + "/" + s[i]).substring(2));
                }
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
                    String temp;
                    while ((temp = reader.readLine()) != null) {
                        buff.append(temp + "\n");
                    }
                } catch (FileNotFoundException e) {
                    return "File not found";
                } catch (IOException e) {
                    return "catch IOException";
                }
            }

        }
        return buff.toString();
    }
}
