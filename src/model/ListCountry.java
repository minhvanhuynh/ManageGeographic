/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import view.Validation;

/**
 *
 * @author This PC
 */
public class ListCountry {
    private ArrayList<EastAsiaCountries> list;
    private Validation validation;
    
    public ListCountry(){
        this.list= new ArrayList<>();
        this.validation= new Validation();                
    }
    
    public ArrayList<EastAsiaCountries> addCountry(){
        ArrayList<EastAsiaCountries> list_input= new ArrayList<>();
        while(true){
            System.out.println("Enter code of country: ");
            String countryCode= validation.checkInputString();
            if(validation.checkIdExist(list, countryCode)){
                return list_input;
            }
            System.out.println("Enter name of country: ");
            String countryName= validation.checkInputString();
            System.out.println("Enter total Area: ");
            float totalArea= validation.checkInputfloat();
            System.out.println("Enter terrain of country: ");
            String countryTerrain= validation.checkInputString();
            EastAsiaCountries eac= new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
            list.add(eac);
            list_input.add(eac);
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return list_input;
            }
        }       
    }
    
    public void displayList(ArrayList<EastAsiaCountries> list_display){
        System.out.println("ID     Name     Toatal Area     Terrain");
        for (EastAsiaCountries eastAsiaCountries : list_display) {
            System.out.println(eastAsiaCountries.display());
        }
    }
    
    public void searchCountry(){
        System.out.println("Enter the name you want to search for: ");
        String name= validation.checkInputString();
        EastAsiaCountries eas= find_name(name);
        if(eas!=null){
            System.out.println("ID     Name     Toatal Area     Terrain");
            System.out.println(eas.display());
        }
    }
    
    public EastAsiaCountries find_name(String name){
        EastAsiaCountries find_eas= null;
        for (EastAsiaCountries eas : list) {
            if(eas.getCountryName().equalsIgnoreCase(name)){
                find_eas= eas;
            }
        }
        return find_eas;
    }
    
    public void sortNameCountry(){
        Collections.sort(list, (o1, o2) -> o1.countryName.compareTo(o2.countryName));
        displayList(list);               
    }
    
            
}
