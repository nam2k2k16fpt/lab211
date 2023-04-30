package j1.s.p0074;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public int inputNumberSize(String mess) {
        int number;
        while (true) {
            System.out.print(mess);
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number >= 0) {
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Values of matrix must be the number");
            }
        }
        return number;
    }

    public int inputNumber(String mess) {
        int number;
        while (true) {
            System.out.print(mess);
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Values of matrix must be the number");
            }
        }
        return number;
    }

    public boolean check2Matrix(Matrix x1, Matrix x2) {
        return !(x1.getRow() != x2.getRow() || x1.getColumn() != x2.getColumn());
    }

    public boolean check2MatrixMultiply(Matrix x1, Matrix x2) {
        return (x1.getColumn() != x2.getRow());
    }

    public boolean checkMatrixKernal(Matrix x1, Matrix kernal) {
        if (kernal.getRow() < x1.getRow()) {
            return false;
        }
        if (kernal.getColumn() < x1.getColumn()) {
            return false;
        }
        return true;

    }
}
