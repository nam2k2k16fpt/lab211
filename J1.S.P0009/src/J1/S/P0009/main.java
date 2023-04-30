/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0009;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger fib1 = new BigInteger("0");
        BigInteger fib2 = new BigInteger("1");
        BigInteger fib3 = new BigInteger("0");
//         System.out.println(fib1);
//        for (int i = 2; i <= 45; i++) {
//            fib3 = fib1.add(fib2);
//            fib1 = fib2;
//            fib2 = fib3;
//            System.out.println(fib1);
//        }

//        System.out.println("Fibonacci number at position 45 is: " + fib3);
        ArrayList<Integer> list = new ArrayList<>();
//        //Step 1: Find 45 sequence Fibonacci
        Manage.Fibonacci(list, 0,45);
//        //Step 2: Display 45 sequence Fibonacci 
        Manage.displayFibonacci(list);
//        System.out.println(fibonacci(10));
//         int n =  fibonnaciHelper(10, 1, 0);
//        int n = 45;
//        for (int i = 0; i < n; i++) {
//            System.out.println(fibonacci(i));
//        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            return result;
        }
    }

    public static int fibonnaciHelper(int term, int lower, int higher) {
        if (term < 2) {
            return higher;
        }
        System.out.print(higher + " ");
        return fibonnaciHelper(term - 1, higher, higher + lower);
    }

}
