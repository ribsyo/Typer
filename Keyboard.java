import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent; 
public class Keyboard{
    Robot keyboard = new Robot();
    Keyboard()throws AWTException{

    }
    void typeLetter(char a)throws AWTException, InterruptedException{
        if(Character.isUpperCase(a)){
            a = Character.toLowerCase(a);
            keyboard.keyPress(KeyEvent.VK_SHIFT);
        }
        if(a == 'a'){
            keyboard.keyPress(KeyEvent.VK_A);
        }
        if(a == 'b'){
            keyboard.keyPress(KeyEvent.VK_B);
        }
        if(a == 'c'){
            keyboard.keyPress(KeyEvent.VK_C);
        }
        if(a == 'd'){
            keyboard.keyPress(KeyEvent.VK_D);
        }
        if(a == 'e'){
            keyboard.keyPress(KeyEvent.VK_E);
        }
        if(a == 'f'){
            keyboard.keyPress(KeyEvent.VK_F);
        }
        if(a == 'g'){
            keyboard.keyPress(KeyEvent.VK_G);
        }
        if(a == 'h'){
            keyboard.keyPress(KeyEvent.VK_H);
        }
        if(a == 'i'){
            keyboard.keyPress(KeyEvent.VK_I);
        }
        if(a == 'j'){
            keyboard.keyPress(KeyEvent.VK_J);
        }
        if(a == 'k'){
            keyboard.keyPress(KeyEvent.VK_K);
        }
        if(a == 'l'){
            keyboard.keyPress(KeyEvent.VK_L);
        }
        if(a == 'm'){
            keyboard.keyPress(KeyEvent.VK_M);
        }
        if(a == 'n'){
            keyboard.keyPress(KeyEvent.VK_N);
        }
        if(a == 'o'){
            keyboard.keyPress(KeyEvent.VK_O);
        }
        if(a == 'p'){
            keyboard.keyPress(KeyEvent.VK_P);
        }
        if(a == 'q'){
            keyboard.keyPress(KeyEvent.VK_Q);
        }
        if(a == 'r'){
            keyboard.keyPress(KeyEvent.VK_R);
        }
        if(a == 's'){
            keyboard.keyPress(KeyEvent.VK_S);
        }
        if(a == 't'){
            keyboard.keyPress(KeyEvent.VK_T);
        }
        if(a == 'u'){
            keyboard.keyPress(KeyEvent.VK_U);
        }
        if(a == 'v'){
            keyboard.keyPress(KeyEvent.VK_V);
        }
        if(a == 'w'){
            keyboard.keyPress(KeyEvent.VK_W);
        }
        if(a == 'x'){
            keyboard.keyPress(KeyEvent.VK_X);
        }
        if(a == 'y'){
            keyboard.keyPress(KeyEvent.VK_Y);
        }
        if(a == 'z'){
            keyboard.keyPress(KeyEvent.VK_Z);
        }
        keyboard.keyRelease(KeyEvent.VK_SHIFT);
    }
    void typeSymbol(char symbol)throws AWTException, InterruptedException{
        //type - ! * / % + - > < = & | ' " {} [] () \ ; .
        if(symbol == '.'){
            keyboard.keyPress(KeyEvent.VK_PERIOD);
        }
        if(symbol == ' '){
            keyboard.keyPress(KeyEvent.VK_SPACE);
        }
        if(symbol == ';'){
            keyboard.keyPress(KeyEvent.VK_SEMICOLON);
        }
        if(symbol == '\\'){
            keyboard.keyPress(KeyEvent.VK_BACK_SLASH);
        }
        if(symbol == ')'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_0);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '('){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_9);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == ']'){
            keyboard.keyPress(KeyEvent.VK_CLOSE_BRACKET);
        }
        if(symbol == '['){
            keyboard.keyPress(KeyEvent.VK_OPEN_BRACKET);
        }
        if(symbol == '}'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_CLOSE_BRACKET);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '{'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_OPEN_BRACKET);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '"'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_QUOTE);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '\''){
            keyboard.keyPress(KeyEvent.VK_QUOTE);
        }
        if(symbol == '|'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_BACK_SLASH);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '&'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_7);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '='){
            keyboard.keyPress(KeyEvent.VK_EQUALS);
        }
        if(symbol == '<'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_COMMA);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '>'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_PERIOD);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '+'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_ENTER);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '%'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_5);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '/'){
            keyboard.keyPress(KeyEvent.VK_SLASH);
        }
        if(symbol == '-'){
            keyboard.keyPress(KeyEvent.VK_MINUS);
        }
        if(symbol == '!'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_1);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
        if(symbol == '*'){
            keyboard.keyPress(KeyEvent.VK_SHIFT);
            keyboard.keyPress(KeyEvent.VK_8);
            keyboard.keyRelease(KeyEvent.VK_SHIFT);
        }
    }
    void typeString(String word)throws AWTException, InterruptedException{
        for(int j = 0; j < word.length(); j++){
            Thread.sleep(10);
            char temp = word.charAt(j);
            if(Character.isLetter(temp))typeLetter(temp);
            else if(Character.isDigit(temp))typeNumber(temp);
            else typeSymbol(temp);
        }
    }
    void typeNumber(char number)throws AWTException, InterruptedException{
        if(number == '1'){
            keyboard.keyPress(KeyEvent.VK_1);
        }
        if(number == '2'){
            keyboard.keyPress(KeyEvent.VK_2);
        }
        if(number == '3'){
            keyboard.keyPress(KeyEvent.VK_3);
        }
        if(number == '4'){
            keyboard.keyPress(KeyEvent.VK_4);
        }
        if(number == '5'){
            keyboard.keyPress(KeyEvent.VK_5);
        }
        if(number == '6'){
            keyboard.keyPress(KeyEvent.VK_6);
        }
        if(number == '7'){
            keyboard.keyPress(KeyEvent.VK_7);
        }
        if(number == '8'){
            keyboard.keyPress(KeyEvent.VK_8);
        }
        if(number == '9'){
            keyboard.keyPress(KeyEvent.VK_9);
        }
        if(number == '0'){
            keyboard.keyPress(KeyEvent.VK_0);
        }
    }
}