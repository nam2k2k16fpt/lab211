/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0053;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public int getMenu(){
        int choice;
        while(true){
            System.out.println("========= Bubble Sort program =========");
            System.out.println("1. Input Element");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Exit");
            System.out.println("Please choice one option:");
            try {
                choice = Integer.parseInt(sc.nextLine());
                
                if(choice == 1 || choice == 2 || choice == 3|| choice == 4){
                    break;
                }
                throw new Exception();
                
            } catch (Exception e) {
                System.out.println("Only 1,2,3 and 4 !");
            }
        }
        return choice;
    }
}
