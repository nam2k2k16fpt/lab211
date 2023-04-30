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
public class Validation {
    
    private static final Scanner sc = new  Scanner(System.in);
    public int inputNumberSize(String mess){
        System.out.println("----- Input Element -----");
        System.out.println("Input Length Of Array");
        int sizeArr;
        while(true){
            System.out.print(mess);
            try {
                sizeArr = Integer.parseInt(sc.nextLine());
                if(sizeArr <= 0){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Please input numberand number is greater than zero");
            }
        }
        return sizeArr;
    }
    
    public int checkIn(){
        int elementNum;
        while(true){
            try {
                elementNum = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Not String!. Please re-enter a number valid!");
            }
        }
        return elementNum;
    }
}
