import java.awt.AWTException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws AWTException, InterruptedException {
        Keyboard robot = new Keyboard();

        Scanner reader = new Scanner(System.in);
        String temp = "";
        Thread.sleep(2000);
        robot.typeString(temp);
    }
}
