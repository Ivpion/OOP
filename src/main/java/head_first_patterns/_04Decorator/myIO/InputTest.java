package head_first_patterns._04Decorator.myIO;

import java.io.*;

/**
 * Created by ivan on 26.06.17.
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/home/ivan/IdeaProjects/oop20/src/main/java/head_first_patterns/_04Decorator/myIO/text.txt")));

            while ((c = in.read()) >=0) System.out.print((char) c);

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
