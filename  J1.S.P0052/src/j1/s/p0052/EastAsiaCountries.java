
package j1.s.p0052;


public class EastAsiaCountries extends Country{
       private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n",
                countryCode, countryName, totalArea, countryTerrain);
    }
    
    
}
