/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Managecalculate implements Calculate {

    private static final Scanner sc = new Scanner(System.in);

    //check even
    public boolean isnumberEven(float n) {
        return n % 2 == 0;
    }

    // check square number 
    public boolean isSquareNumber(float n) {
        //compare product of square root of num with square root of num with num
        if ((int) (Math.sqrt(n)) * (int) (Math.sqrt(n)) == n) {
            return true;
        }
        return false;
    }

    //check input
    public float inputNumber(String mess) {
        float num = 0;

        //loop until enter number are valid
        while (true) {
            System.out.print(mess);
            try {
                num = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
            }
        }
        return num;
    }

    @Override
    public List<Float> calculateEquation(float a, float b) {
        List<Float> listSol = new ArrayList<>();
        float x = 0;
        //compare a,b with zero
        if (a == 0 && b == 0) {
            List<Float> listEmpty = new ArrayList<>();
            System.out.println("Infinitely many solution");
            return listEmpty;
        } //compare a,b with zero
        else if (a == 0 && b != 0) {
            System.out.println("no solution");
            return null;
        } else {
            x = -b / a;
            System.out.printf("Solution: x = %.3f\n", x);
            listSol.add(x);
        }
        return listSol;
    }

    @Override
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> listSol = new ArrayList<>();
        if (a == 0) {
            listSol = calculateEquation(b, c);
            return listSol;
        }
        float deta = b * b - 4 * a * c;
        float x1, x2;
        if (deta > 0) {
            x1 = (-b + (float) Math.sqrt(deta)) / (2 * a);
            x2 = (-b - (float) Math.sqrt(deta)) / (2 * a);
            System.out.printf("Solution: x1 = %.3f ", x1);
            System.out.printf("and x2 = %.3f\n", x2);
            listSol.add(x1);
            listSol.add(x2);
        } else if (deta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.printf("Solution: x1 = %.3f ", x1);
            System.out.printf("and x2 = %.3f\n", x2);
            listSol.add(x1);
            listSol.add(x2);
        } else {
            System.out.println("no solution");
            return null;
        }
        return listSol;
    }

    // number odd , number even, number prefect square
    public void display(List<Float> listsol, Infor x, int typeEquation) {
        int flag = 0;
        int count = 0;
        float[] f = null;
        switch (typeEquation) {
            case 1:
                if (listsol != null) {
                    f = new float[3];
                    f[0] = x.getA();
                    f[1] = x.getB();
                    f[2] = listsol.get(0);
                } else {
                    f = new float[2];
                    f[0] = x.getA();
                    f[1] = x.getB();
                }
                System.out.print("Number is Odd: ");

                try {
                    for (float g : f) {
                        if (isnumberEven(g) == false) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;

                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are odd");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                System.out.print("Number is Even: ");
                try {
                    for (float g : f) {
                        if (isnumberEven(g) == true) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are even");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                System.out.print("Number is Perfect Square: ");
                try {
                    for (float g : f) {
                        if (isSquareNumber(g)) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are square");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                break;
            case 2:
                if (listsol != null) {
                    if (listsol.size() == 1) {
                        f = new float[4];
                        f[0] = x.getA();
                        f[1] = x.getB();
                        f[2] = x.getC();
                        f[3] = listsol.get(0);
                    }
                    if (listsol.size() == 2) {
                        f = new float[5];
                        f[0] = x.getA();
                        f[1] = x.getB();
                        f[2] = x.getC();
                        f[3] = listsol.get(0);
                        f[4] = listsol.get(1);
                    }
                } else {
                    f = new float[3];
                    f[0] = x.getA();
                    f[1] = x.getB();
                    f[2] = x.getC();
                }
                System.out.print("Odd Number(s): ");
                try {
                    for (float g : f) {
                        if (isnumberEven(g) == false) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;

                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are odd");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                System.out.print("Number is Even: ");
                try {
                    for (float g : f) {
                        if (isnumberEven(g) == true) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are even");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                System.out.print("Number is Perfect Square: ");
                try {
                    for (float g : f) {
                        if (isSquareNumber(g)) {
                            if (++count > 1) {
                                System.out.print(", " + g);
                            } else {
                                System.out.print(g);
                            }
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.print("don't have number are square");
                    }
                } finally {
                    flag = 0;
                    count = 0;
                }
                System.out.println();
                break;
        }
    }
}
