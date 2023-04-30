package j1.s.p0011;

public class ChangeBaseAppV3 {

//    private int charToInt(char c){
//        if(c >= '0' && c <= '9'){
//            return (int)c - '0';
//        }else{
//            return (int) Character.toUpperCase(c) - 'A' + 10;
//        }
//    }
    private int charToInt(char c) {
        if (c >= '0' && c <= '9') {
            return (int) c - '0';
        } else {
            return (int) c - 'A' + 10;
        }
    }

//    private char intToChar(int num) {
//        if (num >= 0 && num <= 9) {
//            return (char) (num + 48);
//        } else {
//            return (char) (num - 10 + 65);
//        }
//    }

    private char intToChar(int num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + 48);
        } else {
            return (char) (num - 10 + 65);
        }
    }

    private String covertOtherto10(String from, int base) {
        long decimal = 0;
        for (int i = 0; i < from.length(); i++) {
            decimal += charToInt(from.charAt(i)) * Math.pow(base, from.length() - 1 - i);
        }
        return String.valueOf(decimal);
    }

    private String conver10toOther(long decimal, int base) {
        String s = "";
        while (decimal > 0) {
            s += intToChar((int) (decimal % base));
            decimal /= base;
        }
        StringBuilder result = new StringBuilder();
        result.append(s);
        return result.reverse().toString();
    }
    
    
    public String covert2to16(String value){
        String from2to10 = covertOtherto10(value, 2);
        return conver10toOther(Long.parseLong(from2to10), 16);
    }
    public String covert16to2(String value){
        String from16to10 = covertOtherto10(value, 16);
        return conver10toOther(Long.parseLong(from16to10), 2);
    }
    
        public String convertFrom2(String value, int choice){
        if(choice == 1){
            return covertOtherto10(value, choice);
        }
        else{
            return covert2to16(value);
        }
    }
    public String convertFrom10(String value, int choice){
        if(choice == 1){
            return conver10toOther(Long.parseLong(value), 2);
        }else{
            return conver10toOther(Long.parseLong(value), 16);
        }
    }
    public String convertFrom16(String value, int choice){
        if(choice == 1){
            return covertOtherto10(value, 16);
        }else{
            return covert16to2(value);
        }
    }
    
    
    
    public static void main(String[] args) throws Exception {
        ChangeBaseAppV3 cv = new ChangeBaseAppV3();
        System.out.println(cv.conver10toOther(25000000,16));
        System.out.println(cv.covertOtherto10("10111111111111111111111101111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 2));

    }
}
