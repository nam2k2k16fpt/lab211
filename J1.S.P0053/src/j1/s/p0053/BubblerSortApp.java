package j1.s.p0053;

import java.util.ArrayList;

public class BubblerSortApp {

    public ArrayList<Integer> addElement() {
        ArrayList<Integer> list = new ArrayList<>();
        int sizeNum = new Validation().inputNumberSize("Enter Number: ");

        for (int i = 0; i < sizeNum; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            int temp = new Validation().checkIn();
            list.add(temp);
        }
        System.out.println("Add successfull !");
        return list;
    }

    public ArrayList sortAscendingArray(ArrayList<Integer> list) {
        System.out.println("----- Ascending -----");
        //loop use to access from first element to element before last element of list
        for (int i = 0; i < list.size(); i++) {
            //loop use to access from (i + 1)th element to last element of list
            for (int j = 0; j < list.size() - i - 1; j++) {
                //compare element value of a pair adjacent element
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    public ArrayList sortDecendingArray(ArrayList<Integer> list) {
        System.out.println("----- Descending -----");
         //loop use to access from first element to element before last element of list
        for (int i = 0; i < list.size(); i++) {
            //loop use to access from (i + 1)th element to last element of list
            for (int j = 0; j < list.size() - i - 1; j++) {
                //compare element value of a pair adjacent element
                if (list.get(j).compareTo(list.get(j + 1)) < 0) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    public void displayArray(ArrayList<Integer> list) {
        if (list.size() == 0) {
            System.out.println("Array is empty!");
        } else {
            String symbol = "";
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) <= list.get(i + 1)) {
                    symbol = "->";
                }else{
                     symbol = "<-";
                }
                System.out.print("[" + list.get(i) + "]" + symbol);
            }
            System.out.print("[" + list.get(list.size() - 1) + "]");
            System.out.println();
        }
    }
}
