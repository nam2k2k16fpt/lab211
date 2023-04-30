
import j1.s.p0008.UseInputData;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ManageCounterInput {

    /*name: getString(String s)
          the parameter: to display a message to the user, to ask them to enter a string
          the purpose:  Function check input String
     */
    public String getString(String s) {
        Scanner sc = new Scanner(System.in);
        String input; //used to store the string entered by the user from the keyboard and returned once validated and in the correct format
        do {
            System.out.println(s);
            try {
                input = sc.nextLine().trim();
                //check input not empty
                if (input.isEmpty()) {
                    throw new Exception();
                }
                //check not letters
                if (input.matches("\\W+")) {
                    throw new Error();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Content not empty!!!");
            } catch (Error e) {
                System.out.println("Error format!!!");
            }
        } while (true);
        return input;
    }

    public void Countletter(UseInputData u) {
        StringTokenizer st = new StringTokenizer(u.getStr());

        // create an array to store tokens and their counts
        String[] tokens = new String[st.countTokens()];
        int[] counts = new int[tokens.length];

        int i = 0;
        //Loop until all tokens are checked
        while (st.hasMoreTokens()) { //method of the Stringtokenizer class . usedto check if the string being parsied has any element that have not been
            // retrieved.
            String token = st.nextToken();
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (tokens[j].equals(token)) {
                    counts[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                tokens[i] = token;
                counts[i] = 1;
                i++;
            }
        }

        // iterate through the arrays and print each token and its count
        System.out.print("{");
        for (int j = 0; j < i - 1; j++) {
            System.out.print(tokens[j] + "=" + counts[j] + ", ");

        }
        System.out.print(tokens[i - 1] + "=" + counts[i - 1] + "}");

    }

    public void Countcharacter(UseInputData u) {
        StringTokenizer st = new StringTokenizer(u.getStr(), " ");

        int size = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != ' ') {
                    size++;
                }
            }
            
        }

        // create an array to store tokens and their counts
        char[] tokens = new char[size];
        int[] counts = new int[tokens.length];

    }

    public static void main(String[] args) {
        ManageCounterInput managecount = new ManageCounterInput();
        UseInputData u = new UseInputData();
        u.setStr("nam quốc sơn hà nam đế cư");
        System.out.println("Enter your content: ");
        System.out.println(u.getStr());
        managecount.Countletter(u);

        System.out.println();

        managecount.Countcharacter(u);
    }
}
