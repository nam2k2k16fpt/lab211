package j1.s.p0011;

import java.util.ArrayList;

public class ConversionApp {
    //10 - 2,16
    public String convertDecimalToOther(UserInputData x, int basenumber) {
        ArrayList<String> list = new ArrayList<>();
        int decimal = Integer.parseInt(x.getValueInput());
        while (decimal > 0) {
            int remainder = decimal % basenumber;
            String temp = String.valueOf(remainder);
            list.add(changeFromString(temp));
            decimal /= basenumber;
        }

        String valueLast = "";
        //loop use to access from last element to first element
        for (int i = list.size() - 1; i >= 0; i--) {
            valueLast = valueLast + list.get(i);
        }
        return valueLast;
    }

    //2,16 - 10
    public int converOtherToDecimal(UserInputData x, int basenumber) {
        int decimal = 0;
        int size = x.getValueInput().length();
        for (int i = size - 1; i >= 0; i--) {
            int num = changeFromCharacter(x.getValueInput().charAt(size - 1 - i));
            decimal += Math.pow(basenumber, i) * num;
        }
        return decimal;
    }

    //2 - 16
    public String convertBinaryToHexaDecimal(UserInputData x) {
        x.setValueInput(String.valueOf(converOtherToDecimal(x, 2)));
        return convertDecimalToOther(x, 16);
    }
    
    //16 - 2
    public String convertHexaDecimalToBinary(UserInputData x) {
         x.setValueInput(String.valueOf(converOtherToDecimal(x, 16)));
       
        return convertDecimalToOther(x, 2);
    }       
    
    //change from character to int
    public int changeFromCharacter(char character) {
        switch (character) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;

        }
        return -1;
    }
    
    //change from string to string
    public String changeFromString(String str) {
        switch (str) {
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            case "8":
                return "8";
            case "9":
                return "9";
            case "10":
                return "A";
            case "11":
                return "B";
            case "12":
                return "C";
            case "13":
                return "D";
            case "14":
                return "E";
            case "15":
                return "F";

        }
        return null;
    }

    public static void main(String[] args) {
        ConversionApp c = new ConversionApp();
//        UserInputData x = new UserInputData("34A");
//        System.out.println(c.converOtherToDecimal(x, 16));

//        UserInputData x = new UserInputData("15334");
//        System.out.println(c.convertDecimalToOther(x, 16));

            UserInputData x = new UserInputData("0110111011");
            System.out.println(c.convertBinaryToHexaDecimal(x));
    }
}
