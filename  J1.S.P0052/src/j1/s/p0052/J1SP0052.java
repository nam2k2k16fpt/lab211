package j1.s.p0052;

import java.util.ArrayList;
import java.util.Scanner;

public class J1SP0052 {

    public static void main(String[] args) throws Exception {

        int choice = 0;
        EastAsiaCountriesList elist = new EastAsiaCountriesList();
        EastAsiaCountries ecountry = new EastAsiaCountries();
        ArrayList<EastAsiaCountries> eArray = new ArrayList<>();
        //loop until choice equal 5
        do {

            //Display  a menu and ask users to select an option
            choice = new MenuApp().menu();
            switch (choice) {
                //Option 1: Input the infor of 11 countries in East Asia
                case 1:
                    elist.addCountry(ecountry);
                    break;
                //Option 2: Display the infor of country you've just input   
                case 2:
                    ecountry = elist.getRecentlyEnteredInformation();
                    if (ecountry != null) {
                        System.out.printf("%-10s%-25s%-20s%-25s\n",
                                "ID", "Name", "Total Area", "Terrain");
                        ecountry.display();
                    }
                    
                    break;
                //Option 3: Search the infor of country  
                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the name you want to search for: ");
                    String nameCountry = sc.nextLine();
                    eArray = elist.searchInformationByName(nameCountry);
                    if (eArray.isEmpty()) {
                        System.out.println("Not Found!");
                    } else {
                        for (EastAsiaCountries e : eArray) {
                            e.display();
                        }
                    }
                    break;
                //Option 4: Display all the infor of coutries    
                case 4:
                    eArray = elist.sortInformationByAscendingOrder();
                    elist.displayAllInformation(eArray);
                    break;
            }
        } while (choice != 5);

    }

}
