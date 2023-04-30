
package j1.s.p0051;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MenuProgram {
    
    public int menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
         while (true) {
            try {
                System.out.println("========= Calculator Program =========");
                System.out.println("1. Normal Calculator");
                System.out.println("2. BMI Calculator");
                System.out.println("3. Exit");
                System.out.println("Please choice one option:");
                choice = Integer.parseInt(sc.nextLine());
                //compare choice variable with 1, 2, 3
                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                } else {
                    System.out.println("Only 1, 2, 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Only 1, 2, 3");
            }
        }
        return choice;
    }
}
