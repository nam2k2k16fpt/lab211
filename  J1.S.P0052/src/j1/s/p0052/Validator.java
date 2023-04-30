package j1.s.p0052;

import java.util.ArrayList;
import java.util.Scanner;

public class Validator {

    private static final Scanner sc = new Scanner(System.in);
    //check Duplication

    public boolean checkDuplicate(EastAsiaCountriesList elist, String countrycode) {
        for (int i = 0; i < elist.getCountriesList().size(); i++) {
            if (elist.getCountriesList().get(i).equals(countrycode)) {
                return true;
            }
        }
        return false;
    }

    //input value valid
    public float inputAreaCountries(String mess) {
        float area;
        while (true) {
            System.out.println(mess);
            try {
                area = Float.parseFloat(sc.nextLine());
                if (area <= 0) {
                    throw new Exception();
                }
                break;
            } catch (NumberFormatException en) {
                System.err.println("Not String.Please enter a real positive number!");
            } catch (Exception e) {
                System.err.println("Not less zero. Please enter a real positive number!");
            }
        }
        return area;
    }

    //check name of countries is Character 
    public boolean checkNameCountries(String name) {
        if (name.matches("^[a-zA-Z ]+$")) {
            return false;
        }
        return true;
    }

    //input id valid
    public String inputCodeCountries(EastAsiaCountriesList elist, String mess) {
        String code;
        while (true) {
            System.out.println(mess);
            code = sc.nextLine();
            if (code.isEmpty()) {
                System.out.println("Not empty. Please enter a code of country!");
                continue;
            }
            try {
                if (checkDuplicate(elist, code)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Code is Exist. Please re-enter a code of country!");
            }
        }
        return code;
    }

    //input name valid
    public String inputNameCountries(String mess) {
        String name;
        while (true) {
            System.out.println(mess);
            name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Not empty. Please enter a name of country!");
                continue;
            }
            try {
                if (checkNameCountries(name)) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Name not contain digit. Please enter a name of country!");
            }
        }
        return name;
    }

    //input terrain valid
    public String inputTerrainCountries(String mess) {
        String terrain;
        while (true) {
            System.out.println(mess);
            terrain = sc.nextLine();
            if (terrain.isEmpty()) {
                System.out.println("Not empty. Please enter a terrain of country!");
                continue;
            }
            try {
                if (checkNameCountries(terrain)) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Name not contain digit. Please enter a terrain of country!");
            }
        }
        return terrain;
    }
}
