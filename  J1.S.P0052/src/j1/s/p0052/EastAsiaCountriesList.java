package j1.s.p0052;

import java.util.ArrayList;

public class EastAsiaCountriesList {

    private ArrayList<EastAsiaCountries> countriesList;

    public EastAsiaCountriesList() {
        countriesList = new ArrayList<EastAsiaCountries>();
    }

    public ArrayList<EastAsiaCountries> getCountriesList() {
        return countriesList;
    }

    public void setCountriesList(ArrayList<EastAsiaCountries> countriesList) {
        this.countriesList = countriesList;
    }

    public void addCountry(EastAsiaCountries country) {
        Validator v = new Validator();
        String id = v.inputCodeCountries(new EastAsiaCountriesList(), "Enter code of country: ");
        String name = v.inputNameCountries("Enter name of country: ");
        float area = v.inputAreaCountries("Enter area of country: ");
        String terrain = v.inputTerrainCountries("Enter terrain of country: ");

        country = new EastAsiaCountries(id, name, area, terrain);
        countriesList.add(country);
        System.out.println("Add successful !");
    }

    public void input11Countries(EastAsiaCountries country) {
        //compare size of list with 11
        if (getCountriesList().size() < 11) {
            addCountry(country);
        } else {
            System.out.println("Full 11 countries. Can't add !");
        }
    }

    public EastAsiaCountries getRecentlyEnteredInformation() {
        if(countriesList.isEmpty()){
            return null;
        }
        EastAsiaCountries recentlyEntered = countriesList.get(countriesList.size() - 1);
        return recentlyEntered;
    }

    public ArrayList<EastAsiaCountries> searchInformationByName(String name) throws Exception {
        ArrayList<EastAsiaCountries> list = new ArrayList<>();
        for (int i = 0; i < getCountriesList().size(); i++) {
            if (getCountriesList().get(i).getCountryName().contains(name)) {
                list.add(getCountriesList().get(i));
            }
        }
        return list;
    }

    public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder() throws Exception {
        ArrayList<EastAsiaCountries> list = getCountriesList();
        //loop use to access from first element to element before last element of list
        for (int i = 0; i < list.size() - 1; i++) {
            //loop use to access from (i + 1)th element to last element of list
            for (int j = i + 1; j < list.size(); j++) {
                //compare countryName of a pair adjacent element
                if (list.get(i).getCountryName().compareTo(list.get(j).getCountryName()) > 0) {
                    EastAsiaCountries temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }
    
    public  void displayAllInformation(ArrayList<EastAsiaCountries> list) {
        System.out.printf("%-10s%-25s%-20s%-25s\n",
                "ID", "Name", "Total Area", "Terrain");
        //loop use to access from first element to last element of list
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
}
