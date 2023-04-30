
package j1.s.p0050;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Managemenu {

     public int menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        //loop until valid input
        while (true) {
            try {
                System.out.println("========= Equation Program =========");
                System.out.println("1. Calculate Superlative Equation");
                System.out.println("2. Calculate Quadratic Equation");
                System.out.println("3. Exit");
                System.out.println("Please choice one option:");
                choice = Integer.parseInt(sc.nextLine());
                //compare choice variable with 1, 2, 3
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    break;
                } else {
                    System.out.println("Only 1, 2, 3, 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Only 1, 2, 3, 4");
            }
        }

        return choice;
    }
}
