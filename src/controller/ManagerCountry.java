/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.EastAsiaCountries;
import model.ListCountry;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManagerCountry extends Menu<String>{

    private ListCountry list= new ListCountry();
    private ArrayList<EastAsiaCountries> list_eas;
    
    public ManagerCountry(String title, String[] s){
        super(title, s);
    }
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list_eas= list.addCountry();
                break;
            case 2:
                list.displayList(list_eas);
                break;
            case 3:
                list.searchCountry();
                break;
            case 4:
                list.sortNameCountry();
                break;
            case 5:
                System.exit(0);           
        }
    }
    
    
}
