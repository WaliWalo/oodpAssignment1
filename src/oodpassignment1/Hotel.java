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
public class Hotel extends Town{
    private String hotelName;
    public static String[] hotelDescription = new String[100];
    public static String[] hotelLocation = new String[100];
    public static String[] hotelImgUrl = new String[100];
    private int temp = 0;
    public static String[] hotels = new String[100];
    public static String[] hotelTown = new String [100];
    int size = 0;
        
    public void Hotel(String tName, String hName, String hDesc, String hLoc, String hImg){
        int i;
        
        for(i = 0; i < towns.length; i++){
            if(tName.equals(towns[i])){
                temp++;
            }
        }        
        
        if(temp > 0){
            hotelName = hName;
            hotelDescription[size] = hDesc;
            hotelLocation[size] = hLoc;
            hotelImgUrl[size] = hImg;
            hotels[size] = hName;
            hotelTown[size] = tName;
            size++;
        }else{            
            System.out.println("Create a town first before entering a hotel.");
        }
    }
    
    public String[] getHotelTown(){
        return hotelTown;
    }
    
    public int getHotelsLength(){
        return hotels.length;
    }
    
    public String[] getHotels(){
        return hotels;
    }
    
    public String getHotelName(){
        return hotelName;
    }
    
    public String[] getHotelDesc(){
        return hotelDescription;
    }
    
    public String[] getHotelLoc(){
        return hotelLocation;
    }
    
    public String[] getHotelImg(){
        return hotelImgUrl;
    }
}
