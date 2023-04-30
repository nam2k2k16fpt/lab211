package j1.s.p0074;

public class MatrixCalculateApp {

    /*input matrix*/
    public Matrix inputMatrix1() {
        //Inlitiallization array 2 dimensimons
        int row1 = new Validation().inputNumberSize("Enter row matrix 1: ");
        int column1 = new Validation().inputNumberSize("Enter column matrix 1: ");
        int[][] data = new int[row1][column1];
        Matrix x = new Matrix(data);

        //assign value for each element in array
        /*Loop use access of each row 2 dimensional array*/
        for (int i = 0; i < data.length; i++) {
            /*Loop use access of each column 2 dimesional array*/
            for (int j = 0; j < data[0].length; j++) {
                int tmp = new Validation().inputNumber("Enter Matrix1[" + (i + 1) + "][" + (j + 1) + "]:");
                data[i][j] = tmp;
            }
        }
        return x;
    }

    /*input matrix*/
    public Matrix inputMatrix2() {
        //Inlitiallization array 2 dimensimons
        int row2 = new Validation().inputNumberSize("Enter row matrix 2: ");
        int column2 = new Validation().inputNumberSize("Enter column matrix 2: ");

        int[][] data = new int[row2][column2];
        Matrix x = new Matrix(data);

        //assign value for each element in array
        /*Loop use access of each row 2 dimensional array*/
        for (int i = 0; i < data.length; i++) {
            /*Loop use access of each column 2 dimesional array*/
            for (int j = 0; j < data[0].length; j++) {
                int tmp = new Validation().inputNumber("Enter Matrix2[" + (i + 1) + "][" + (j + 1) + "]:");
                data[i][j] = tmp;
            }
        }
        return x;
    }

