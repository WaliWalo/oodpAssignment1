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
public class InterestingPlace extends Town{
    private String placeName;
    public static String[] placeDescription = new String[100];
    public static String[] placeLocation = new String[100];
    public static String[] placeImgUrl = new String[100];
    private int temp = 0;
    public static String[] places = new String[100];
    public static String[] placeTown = new String [100];
    int size = 0;
        
    public void Place(String tName, String pName, String pDesc, String pLoc, String pImg){
        int i;
        
        for(i = 0; i < towns.length; i++){
            if(tName.equals(towns[i])){
                temp++;
            }
        }        
        
        if(temp > 0){
            placeName = pName;
            placeDescription[size] = pDesc;
            placeLocation[size] = pLoc;
            placeImgUrl[size] = pImg;
            places[size] = pName;
            placeTown[size] = tName;
            size++;
        }else{            
            System.out.println("Create a town first before entering a place." + towns[0]);
        }
    }
    
    public String[] getPlaceTown(){
        return placeTown;
    }
    
    public int getPlacesLength(){
        return places.length;
    }
    
    public String[] getPlaces(){
        return places;
    }
    
    public String getPlaceName(){
        return placeName;
    }
    
    public String[] getPlaceDesc(){
        return placeDescription;
    }
    
    public String[] getPlaceLoc(){
        return placeLocation;
    }
    
    public String[] getPlaceImg(){
        return placeImgUrl;
    }
}
