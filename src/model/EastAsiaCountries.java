/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author This PC
 */
public class EastAsiaCountries extends Country{
    
    private String countryTerrain;
    
    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain){
        super(countryCode, countryName, totalArea);
        this.countryTerrain= countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    public String display(){
        return String.format("%s %11s %10s %11s", super.getCountryCode(), super.getCountryName(), super.getTotalArea(), getCountryTerrain());
    }
}
