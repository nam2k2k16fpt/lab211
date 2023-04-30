/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0009;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
class Manage {

    static void Fibonacci(ArrayList<Integer> list, int count, int size) {
        //check value of count
        if (count <= 1) {
            list.add(count);
        } else {
            int i = (int) list.get(count - 1) + (int) list.get(count - 2);
            list.add(i);
        }

        //check value of count
        if (count < size - 1) {
            count++;
            Fibonacci(list, count, size);
        }
    }

    static void displayFibonacci(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The 45 sequence fibonacci:");
        //loop use to access all element of list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            //check value of i
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
