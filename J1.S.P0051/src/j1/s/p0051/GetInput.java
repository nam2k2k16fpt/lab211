package j1.s.p0051;

import static j1.s.p0051.Operator.values;
import java.util.Scanner;

public class GetInput {

    private final Scanner sc = new Scanner(System.in);

    public Operator checkOperator() {
        String operator;
        while (true) {
            System.out.print("Enter Operator: ");
            operator = sc.nextLine();
            if (operator.isEmpty()) {
                System.out.println("Please input (+,-,*,/,^)");
                continue;
            }
            try {

                for (Operator o : values()) {
                    if (o.getSymbol().equals(operator)) {
                        return o;
                    }
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Please input (+,-,*,/,^)");
            }
        }

    }

    public double checkInputNumber(String mess) {
        double num;
        String input;
        while (true) {
            System.out.print(mess);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Not empty! BMI is digit");
                continue;
            }
            try {
                num = Double.parseDouble(input);
                if (num <= 0) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit");
            } catch (Exception ex) {
                System.out.println("Not less than 0! BMI is digit");
            }
        }
        return num;

    }
    
    public BMI statusBMI(double res){
         if (res < 19) {
            return BMI.UNDERSTANDARD;
        } else if (res >= 19 && res < 25) {
            return BMI.STANDARD;
        } else if (res >= 25 && res < 30) {
            return BMI.OVERWEIGHT;
        } else if (res >= 30 && res < 40) {
            return BMI.FAT;
        } else {
            return BMI.VERYFAT;
        }
    }

}
