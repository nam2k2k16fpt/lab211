package j1.s.p0002;

import java.util.Random;
import java.util.Scanner;

public class J1SP0002 {

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

    // selection sort là thuật toán có độ phức tạp o(n^2)
//   --> khiến cho việc sắp xếp trở lên kém hiệu quả.Selection sort nó khá đơn giản
    //PHÂN TÍCH:
    // mảng  được chia làm 2 phần - sort , sorted. Lúc đàu phần sorted là empty, sort là chứa sắp xếp chừa toàn bộ mảng.
    // ở mỗi step, thuật toán tìm thấy phần tử minimal in unsorted và thêm phần tử đó vào vị trí cuối bên sorted
    // cho tới khi bên unsorted trở lên empty. ALGORITHM stops.
    // thuật toán sẽ sắp xếp một mảng, nó hoán đổi phần tử đầu tiên của phần unsorted với phần tử minimal rồi
    // đưa vào phần sorted.
    
    
    
    
    public static void main(String[] args) {
        //Step 1: Enter a positive decimal number of array
        int numberPositivedecimal = checkDecimalnumber("Enter number of array: ");
        //Step 2: Initialize array using random ineger in number range for each array element
        int[] array = generateRandom(numberPositivedecimal);
        //Test:
//        int[] array = {5, 1, 12, -5, 16, 2, 12, 14};
//        boolean test = true;
        //Step 3: Display array of generateRandom
        boolean test = false;
        displayArray("Unsorted array: ", array,test,0);
        //Step 4: Use bubbble sort algorithm for array        
        selectionSortarray(array, test);
        //Step 5: Display array 
        displayArray("Sorted array: ", array,test,0);

//        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
//        
//        System.out.println((char)27 + "[33mYELLOW");
//        System.out.println((char)27 + "[31m" + "ERROR MESSAGE IN RED");
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

    public static void displayArray(String msg, int[] array, boolean test, int index) {
        //Loop use to print each element in array
        System.out.print(msg + "");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            //Display each step process sorting in test case
            if (test == true) {
                if (index == 0) {
                    System.out.print(ANSI_RED + array[i] + ANSI_RESET);
                } else {
                    if (i == index) {
                        System.out.print(ANSI_BLUE + array[index] + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_RED + array[i] + ANSI_RESET);
                    }
                }

            } else {
                System.out.print(array[i]);

            }

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

    public static void selectionSortarray(int[] arr, boolean test) {

        int index_min = 0, value_min;
        //Loop use access  to the first from the last element 
        //for the purpose of assigning temporary values to value_min and index_min, with in array

        //Display array unsorted in test case
        if (test == true) {
            displayArray("", arr, test, 0);
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            index_min = i;

            //Loop use access to the next from the last element
            for (int j = i + 1; j < arr.length; j++) {
                //compare the next element of i and at the temp min element, for when find min
                if (arr[j] < arr[index_min]) {
                    index_min = j;
                }
            }
            //Display each step process sorting in test case
            if (test == true) {
                displayArray("", arr, test, index_min);
                System.out.println();
            }
            //Compare the min location with each the element. 
            if (index_min != i) {
                int tmp = arr[index_min];
                arr[index_min] = arr[i];
                arr[i] = tmp;          

            }

        }
    }

}
