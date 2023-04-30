package j1.s.p0011;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    /*check input binary number from user */
    public String inputBinaryNumber(String mess) {
        String valueinput;
        while (true) {
            System.out.println(mess);
            valueinput = sc.nextLine();
            if (valueinput.isEmpty()) {
                System.out.println("Please re-enter a binary number {0,1} !");
                continue;
            }

            try {
                //use regex to check input with pattern
                if (!valueinput.matches("^[0-1]+$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Please re-enter a binary number {0,1} !");
            }
        }
        return valueinput;
    }

    /*check input decimal number from user */
    public String inputDecimalNumber(String mess) {
        String valueinput;
        while (true) {
            System.out.println(mess);
            valueinput = sc.nextLine();
            if (valueinput.isEmpty()) {
                System.out.println("Please re-enter a decimal number {0..9} !");
                continue;
            }

            try {
                //use regex to check input with pattern
                if (!valueinput.matches("^[0-9]+$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Please re-enter a decimal number {0..9} !");
            }
        }
        return valueinput;
    }

    /*check input hexadecimal number from user */

    public String inputHexadecimalNumber(String mess) {
        String valueinput;
        while (true) {
            System.out.println(mess);
            valueinput = sc.nextLine();
            if (valueinput.isEmpty()) {
                System.out.println("Please re-enter a hexadecimal number {0..9;A-F} !");
                continue;
            }

            try {
                //use regex to check input with pattern
                if (!valueinput.matches("^[0-9A-F]+$")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Please re-enter a hexadecimal number {0..9;A-F} !");
            }
        }
        return valueinput;
    }
    
    
}
