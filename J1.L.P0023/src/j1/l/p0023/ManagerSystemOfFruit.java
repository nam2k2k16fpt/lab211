package j1.l.p0023;

import java.util.Scanner;

public class ManagerSystemOfFruit {

    private static final Scanner sc = new Scanner(System.in);

    public static int GetInt(String message) {
        int num;
        String input;
         System.out.println(message);
        do {
           
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input could not be empty. Please enter a integer number [1..4]");
                continue;
            }
            try {
                num = Integer.parseInt(input);
                //check value of size must be a positive number
                if (num <= 0) {
                    throw new Exception();
                }
                //Compare float value of input with size_array catch input be a rational number
                if (num > 4) {
                    throw new Error();
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.err.println("Input could not be a string.  Please enter a integer number [1..4]");
                continue;
            } catch (Exception NegaError) {
                System.err.println("Input could not be less than zero. Please enter a integer number [1..4]");
                continue;
            } catch (Error RealNumError) {
                System.err.println(" Please enter a integer number [1..4]");
                continue;
            }
        } while (true);
        return  num;

    }

    public static int Menu() {
        System.out.println("* * * * WELCOME TO FRUIT SHOP * * * *");
        System.out.println("* 1.Create Fruit                    *");
        System.out.println("* 2.View Orders                     *");
        System.out.println("* 3.Shopping(for buyer)             *");
        System.out.println("* 4.Exit                            *");
        System.out.println("* * * * * * * * * * * * * * * * * * *");
        int choice = GetInt("Enter your choice:");
        return choice;
    }

    //Function Create Fruit
    
    //View Orders
    
    //Shopping (buyer)
    
    
    public static void main(String[] args) {
        Menu();
    }
}
