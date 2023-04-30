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
public class J1SP0050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        Managecalculate mc = new Managecalculate();
        List<Float> list = new ArrayList<>();
        //loop until choice equals 3
        do {            
            //Display a menu and ask users to select an option.
            choice = new Managemenu().menu();
            switch(choice){
                //Option 1: Calculate Superlative Equation
                case 1:
                    System.out.println("----- Calculate Equation -----");
                    //initializtaion object with 2 coefficients A, B
                    Infor infor1 = new Infor(mc.inputNumber("Enter A: "), mc.inputNumber("Enter B: "));
                    //Calculate the solution x abd display it on the screen
                    list = mc.calculateEquation(infor1.getA(), infor1.getB());
                    //Find and display even, odd and square numbers from inputted coefficients
                    mc.display(list, infor1,1);
                    break;
                
                //Option  2: Calculate Quadratic Equation    
                case 2:
                    System.out.println("----- Calculate Quadratic Equation -----");
                    Infor infor2 = new Infor(mc.inputNumber("Enter A: "), mc.inputNumber("Enter B: "), mc.inputNumber("Enter C: "));
                    list = mc.calculateQuadraticEquation(infor2.getA(), infor2.getB(),infor2.getC());
                    mc.display(list, infor2,2);
                    break;
                    
                case 3:
                    Infor infor3 = new Infor(mc.inputNumber("Enter A: "), mc.inputNumber("Enter B: "), mc.inputNumber("Enter C: "));
                    ComplexNumber c1 = new ComplexNumber(infor3.getA(), 0);
                    ComplexNumber c2 = new ComplexNumber(infor3.getB(), 0);
                    ComplexNumber c3 = new ComplexNumber(infor3.getC(), 0);
                    
                    List<ComplexNumber> list2 = new ArrayList<>();
                    list2 = new EquationComplex().caculationComplextEquation(c1, c2, c3);
                    
                    break;
            }
        } while (choice != 4);
        //Display a menu
        
        //Select an option 
        
        //Exit
        
       
    }
    
}
