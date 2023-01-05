package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

public class J1SP0001 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Step 1: Enter a positive decimal number of array
//        int numberPositivedecimal = checkDecimalnumber("Enter number of array: ");
        //Step 2: Initialize array using random ineger in number range for each array element
//        int[] array = generateRandom(numberPositivedecimal);
        //Test:
        int[] array = {5, 1, 12, -5, 16};
        boolean test = true;
        //Step 3: Display array of generateRandom
//        displayArray("Unsorted array: ", array);
        //Step 4: Use bubbble sort algorithm for array 
//        boolean test = false;
        bubbleSortarray(array,test);
        //Step 5: Display array 
//        displayArray("Sorted array: ", array);

    }

    public static int checkDecimalnumber(String msg) {

        System.out.println(msg);

        String input;
        double inputNum;

        //use while to check when any valid number decimal postive
        while (true) {
            input = sc.nextLine();

            if (input.isEmpty()) {
                System.err.println("You don't enter a empty.Please you must be enter a positive number");
                continue;
            }

            try {
                inputNum = Double.parseDouble(input);
                if (inputNum <= 0) {
                    throw new Error();
                }
                if (inputNum != (int) inputNum) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("You don't enter a String.Please you must be enter a positive number");
            } catch (Exception reale) {
                System.err.println("You don't enter a real number .Please you must be enter a positive number");
            } catch (Error negativerrror) {
                System.err.println("You don't enter a number less zero.Please you must be enter a positive number");
            }
        }

        return (int) inputNum;

    }

    public static int[] generateRandom(int size) {
        int[] arrayGeneraterandom = new int[size];
        Random rd = new Random();

        // use for loop to radom each element of  array
        for (int i = 0; i < size; i++) {
            arrayGeneraterandom[i] = rd.nextInt(size) + 1;
        }
        return arrayGeneraterandom;
    }

    public static void bubbleSortarray(int[] array,boolean test) {

        // for loop use to access from th first to last element of array, after each loop, one element is sorted
        for (int i = 0; i < array.length; i++) {

            // for loop use to accessed first unsorted element to the element stand before the last unsorted element
            for (int j = 0; j < array.length - i - 1; j++) {
                    
                // Compare each pair adjacent elements
                if (array[j] > array[j + 1]) {
                        
                    //Display each step in sorting process in test case
                    if(test == true){
                        System.out.println();
                        displayArray("", array);
                        System.out.print("\t" + array[j] +" > "+array[j+1]+", " +"swap");
                    }
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else if(test == true){
                    //Display each step in sorting process in test case
                    System.out.println();
                    displayArray("", array);
                    System.out.print("\t" + array[j] +" < "+array[j+1]+", " +"ok");
                }
            }

        }
    }

    public static void displayArray(String msg, int[] array) {
        //Loop use to print each element in array
        System.out.print(msg + "");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            //check index to display comma
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        if(msg.equals("Unsorted array: ")){
            System.out.println("]");
        }
        else{
            System.out.print("]");
        }

        
    }
}
