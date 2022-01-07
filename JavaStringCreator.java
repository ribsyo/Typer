import java.util.Scanner;
import java.awt.AWTException;
public class JavaStringCreator {
    Scanner reader = new Scanner(System.in);
    String[] code = new String[50];
    JavaStringCreator(){
        code[0] = "-";
        code[1] = "!";
        code[2] = "*";
        code[3] = "/";
        code[4] = "%";
        code[5] = "+";
        code[6] = ">";
        code[7] = "<";
        code[8] = "=";
        code[9] = "&";
        code[10] = "|";
        code[11] = "'";
        code[12] = "\"";
        code[13] = "{";
        code[14] = "}";
        code[15] = "[";
        code[16] = "]";
        code[17] = "(";
        code[18] = ")";
        code[19] = "\\";
        code[20] = ";";
        code[21] = ".";
        code[22] = " ";

        code[23] = "int";
        code[24] = "float";
        code[25] = "char";
        code[26] = "String";
        code[27] = "double";

        code[28] = "for";
        code[29] = "while";
        code[30] = "if";

        code[31] = "==";
        code[32] = "!=";
        code[33] = ">=";
        code[34] = "<=";
        code[35] = "<";
        code[36] = ">";

        code[37] = "System.out.println()";

        
        
        //- ! * / % + - > < = & | ' " {} [] () \ ; .
    }

    String createString(int layers){
        String tempString = "";
        System.out.println();
        int currentLayer = layers;
        System.out.println("type 1 for if and for loops");
        System.out.println("type 2 for other");
        int tempInt = Integer.parseInt(reader.nextLine());
        //for(28) while(29) if(30)
        if(tempInt == 1){
            tempInt = Integer.parseInt(reader.nextLine());
            if(tempInt == 1){
                tempString = tempString + createIf();
            }
            else if(tempInt == 2){

            }
            else{

            }
            currentLayer += 1;
        }

        else if(tempInt == 2){

        }

        if(currentLayer > layers)tempString = tempString + "\\n}";
        return tempString;
    }

    String createIf(){
        String tempString = "if(" + nameVariable() + " " + setComparator() + " " + setValue() + "){\\n";
        return tempString;
    }

    String nameVariable(){
        System.out.println("name variable");
        return reader.nextLine();
    }

    String setComparator(){
        for(int i = 31; i < 37; i++){
            System.out.println("type "+ (i - 30) + " for: " + code[i]);
        }
        return code[Integer.parseInt(reader.nextLine()) + 30];
    }

    String setValue(){
        System.out.println("type in value you want to set");
        return reader.nextLine();
    }
    String formatForDisplay(String string){
        String tempString = "";
        int[] tempArray = new int[string.length()];
        int tempArrSpot = 0;
        for(int j = 0; j < string.length(); j++){
            char temp = string.charAt(j);
            if(temp == '\\' && string.charAt(j + 1) == 'n'){
                tempArray[tempArrSpot] = j;
                tempArrSpot += 1;
            }
        }
        tempArrSpot = 0;
        for(int i = 0; i < string.length(); i++){
            boolean replace = false;
            if(i == tempArray[tempArrSpot]){
                replace = true;
                tempArrSpot += 1;
            }
            if(replace == true){
                tempString = tempString + "\n";
                i += 1;
            }
            else{
                tempString = tempString + string.charAt(i);
            }
        }
        return tempString;
    }



}
