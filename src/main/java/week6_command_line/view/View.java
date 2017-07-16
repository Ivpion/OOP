package week6_command_line.view;

import week6_command_line.controller.CommandLineController;

import java.util.Scanner;

/**
 * Created by ivan on 16.07.17.
 */
public class View {
    private Scanner sc = new Scanner(System.in);
    private CommandLineController clc;

    public View(CommandLineController  clc){
        this.clc = clc;
    }

    public void Start(){
        while (true){
            System.out.println(clc.getStartLine());
            String command = sc.nextLine();
            String res = clc.executeCommand(command);
            System.out.println(res);
            if (res.equals("exit")) break;
        }
    }
}
