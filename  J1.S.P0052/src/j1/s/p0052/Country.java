/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

/**
 *
 * @author Admin
 */
/*
 chi co the truy cap duoc tu cac subclass và các class cùng package.
*/
public class Country {

    
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country() {
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getCountryName() {
        return countryName;
    }  
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    public float getTotalArea() {
        return totalArea;
    }
    
    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    
    public void display(){
        System.out.println("countryCode: " + countryCode);
        System.out.println("countryName: " + countryName);
        System.out.println("totalArea: " + totalArea);
    }
    
    
}
