
package j1.s.p0011;

import java.math.BigInteger;
import java.util.ArrayList;


public class ChangeBaseAppV2 {
    
    
    public String convertFrom2(String value, int choice){
        if(choice == 1){
            return othertoDecimal(value, 2);
        }
        else{
            return binarytoHexadecimal(value);
        }
    }
    public String convertFrom10(String value, int choice){
        if(choice == 1){
            return decimalToOther(value, 2);
        }else{
            return decimalToOther(value, 16);
        }
    }
    public String convertFrom16(String value, int choice){
        if(choice == 1){
            return othertoDecimal(value, 16);
        }else{
            return hexadecimaltobinary(value);
        }
    }
   
    public String othertoDecimal(String value, int base){
        char arr[] = value.toCharArray();
        BigInteger bigSum = new BigInteger("0"); //gan sum ban dau = 0
        BigInteger baseInput = new BigInteger(Integer.toString(base));
        int indexPow = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int num = changeFromCharacter(arr[i]);
            BigInteger cBig = new BigInteger(Integer.toString(num));
            bigSum = bigSum.add(cBig.multiply(baseInput.pow(indexPow)));
            indexPow--;
        }
        String valueLast = bigSum.toString();
        return valueLast;
    }
    
    public String decimalToOther(String value, int base){
        BigInteger valueBig = new BigInteger(value);
        BigInteger baseBig = new BigInteger(Integer.toString(base));
        ArrayList<String> list = new  ArrayList<>();
        
        //loop until valueBig equal "0"
        while(valueBig.compareTo(new BigInteger("0")) != 0){
            BigInteger remainderBig = valueBig.remainder(baseBig); //chia lay du
            String remainderBigString = remainderBig.toString();
            list.add(changeFromString(remainderBigString));
            valueBig = valueBig.divide(baseBig); //value /= baseBig;
        }
        
        String valueLast = "";
        //loop use to access from last element to first element
        for (int i = list.size() - 1; i >= 0 ; i--) {
            valueLast += list.get(i);
        }
        return valueLast;
    }
    
    public String binarytoHexadecimal(String value){
        String covertbinarytodecimal = othertoDecimal(value, 2);
        return decimalToOther(covertbinarytodecimal,16);
    }
    public String hexadecimaltobinary(String value){
        String coverthexdecimaltodecimal = othertoDecimal(value, 16);
        return decimalToOther(coverthexdecimaltodecimal,2);
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
        ChangeBaseAppV2 cv = new ChangeBaseAppV2();
        System.out.println(cv.othertoDecimal("10111", 2));
    }
}
