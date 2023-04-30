/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EquationComplex {

    public List<ComplexNumber> caculationComplextEquation(ComplexNumber a, ComplexNumber b, ComplexNumber c) {
        List<ComplexNumber> listSol = new ArrayList<>();

        if (a.getReal() == 0) {
            return listSol;
        }
        double delta = b.getReal() * b.getReal() - 4 * a.getReal() * c.getReal();
        ComplexNumber x1, x2;
        if (delta < 0) {

            double realPart = -b.getReal() / (2 * a.getReal());
            double imaginaryPart = Math.sqrt(-delta) / (2 * a.getReal());

            x1 = new ComplexNumber(realPart, imaginaryPart);
            x2 = new ComplexNumber(realPart, -imaginaryPart);

            if (x1.getImg() < 0) {
                System.out.printf("Solution: x1 = %.3f%.3fi ", x1.getReal(), x1.getImg());
                System.out.printf("and x2 = %.3f+%.3fi\n", x2.getReal(), x2.getImg());
            }
            if (x1.getImg() > 0) {
                System.out.printf("Solution: x1 = %.3f+%.3fi ", x1.getReal(), x1.getImg());
                System.out.printf("and x2 = %.3f%.3fi\n", x2.getReal(), x2.getImg());
            }
            listSol.add(x1);
            listSol.add(x2);

        } else if (delta == 0) {

            double realPart = -b.getReal() / (2 * a.getReal());
            x2 = x1 = new ComplexNumber(realPart, 0);

            System.out.printf("Solution: x1 = %.3f ", x1.getReal());
            System.out.printf("and x2 = %.3f\n", x2.getReal());

            listSol.add(x1);
            listSol.add(x2);

        } else {

            double n1 = (-b.getReal() + (double) Math.sqrt(delta)) / (2 * a.getReal());
            double n2 = (-b.getReal() - (double) Math.sqrt(delta)) / (2 * a.getReal());
            x1 = new ComplexNumber(n1, 0);
            x2 = new ComplexNumber(n2, 0);

            System.out.printf("Solution: x1 = %.3f ", x1.getReal());
            System.out.printf("and x2 = %.3f\n", x2.getReal());
            listSol.add(x1);
            listSol.add(x2);
        }

        return listSol;
    }
}
