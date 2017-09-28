/**
 * Steven Clubb
 * 9/8/2017
 * CS 2050-001
 * 
 */
package hw3;

import java.util.ArrayList;


public class Borders {
    private ArrayList<Countries> countries; 
    private int z;
    public Borders(ArrayList<Countries> countries){
        this.countries = countries;
    }
    
    public boolean isBordering(String c1, String c2){
        
        boolean bordering = false;
        // find C1 in arraylist
        // search Neighbors list for c2
        // if c2 is found, return true
        // else return false
       // for(int i = 0; )
       
       //this method checks if two countries border each other
       for(int i = 0; i < countries.size(); i++){
           if(countries.get(i).countryName.equals(c1)){
               for (int j = 0; j < countries.get(i).neighborCount; j++){
                   if(countries.get(i).Neighbors[j].equals(c2)){
                       return true;
                   }
               }
           }
       }
        return bordering;
    }
    
}
