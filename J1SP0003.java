package j1.s.p0003;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J1SP0003 {

    private static Scanner sc = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // insertion sort là thuật toán có độ phức tạp là O(n^2) và TH tốt nhất O(n).
    // sắp xếp các thẻ bài là 1 vd
    //PHÂN TÍCH:
    // insertion sort algorithm gần giống Selection sort. Chia mảng thành 2 phần sorted,unsorted.
    // lúc đầu phần sorted chứa phần tử đầu tiên của mảng và còn lại là unsorted. Mỗi bước
    // thuật toán lấy phần tử đau tiên trong phần chưa sắp xếp và chèn phần tử đó vào đúng vị trí của phần tử sorted
    // khi phần unsorted empty thì . STOP
    public static void main(String[] args) {
        //Step 1: Enter a positive decimal number of array
//        int numberPositivedecimal = checkDecimalnumber("Enter number of array: ");
        //Step 2: Initialize array using random ineger in number range for each array element
//        int[] array = generateRandom(numberPositivedecimal);
        //Test:
        int[] array = {7, -5, 2, 16, 4};
        boolean test = true;
        //Step 3: Display array of generateRandom
//        displayArray("Unsorted array: ", array);
        //Step 4: Use bubbble sort algorithm for array 
//        boolean test = false;
        insertionSort(array, test);
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

    public static void displayArray(String msg, int[] array) {
        //Loop use to print each element in array
        System.out.print(msg + "");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            //check index to display comma
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        if (msg.equals("Unsorted array: ")) {
            System.out.println("]");
        } else {
            System.out.print("]");
        }

    }

    public static void insertionSort(int[] arr, boolean test) {
        //Display array unsorted in test case
        if (test == true) {
            displayArray("", arr);
            System.out.print( ANSI_RED + "\tunsorted" + ANSI_RESET);
            System.out.println();
        }
        //Loop use to mark first element as sorted. for each unsorted element .
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            if (test == true) {
                displayArray("", arr);
                System.out.print(ANSI_RED + "\t" + key + " to be inserted" + ANSI_RESET);
                System.out.println();
            }
            //  /* Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            //of their current position */
            for (; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
                //Display array process step shift key element with the left element in test case
                if (test == true) {
                    displayArray("", arr);
                    System.out.print(ANSI_RED + "\t" + arr[j] + " > " + key + " , shift" + ANSI_RESET);
                    System.out.println();
                }

            }
            
            //Display array process step insert element in part sorted.
            if (test == true) {
                displayArray("", arr);
                if(j == -1){
                    System.out.print(ANSI_GREEN + "\treached left boundary " + " , insert " + key + ANSI_RESET);
                    System.out.println();
                }
                else{
                   System.out.print(ANSI_GREEN + "\t" + arr[j] + " < " + key + " , insert " + key + ANSI_RESET);
                System.out.println(); 
                }
                
            }
            arr[j + 1] = key;
            
            
        }
        //Display array sorted in test case
        if (test == true) {
            displayArray("", arr);
            System.out.print(ANSI_GREEN + "\tsorted" + ANSI_RESET);
            System.out.println();
        }
    }

}
