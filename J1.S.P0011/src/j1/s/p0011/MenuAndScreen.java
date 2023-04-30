/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MenuAndScreen {

    public int getChoice(String mess) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(mess);
            System.out.println("1. Convert from binary number");
            System.out.println("2. Convert from decimal number");
            System.out.println("3. Convert from hexadecimal number");
            System.out.println("4. Exit");
            System.out.println("Please your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Only 1,2,3,4 !");
            }
        }
        return choice;
    }

    public int displayConvert(String from, String toCase1, String toCase2) {
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Convert from " + from + " to " + toCase1);
            System.out.println("2. Convert from " + from + " to " + toCase2);
            System.out.print("Enter your type convert to: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1 || choice == 2) {
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Only 1,2 !");
            }
        }
        return choice;
    }

     public void display(int inputBase, String value, int outputBase){
         if(inputBase == 1){
             System.out.print(value+" (BIN) = " + new ChangeBaseAppV2().convertFrom2(value, outputBase));
             displayOutBase(outputBase);
         }
         if(inputBase == 2){
             System.out.print(value+" (DEC) = " + new ChangeBaseAppV2().convertFrom10(value, outputBase));
             displayOutBase(outputBase);
         }
         if(inputBase == 3){
             System.out.print(value+" (HEX) = " + new ChangeBaseAppV2().convertFrom16(value, outputBase));
             displayOutBase(outputBase);
         }
     }
     
      public void displayOutBase(int outputBase) {
        if (outputBase == 1) {
            System.out.println("(BIN)");
        } else if (outputBase == 2) {
            System.out.println("(DEC)");
        } else {
            System.out.println("(HEX)");
        }
    }
}
