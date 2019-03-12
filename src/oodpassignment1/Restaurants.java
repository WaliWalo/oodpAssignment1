/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodpassignment1;
import static oodpassignment1.Restaurant.restaurantTown;
/**
 *
 * @author User
 */
public class Restaurants extends Restaurant{
            
    public void setRestaurants(){
        Restaurant restaurant1 = new Restaurant();
        restaurant1.Restaurant("Galway","The Seafood Bar"
                                ,"Chic, 2-floor restaurant with pine furnishings and framed pictures, plus occasional live jazz music."
                                ,"Kirwan's Ln, Galway"
                                ,"seafoodBar.jpg");
        restaurant1.Restaurant("Galway","Cava Bodega"
                                ,"Popular Spanish restaurant serving beers, wines and 50 regional tapas made from local ingredients."
                                ,"1 Middle Street, Galway"
                                ,"cava-bodega.jpg");
        restaurant1.Restaurant("Galway","Brasserie On The Corner"
                                ,"Locally sourced fish, plus steaks and deli boards in a chic exposed brick and dark wood restaurant. "
                                ,"25 Eglinton St, Galway"
                                ,"brasserieOnTheCorner.jpg");
        restaurant1.Restaurant("Wicklow","The Bridge Tavern"
                                ,"The Bridge Tavern is located in the heart of Wicklow Town, sitting alongside the Vartry River as it enters Wicklow Harbour. The building dates back to the early 1700s."
                                ,"Bridge St, Wicklow"
                                ,"the-bridge-tavern.jpg");
        restaurant1.Restaurant("Wicklow","The Wicklow Heather"
                                ,"The Wicklow Heather Restaurant is idyllically situated in the picturesque village of Laragh deep in the Wicklow Mountains, only minutes from the world renowned scenic and historic Glendalough."
                                ,"Glendalough Road, Ballard, Laragh, Co. Wicklow"
                                ,"the-wicklow-heather.jpg");
        restaurant1.Restaurant("Wicklow","Bates"
                                ,"Bates has been around for a very long time and the commitment of the management and staff and customers means that it will still be here in another 250 years."
                                ,"3 Market Street,Market Square,Rathdrum,County Wicklow, Balleese Lower, Co. Wicklow"
                                ,"Bates_ext.jpg");
        restaurant1.Restaurant("Co. Kerry","Quinlans Seafood Bar"
                                ,"We are a family Seafood business based in Caherciveen, Co Kerry on the South West coast of Ireland. "
                                ,"77 High Street, Killarney, Co. Kerry"
                                ,"quinlans.jpg");
        restaurant1.Restaurant("Co. Kerry","Out of the Blue"
                                ,"Everything depends upon the catch of the day and nothing but the best will do. If there’s no fish, the restaurant doesn’t open."
                                ,"Waterside, Farrannakilla, Dingle, Co. Kerry"
                                ,"outOfTheBlue.jpg");
        restaurant1.Restaurant("Co. Kerry","Bricín Restaurant and Boxty House"
                                ,"The fusion of Celtic imagination and loyalty to the best of what Ireland represents is at the heart of the success story of our business."
                                ,"26 High Street, Killarney, Co. Kerry"
                                ,"bricin.jpg");
        restaurant1.Restaurant("Co. Clare","The Market Bar"
                                ,"From a great breakfast through lunch to a superb evening meal, we have a dish for you!"
                                ,"Merchants Square, Clonroad Beg, Ennis, Co. Clare"
                                ,"theMarketBar.png");
        restaurant1.Restaurant("Co. Clare","The Cloister Restaurant & Bar"
                                ,"A contemporary space in a historical setting where regional quality ingredients and simplicity of the cooking speaks for itself."
                                ,"Abbey St, Lifford, Ennis, Co. Clare"
                                ,"cloister-restaurant.jpg");
        restaurant1.Restaurant("Co. Clare","Quinlans Seafood Bar"
                                ,"At The Old Bakehouse we strive to deliver a memorable dinning experience for all our customers. Our philosophy is simple, “Quality food, sourced locally”."
                                ,"Main St, Leagard North, Milltown Malbay, Co. Clare"
                                ,"oldBakeHouse.jpg");
    }      
    
    public String[] getAllRestaurantName(String town){
            String[] allRestaurantsName = new String[100];
            int restaurantSize=0;
        for(int i = 0; i < restaurantTown.length; i++){
            if(town.equals(restaurantTown[i])){
                allRestaurantsName[i] = restaurants[i];                
            }
            restaurantSize++;
        }
        return allRestaurantsName;
    }
    
    public String[] getAllRestaurantDesc(String town){
        Restaurant restaurant = new Restaurant();
        String[] allRestaurantsDesc = new String[100];
        int restaurantSize=0;
        for(int i = 0; i < restaurantTown.length; i++){
            if(restaurantTown[i]==town){
                allRestaurantsDesc[restaurantSize] = restaurant.getRestaurantDesc()[i];                
            }
            restaurantSize++;
        }
        return allRestaurantsDesc;
    }
    
    public String[] getAllRestaurantLoc(String town){
        Restaurant restaurant = new Restaurant();
        String[] allRestaurantsLoc = new String[100];
        int restaurantSize=0;
        for(int i = 0; i < restaurantTown.length; i++){
            if(restaurantTown[i]==town){
                allRestaurantsLoc[restaurantSize] = restaurant.getRestaurantLoc()[i];                
            }
            restaurantSize++;
        }
        return allRestaurantsLoc;
    }
    
    public String[] getAllRestaurantImg(String town){
        Restaurant restaurant = new Restaurant();
        String[] allRestaurantsImg = new String[100];
        int restaurantSize=0;
        for(int i = 0; i < restaurantTown.length; i++){
            if(restaurantTown[i]==town){
                allRestaurantsImg[restaurantSize] = restaurant.getRestaurantImg()[i];                
            }
            restaurantSize++;
        }
        return allRestaurantsImg;
    }
}
