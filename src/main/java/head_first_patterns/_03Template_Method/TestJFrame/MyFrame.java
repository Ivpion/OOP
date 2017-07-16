package head_first_patterns._03Template_Method.TestJFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ivan on 15.06.17.
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "some text";
        graphics.drawString(msg, 100, 100);
    }


    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("HFDP");
    }
}