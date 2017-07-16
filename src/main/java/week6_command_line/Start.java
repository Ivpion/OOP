package week6_command_line;

import week6_command_line.controller.CommandLineController;
import week6_command_line.view.View;

/**
 * Created by ivan on 16.07.17.
 */
public class Start {
    public static void main(String[] args) {
        new View(new CommandLineController()).Start();
    }
}
