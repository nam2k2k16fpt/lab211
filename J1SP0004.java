package j1.s.p0004;

import java.util.Random;
import java.util.Scanner;

public class J1SP0004 {

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
//    quick sort : divide and Conquer 
//    PHÂN TÍCH: chọn 1 phần tử pivot (left / right / *mid / random) và sắp xếp lại các phần tử mảng để các
//    ---> phần tử < pivot di chuyển sang bên trái của pivot (partition)
//    ---> phần tử > pivot di chuyển sang bên phải của pivot (partition)

    //partition : là sắp xếp lại các phần tử theo 1 cách nào đó, 
    //sao cho tất cả các phần tử nhỏ hơn trục sẽ chuyển sang phần bên trái của mảng và 
    //tất cả các phần tử lớn hơn trục sẽ chuyển sang phần bên phải của mảng. Các giá trị 
    //bằng trục có thể ở bất kỳ phần nào của mảng
    public static void main(String[] args) {
        //Step 1: Enter a positive decimal number of array
//        int numberPositivedecimal = checkDecimalnumber("Enter number of array: ");
        //Step 2: Initialize array using random ineger in number range for each array element
//        int[] array = generateRandom(numberPositivedecimal);
        //Test:
        int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        boolean test = true;
        //Step 3: Display array of generateRandom
        displayArray("Unsorted array: ", array);
        //Step 4: Use bubbble sort algorithm for array 
//        boolean test = false;
        quickSort(array, 0, array.length - 1, test);
        //Step 5: Display array 
        displayArray("Sorted array: ", array);
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

    public static int partition(int[] arr, int low, int high, boolean test) {
        // 4 3 7 1 -5 10 5
        // i tìm kiếm những phần tử >= pivot
        // j tìm kiếm những phần tử <= pivot
        //selection pivot

        int i = low, j = high;
        int pivot = arr[(low + high) / 2];

        //Display array unsorted in test case
        if (test == true && low == 0 && high == arr.length - 1) {
            displayArray("", arr);
            System.out.print(ANSI_RED + "\tunsorted" + ANSI_RESET);
            System.out.println("");
        }

        //Display the first pivot element in test case
        if (test == true) {
            displayArray("", arr);
            System.out.println(ANSI_BLUE + "\tpivot value = " + pivot + ANSI_RESET);
            System.out.println("");
        }

        //Loop use access the location element from head element to tail element
        while (i <= j) {
            //Loop use access the element is less than pivot, if true moved toward element
            while (arr[i] < pivot) {
                i++;
            }
            //Loop use access the element is greater than pivot, if true moved backward element
            while (arr[j] > pivot) {
                j--;
            }

            //Compare the index from the beginning and back from the end
            if (i <= j) {

                //Display array process step swap element left pivot and element right pivot in test case
                if (test == true) {
                    displayArray("", arr);
                    System.out.print("\t" + ANSI_RED + arr[i] + " >= " + ANSI_BLUE + pivot + ANSI_RESET + ANSI_RED + " >= " + arr[j] + ",swap" + ANSI_RESET);
                    System.out.println("");
                }

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }
        //Display array sorted in test case
        if (test == true && i == arr.length - 2) {
            displayArray("", arr);
            System.out.print(ANSI_GREEN + "\tsorted" + ANSI_RESET);
            System.out.println("");
        }

        //cho biết những phần tử từ đầu cho tới cuối i - 1 là <= pivot, và những phần tử từ i tới cuối >= pivot
        //return i (the location i such that the left side of i is less than or equal to pivot and opposite to the right )
        return i;
    }

    public static void quickSort(int[] arr, int low, int high, boolean test) {

        //the partition array follow pivot(key)
        int key = partition(arr, low, high, test);

        // base case, compare low with the element before key
        if (low < key - 1) {
            quickSort(arr, low, key - 1, test);

        }
        // base case, compare high with the element key
        if (high > key) {
            quickSort(arr, key, high, test);

        }

    }
}
