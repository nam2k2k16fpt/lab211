package j1.s.p0053;

import java.util.ArrayList;

public class J1SP0053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniziliation ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //Inlizloiation Object BubblersortApp to call function
        BubblerSortApp bs = new BubblerSortApp();
        //chocie variable is temporary variable
        int choice;
        do {
            choice = new Menu().getMenu();
            switch (choice) {
                case 1:
                    list = bs.addElement();
                    break;
                case 2:
                    list = bs.sortAscendingArray(list);
                    bs.displayArray(list);
                    break;
                case 3:
                    list = bs.sortDecendingArray(list);
                    bs.displayArray(list);
                    break;
            }
        } while (choice != 4);
    }

}
