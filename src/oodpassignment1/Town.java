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
public class Town {
    private static String townName;
    private static String[] townDescription = new String[100];;
    private static String[] townLocation = new String[100];;
    private static String[] townImg = new String[100];;
    public static String[] towns = new String[100];
    private int size = 0;
   
    public void setTown(String tName, String tDesc, String tLoc, String tImg){
        townName = tName;
        townDescription[size] = tDesc;
        townLocation[size] = tLoc;
        townImg[size] = tImg;
        towns[size] = tName;
        size++;
    }
   

     public String[] getTownDesc(){
        return townDescription;
    }
    
    public String[] getTownLoc(){
        return townLocation;
    }
    
    public String[] getTownImg(){
        return townImg;
    }
    
    public String[] getTowns(){
        return towns;
    }
    
}
