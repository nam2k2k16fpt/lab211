/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

/**
 *
 * @author Admin
 */
public class J1SP0011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        int option = 0;
        //loop until choice equals 4
        do {
            choice = new MenuAndScreen().getChoice("================ Change Base Program ================ ");
            switch (choice) {
                case 1:
                    option = new MenuAndScreen().displayConvert("binary", "decimal", "hexadecimal");
                    String binNum = new Validation().inputBinaryNumber("Input value need to conver: ");
                    new MenuAndScreen().display(choice, binNum, option);
                    break;
                case 2:
                    option = new MenuAndScreen().displayConvert("decimal", "binary", "hexadecimal");
                    String binNum1 = new Validation().inputDecimalNumber("Input value need to conver: ");
                    new MenuAndScreen().display(choice, binNum1, option);
                    break;
                case 3:
                    option = new MenuAndScreen().displayConvert("hexadecimal", "decimal", "binary");
                    String binNum2 = new Validation().inputHexadecimalNumber("Input value need to conver: ");
                    new MenuAndScreen().display(choice, binNum2, option);
                    
                    break;

            }
        } while (choice != 4);
    }

}
