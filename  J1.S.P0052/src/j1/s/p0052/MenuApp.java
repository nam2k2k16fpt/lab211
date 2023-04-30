package j1.s.p0052;

import java.util.Scanner;

public class MenuApp {

    public int menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\t\t\t\tMENU");
            System.out.println("==============================================================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.println("==============================================================================");
            System.out.print("Please enter choice any option: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
                    break;
                } else {
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException e) {
                System.out.println("Only 1,2,3,4,5!");
            }
        }
        return choice;

    }
}
