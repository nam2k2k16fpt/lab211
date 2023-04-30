package j1.s.p0051;

public class SimpleCalculator {

    public double calculate() {
        double memory;
        memory = new GetInput().checkInputNumber("Enter number: ");
        Operator operator;
       do {
             operator = new GetInput().checkOperator();
            switch (operator) {
                case ADDITION:
                    memory += new GetInput().checkInputNumber("Enter number: ");
                    System.out.println("Memory: " + memory);
                    break;
                case DIVISION:
                     memory /= new GetInput().checkInputNumber("Enter number: ");
                    System.out.println("Memory: " + memory);
                    break;
                case EXPONENTIATION:
                     memory = Math.pow(memory, new GetInput().checkInputNumber("Enter number: "));
                     System.out.println("Memory: " + memory);
                    break;
                case MULTIPLICATION:
                    memory *= new GetInput().checkInputNumber("Enter number: ");
                    System.out.println("Memory: " + memory);
                    break;
                case SUBTRACTION:
                    memory -= new GetInput().checkInputNumber("Enter number: ");
                    System.out.println("Memory: " + memory);
                    break;
                case EQUALS:
                    System.out.println("Result: "+memory);
                    return memory;
            }
        } while (true);
    }

    public BMI calculateBMI(double weight, double height) {
        double bmi = weight*10000 / (height*height);
        return new GetInput().statusBMI(bmi);
    }
    
    public void displayResultBMI(double weight, double height, BMI b){
         double bmi = weight*10000 / (height*height);
         System.out.printf("BMI number: %.2f\n", bmi);
         System.out.println("BMI Status: " + b);
    }

}
