/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.s.p0061;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UserInput {

    public double inputNumber(String mess) {
        Scanner sc = new Scanner(System.in);
        double number;
        while (true) {
            System.out.println(mess);
            try {
                number = Double.parseDouble(sc.nextLine());
                if(number > 0){
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Please re-enter the number: ");
            }
        }
        return number;
    }
}
