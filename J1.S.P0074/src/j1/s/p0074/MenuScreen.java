
package j1.s.p0074;

import java.util.Scanner;


public class MenuScreen {
    
      
    private static final Scanner sc = new Scanner(System.in);
    
    public int getMenu(){
        int choice;
        while(true){
            System.out.println("========= Calculator program =========");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Convolution Matrix");
            System.out.println("5. Quit");
            System.out.println("Your option:");
            try {
                choice = Integer.parseInt(sc.nextLine());
                
                if(choice == 1 || choice == 2 || choice == 3|| choice == 4 || choice == 5){
                    break;
                }
                throw new Exception();
                
            } catch (Exception e) {
                System.out.println("Only 1,2,3,4 and 5 !");
            }
        }
        return choice;
    }
}
