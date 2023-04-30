/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

public class J1SP0074 {

    public static void main(String[] args) {
        //Write a calculator program (from DCPS’s project)
        MatrixCalculateApp mcapp = new MatrixCalculateApp();

        Matrix matrix1, matrix2, res;

        int choice;

        do {
            choice = new MenuScreen().getMenu();

            switch (choice) {
                case 1:
                    System.out.println("--------- Addition ---------");
                    matrix1 = mcapp.inputMatrix1();
                    matrix2 = mcapp.inputMatrix2();
                    res = mcapp.add(matrix1, matrix2);
                    mcapp.printResult(matrix1, matrix2, res, "+");
                    break;
                case 2:
                    System.out.println("--------- Subtraction ---------");
                    matrix1 = mcapp.inputMatrix1();
                    matrix2 = mcapp.inputMatrix2();
                    res = mcapp.subtract(matrix1, matrix2);
                    mcapp.printResult(matrix1, matrix2, res, "-");
                    break;
                case 3:
                    System.out.println("--------- Multiplication ---------");
                    matrix1 = mcapp.inputMatrix1();
                    matrix2 = mcapp.inputMatrix2();
                    res = mcapp.multiply(matrix1, matrix2);
                    mcapp.printResult(matrix1, matrix2, res, "*");
                    break;
                    
                case 4:
                    System.out.println("--------- Convolution ---------");
                    matrix1 = mcapp.inputMatrix1();
                    matrix2 = mcapp.inputMatrix2();
                    res = mcapp.convolution(matrix1,matrix2);
                    mcapp.printResult(matrix1, matrix2, res, "X");
                    break;
            }
        } while (choice != 5);
    }

}
