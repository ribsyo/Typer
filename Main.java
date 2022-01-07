import java.awt.AWTException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws AWTException, InterruptedException {
        Keyboard robot = new Keyboard();
        JavaStringCreator javaCreator = new JavaStringCreator();
        Scanner reader = new Scanner(System.in);
        String temp = javaCreator.createString(0);
        Thread.sleep(2000);
        System.out.println(javaCreator.formatForDisplay(temp));
        //robot.typeString(temp);
    }
}