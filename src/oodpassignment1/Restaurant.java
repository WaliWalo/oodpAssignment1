/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodpassignment1;

/**
 *
 * @author User
 */
public class Restaurant extends Town{
    private String restaurantName;
    public static String[] restaurantDescription = new String[100];
    public static String[] restaurantLocation = new String[100];
    public static String[] restaurantImgUrl = new String[100];
    private int temp = 0;
    public static String[] restaurants = new String[100];
    public static String[] restaurantTown = new String [100];
    int size = 0;
        
    public void Restaurant(String tName, String rName, String rDesc, String rLoc, String rImg){
        int i;
        
        for(i = 0; i < towns.length; i++){
            if(tName.equals(towns[i])){
                temp++;
            }
        }        
        
        if(temp > 0){
            restaurantName = rName;
            restaurantDescription[size] = rDesc;
            restaurantLocation[size] = rLoc;
            restaurantImgUrl[size] = rImg;
            restaurants[size] = rName;
            restaurantTown[size] = tName;
            size++;
        }else{            
            System.out.println("Create a town first before entering a restaurant." + towns[0]);
        }
    }
    
    public String[] getRestaurantTown(){
        return restaurantTown;
    }
    
    public int getRestaurantsLength(){
        return restaurants.length;
    }
    
    public String[] getRestaurants(){
        return restaurants;
    }
    
    public String getRestaurantName(){
        return restaurantName;
    }
    
    public String[] getRestaurantDesc(){
        return restaurantDescription;
    }
    
    public String[] getRestaurantLoc(){
        return restaurantLocation;
    }
    
    public String[] getRestaurantImg(){
        return restaurantImgUrl;
    }
}
