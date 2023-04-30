package j1.s.p0051;

public class J1SP0051 {

    public static void main(String[] args) {

        SimpleCalculator sc = new SimpleCalculator();

        int choice;
        do {
            choice = new MenuProgram().menu();
            switch (choice) {
                case 1:
                    System.out.println("----- Normal Calculator -----");
                    sc.calculate();
                    break;
                case 2:
                    System.out.println("----- BMI Calculator -----");
                    double weight = new GetInput().checkInputNumber("Enter Weight(kg): ");
                    double height = new GetInput().checkInputNumber("Enter Height(cm): ");
                    BMI bodymassindex = sc.calculateBMI(weight,height);
                    sc.displayResultBMI(weight, height,bodymassindex);
                    break;
            }
        } while (choice != 3);

    }

}