    /*add 2 matrix*/
 /*name: addMatrix
       parameter: Matrix1, Matrix 2
       return: Result Matrix
     */
    public Matrix add(Matrix x1, Matrix x2) {
        int[][] res = null;

        /*check 2 Matrix follow rows and column*/
        if (new Validation().check2Matrix(x1, x2) == false) {
            System.out.println("Matrices must have the same dimensions");
            return null;
        }
        res = new int[x1.getRow()][x1.getColumn()];

        //caculate add
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = x1.getData()[i][j] + x2.getData()[i][j];
            }
        }

        Matrix resMatrix = new Matrix(res);
        return resMatrix;
    }

    /*Subtraction 2  matrix*/
    public Matrix subtract(Matrix x1, Matrix x2) {
        int[][] res = null;

        /*check 2 Matrix follow rows and column*/
        if (new Validation().check2Matrix(x1, x2) == false) {
            System.out.println("Matrices must have the same dimensions");
            return null;
        }
        res = new int[x1.getRow()][x1.getColumn()];

        //caculate add
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = x1.getData()[i][j] - x2.getData()[i][j];
            }
        }

        Matrix resMatrix = new Matrix(res);
        return resMatrix;
    }

    /*Multip 2 martix*/
    public Matrix multiply(Matrix x1, Matrix x2) {
        int[][] res = null;

        /*check 2 Matrix follow rows and column*/
        if (new Validation().check2MatrixMultiply(x1, x2)) {
            System.out.println("Matrices must have column of matrix #1 equal rows of matrix #2");
            return null;
        }

        res = new int[x1.getRow()][x2.getColumn()];

        //caculate matrix
        /*loop use access each row of array 2 dimenstions*/
        for (int i = 0; i < res.length; i++) {
            /*loop use access each column of array 2 dimenstions*/
            for (int j = 0; j < res[0].length; j++) {
                int k = 0;
                //loop until k greater row of array 2 dimenstions
                while (k < x1.getRow()) {
                    //multiply each position in array 2 dimenstions
                    res[i][j] += x1.getData()[i][k] * x2.getData()[k][j];
                    
                    k++;
                }
            }
        }

        Matrix resMatrix = new Matrix(res);
        return resMatrix;
    }

    public static int singlePixelConvolution(int[][] input, int x, int y, int[][] k, int kernelWidth, int kernelHeight) {
        int output = 0;
        for (int i = 0; i < kernelWidth; ++i) {
            for (int j = 0; j < kernelHeight; ++j) {
                output = output + (input[x + i][y + j] * k[i][j]);
            }
        }
        return output;
    }

    public static int[][] convolution2D(int[][] input, int width, int height, int[][] kernel, int kernelWidth, int kernelHeight) {
        //rows values of array 2 dimentional
        int smallWidth = width - kernelWidth + 1;
        //columns values of array 2 dimentional
        int smallHeight = height - kernelHeight + 1;
        //Initiliazition result array 2 dimentional
        int[][] output = new int[smallWidth][smallHeight];
        /*loop use access each rows of result array 2 dimentional*/
        for (int i = 0; i < smallWidth; ++i) {
            /*loop use access each columns of result array 2 dimentional*/
            for (int j = 0; j < smallHeight; ++j) {
                //assgin each element in array 2 dimentional equal zero
                output[i][j] = 0;
            }
        }
        /*loop use access each rows of result array 2 dimentional*/
        for (int i = 0; i < smallWidth; ++i) {
            /*loop use access each columns of result array 2 dimentional*/
            for (int j = 0; j < smallHeight; ++j) {
                output[i][j] = singlePixelConvolution(input, i, j, kernel,
                        kernelWidth, kernelHeight);
            }
        }
        return output;
    }

    public Matrix convolution(Matrix image, Matrix kernel) {
        
        /*check 2 Matrix follow rows and column*/
        if (new Validation().checkMatrixKernal(image, kernel)) {
            System.out.println("Matrices must have column of matrix #1 equal rows of matrix #2");
            return null;
        }
        //rows values of array 2 dimentional
        int row = image.getRow() - kernel.getRow() + 1;
        //columns values of array 2 dimentional
        int column = image.getColumn() - kernel.getColumn() + 1;

        //Initiliazition result array 2 dimentional
        int[][] output = new int[row][column];

        //assgin All element in  array 2 dimentional
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                output[i][j] = 0;
            }
        }
        //loop use access each rows of array 2 dimentional
        for (int i = 0; i < output.length; i++) {
            //loop use access each column of array 2 dimentional
            for (int j = 0; j < output[0].length; j++) {
                int sum = 0; //temporary variable 
                //loop use access each rows of kernel 2 dimentional
                for (int k = 0; k < kernel.getColumn(); k++) {
                //loop use access each columns of kernel 2 dimentional
                    for (int l = 0; l < kernel.getRow(); l++) {
   //[a[1][1]*k[1][1] + a[1][2]*k[1][2] + a[1][3]*k[1][3] ]+[ a[2][1]*k[2][1] + a[2][2]*k[2][2] + a[2][3]*k[2][3]]+[a[3][1]*k[3][1] + a[3][2]*k[3][2] + a[3][3]*k[3][3]]
   //[a[1][2]*k[1][1] + a[1][3]*k[1][2] + a[1][4]*k[1][3] ]+[ a[2][2]*k[2][1] + a[2][3]*k[2][2] + a[2][4]*k[2][3]]+[a[3][2]*k[3][1] + a[3][3]*k[3][2] + a[3][4]*k[3][3]]
   //[a[1][3]*k[1][1] + a[1][4]*k[1][2] + a[1][5]*k[1][3] ]+[ a[2][3]*k[2][1] + a[2][4]*k[2][2] + a[2][5]*k[2][3]]+[a[3][3]*k[3][1] + a[3][4]*k[3][2] + a[3][5]*k[3][3]]

   //[a[2][1]*k[1][1] + a[2][2]*k[1][2] + a[2][3]*k[1][3] ]+[ a[3][1]*k[2][1] + a[3][2]*k[2][2] + a[3][3]*k[2][3]]+[a[4][1]*k[3][1] + a[4][2]*k[3][2] + a[4][3]*k[3][3]] 
   //[a[2][2]*k[1][1] + a[2][3]*k[1][2] + a[2][4]*k[1][3] ]+[ a[3][2]*k[2][1] + a[3][3]*k[2][2] + a[3][4]*k[2][3]]+[a[4][2]*k[3][1] + a[4][3]*k[3][2] + a[4][4]*k[3][3]] 
   //[a[2][3]*k[1][1] + a[2][4]*k[1][2] + a[2][5]*k[1][3] ]+[ a[3][3]*k[2][1] + a[3][4]*k[2][2] + a[3][5]*k[2][3]]+[a[4][3]*k[3][1] + a[4][4]*k[3][2] + a[4][5]*k[3][3]] 
   
   //[a[3][1]*k[1][1] + a[3][2]*k[1][2] + a[3][3]*k[1][3] ]+[ a[4][1]*k[2][1] + a[4][2]*k[2][2] + a[4][3]*k[2][3]]+[a[5][1]*k[3][1] + a[5][2]*k[3][2] + a[5][3]*k[3][3]] 
   //[a[3][2]*k[1][1] + a[3][3]*k[1][2] + a[3][4]*k[1][3] ]+[ a[4][2]*k[2][1] + a[4][3]*k[2][2] + a[4][4]*k[2][3]]+[a[5][2]*k[3][1] + a[5][3]*k[3][2] + a[5][4]*k[3][3]] 
   //[a[3][3]*k[1][1] + a[3][4]*k[1][2] + a[3][5]*k[1][3] ]+[ a[4][3]*k[2][1] + a[4][4]*k[2][2] + a[4][5]*k[2][3]]+[a[5][3]*k[3][1] + a[5][4]*k[3][2] + a[5][5]*k[3][3]] 
  
   sum += kernel.getData()[k][l] * image.getData()[k + i][l + j];
                    }
                }
                output[i][j] = sum;
            }
        }

        Matrix resMatrix = new Matrix(output);
        return resMatrix;
    }

    /*print result*/
    public void printResult(Matrix x1, Matrix x2, Matrix resx, String operator) {
        if (x1 == null || x2 == null || resx == null) {
            return;
        } else {
            System.out.println("------- Result -------");
            for (int i = 0; i < x1.getRow(); i++) {
                for (int j = 0; j < x1.getColumn(); j++) {
                    System.out.print("[" + x1.getData()[i][j] + "]");
                }
                System.out.println();

            }
            System.out.println(operator);
            for (int i = 0; i < x2.getRow(); i++) {
                for (int j = 0; j < x2.getColumn(); j++) {
                    System.out.print("[" + x2.getData()[i][j] + "]");
                }
                System.out.println();

            }

            System.out.println("=");
            for (int i = 0; i < resx.getRow(); i++) {
                for (int j = 0; j < resx.getColumn(); j++) {
                    System.out.print("[" + resx.getData()[i][j] + "]");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
//        int[][] A = {{1, 2, 3}, {4, 5, 6}};
//        int[][] B = {{7, 8, 9}, {10, 11, 12}};
//
//        int rowA = A.length;
//        System.out.println(rowA);
//        int columnA = A[0].length;
//        System.out.println(columnA);
//
//        for (int i = 0; i < rowA; i++) {
//            for (int j = 0; j < columnA; j++) {
//                System.out.print(A[i][j] + " ");
//
//            }
//            System.out.println();
//
//        }

        MatrixCalculateApp m = new MatrixCalculateApp();
        Matrix mm = m.inputMatrix1();
//        Matrix mmm = m.inputMatrix2();

//        Matrix res = m.add(mm, mmm);
    }
}
