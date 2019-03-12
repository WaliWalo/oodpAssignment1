/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodpassignment1;
import static oodpassignment1.InterestingPlace.placeTown;
/**
 *
 * @author User
 */
public class InterestingPlaces extends InterestingPlace{
            
    public void setPlaces(){
        InterestingPlace place1 = new InterestingPlace();
        place1.Place("Galway","Galway Atlantaquaria, National Aquarium of Ireland"
                    ,"Take A Tour Of Galway Aquarium or just enjoy at your leisure, talks throughout the day include the Big Fish Feeding, Touch Pool tours, Fresh water Fish Feeding."
                    ,"Seapoint Promenade, Galway"
                    ,"atlantaquaria.jpeg");
        place1.Place("Galway","Dunguaire Castle"
                    ,"Dunguaire Castle is a 16th-century tower house on the southeastern shore of Galway Bay in County Galway, Ireland, near Kinvara."
                    ,"Dungory East, Kinvarra, Co. Galway"
                    ,"Dunguaire_Castle,_Galway,_Ireland.png");
        place1.Place("Galway","Athenry Castle"
                    ,"For about five centuries Athenry Castle has been abandoned, roofless and fallen into a ruinous state."
                    ,"Gorteenacra, Athenry, Co. Galway"
                    ,"Athenry_Castle.jpg");
        place1.Place("Wicklow","Mount Usher Gardens - Avoca"
                    ,"Mount Usher Gardens, located at Ashford, Ireland, was laid out in 1868. It is spread on twenty acres of land along River Vartry, having more than 5000 plant species."
                    ,"Mt Usher Gardens, Ashford, Co. Wicklow"
                    ,"avoca.jpg");
        place1.Place("Wicklow","Glendalough Monastic Site"
                    ,"For thousands of years people have been drawn to ‘the valley of the two lakes‘ for its spectacular scenery, rich history, archaeology and abundant wildlife."
                    ,"Derrybawn, Glendalough, Co. Wicklow"
                    ,"glendalough.jpg");
        place1.Place("Wicklow","Wicklow Gaol"
                    ,"Historic prison known for harsh conditions now open for ghost and paranormal tours and parties."
                    ,"Corporation Lands, Wicklow"
                    ,"wicklows-gaol1.jpg");
        place1.Place("Co. Kerry","Torc Waterfall"
                    ,"Torc Waterfall is a waterfall at the base of Torc Mountain, about 5 miles from Killarney in County Kerry, Ireland."
                    ,"Co., Cloghereen Upper, Co. Kerry"
                    ,"vic_torcwaterfall.jpg");
        place1.Place("Co. Kerry","Dingle Oceanworld Aquarium"
                    ,"Indoor attraction with a variety of fish, sharks, penguins & otters, plus a kids' touch pool."
                    ,"The Wood, Farrannakilla, Dingle, Co. Kerry"
                    ,"dingleOceanworld.jpg");
        place1.Place("Co. Kerry","Muckross Abbey"
                    ,"Muckross Abbey is one of the major ecclesiastical sites found in the Killarney National Park, County Kerry, Ireland."
                    ,"Carrigafreaghane, Co. Kerry"
                    ,"Muckross_Abbey_Friary_2014.jpg");
        place1.Place("Co. Clare","Doolin Cave"
                    ,"Pol an Ionain is a limestone cave near Doolin in County Clare, Ireland, on the western edge of The Burren."
                    ,"Craggycorradan East, Doolin, Co. Clare"
                    ,"doolinCave.jpg");
        place1.Place("Co. Clare","Bunratty Castle & Folk Park"
                    ,"Bunratty Castle is a large 15th-century tower house in County Clare, Ireland. It is located in the centre of Bunratty village."
                    ,"Bunratty West, Bunratty, Co. Clare"
                    ,"Bunrattybig.jpg");
        place1.Place("Co. Clare","Cliffs of Moher"
                    ,"The Cliffs of Moher are located at the southwestern edge of the Burren region in County Clare, Ireland."
                    ,"Lislorkan North, Liscannor, Co. Clare"
                    ,"cliffs_of_moher1.jpg");
    }      
    
    public String[] getAllPlaceName(String town){
            String[] allPlacesName = new String[100];
            int placeSize=0;
        for(int i = 0; i < placeTown.length; i++){
            if(town.equals(placeTown[i])){
                allPlacesName[i] = places[i];                
            }
            placeSize++;
        }
        return allPlacesName;
    }
    
    public String[] getAllPlaceDesc(String town){
        InterestingPlace place = new InterestingPlace();
        String[] allPlacesDesc = new String[100];
        int placeSize=0;
        for(int i = 0; i < placeTown.length; i++){
            if(placeTown[i]==town){
                allPlacesDesc[placeSize] = place.getPlaceDesc()[i];                
            }
            placeSize++;
        }
        return allPlacesDesc;
    }
    
    public String[] getAllPlaceLoc(String town){
        InterestingPlace place = new InterestingPlace();
        String[] allPlacesLoc = new String[100];
        int placeSize=0;
        for(int i = 0; i < placeTown.length; i++){
            if(placeTown[i]==town){
                allPlacesLoc[placeSize] = place.getPlaceLoc()[i];                
            }
            placeSize++;
        }
        return allPlacesLoc;
    }
    
    public String[] getAllPlaceImg(String town){
        InterestingPlace place = new InterestingPlace();
        String[] allPlacesImg = new String[100];
        int placeSize=0;
        for(int i = 0; i < placeTown.length; i++){
            if(placeTown[i]==town){
                allPlacesImg[placeSize] = place.getPlaceImg()[i];                
            }
            placeSize++;
        }
        return allPlacesImg;
    }
}
