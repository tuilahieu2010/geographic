/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Country;
import Model.ManageEastAsiaCountries;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class ManagerMenu extends Menu<String> {
 ArrayList<Country> lc = new ArrayList<>();
    static String[] mc = {"Input the information of 11 countries in East Asia", 
                          "Display the information of country you've just input",
                          "Search the information of country by user-entered name", 
                          "Display the information of countries sorted name in ascending",
                          "Exit"};

    public  ManagerMenu() {
        super("MAIN MENU", mc);
      
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                    ManageEastAsiaCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
        }
    }
}