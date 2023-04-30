
package J1.S.P0009;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class Infor {
    private int inputnumber;

    public Infor() {
    }

    public int getNumber() {
        return inputnumber;
    }

    public void setNumber(int inputnumber) {
        this.inputnumber = inputnumber;
    }
    
    public void Printfibonacci(){
        for (int i = 0; i < inputnumber; i++) {
            System.out.println(nthFibonacciTerm(i));
        }
    }
    
    //Find number fibonacci
    public  int nthFibonacciTerm(int n) {
    if(n == 0 || n == 1) {
        return n;
    }
    int n0 = 0, n1 = 1;
    int tempNthTerm;
    for (int i = 2; i <= n; i++) {
        tempNthTerm = n0 + n1;
        n0 = n1;
        n1 = tempNthTerm;
    }
    return n1;
}
    
    
}
