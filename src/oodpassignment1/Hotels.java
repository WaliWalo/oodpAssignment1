/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodpassignment1;

import static oodpassignment1.Hotel.hotelTown;

/**
 *
 * @author User
 */
public class Hotels extends Hotel{
            
    public void setHotels(){
        Hotel hotel1 = new Hotel();
        hotel1.Hotel("Galway","Radisson Blu Hotel & Spa"
                ,"This stylish waterfront hotel, set on the Lough Atalia, lies "
                        + "230 m from the Galway railway station and a 5-minute walk from Eyre Square."
                ,"Lough Atalia Rd, Galway"
                ,"RadissonHotelGalway.jpg");
        hotel1.Hotel("Galway","Harbour Hotel Galway"
                ,"This upscale waterfront hotel is a 7-minute walk from Eyre "
                        + "Square and a kilometer from Saint Nicholas Collegiate Church."
                ,"New Dock Road, Galway"
                ,"harbour-hotel-galway.jpg");
        hotel1.Hotel("Galway","Menlo Park Hotel"
                ,"This upmarket hotel is 3.1 km from the Galway City Museum and 5.9 km from the Salthill promenade."
                ,"Headford Rd, Galway"
                ,"menloPark.jpg");
        hotel1.Hotel("Wicklow","Summerhill House Hotel Wicklow"
                ,"Set in 5 acres of gardens, this country house hotel is 2 km from Powerscourt Golf Club, and 7.2 km from Killruddery House and Gardens."
                ,"Cookstown, Enniskerry, Co. Wicklow"
                ,"summerhill-house-hotel.jpg");
        hotel1.Hotel("Wicklow","Glenview Hotel and Leisure Club"
                ,"This traditional hotel in a garden-filled setting is 1.9 km from the Glen of the Downs Golf Club and 7.7 km from the Killruddery House & Gardens."
                ,"Bellevue Demesne, Glen of The Downs, Co. Wicklow"
                ,"glenviewHotel.jpg");
        hotel1.Hotel("Wicklow","Powerscourt Hotel"
                ,"Set on a 1000-acre estate, this posh hotel occupies a crescent-shaped Palladian-style building. It's 0.5 km from Powerscourt Golf Club, and 8 km from the seafront at Bray."
                ,"Powerscourt Estate, Tinnehinch, Enniskerry, Co. Wicklow"
                ,"powerscourtHote.jpg");
        hotel1.Hotel("Co. Kerry","Listowel Arms Hotel"
                ,"Across the street from St Johns Theatre's venue in a converted church, this circa-1840s hotel in a romantic ivy-covered building is 1.6 km from the Listowel Racecourse's 1800s horse-racing course."
                ,"The Square, Listowel, Co. Kerry"
                ,"listowel arms front at night.jpg");
        hotel1.Hotel("Co. Kerry","Dingle Bay Hotel"
                ,"Overlooking the harbour in Dingle town centre, this unassuming hotel is within 10 minutes' walk of restaurants, boat charters and Dingle Oceanworld Aquarium."
                ,"Strand St, Dingle, Co. Kerry"
                ,"dingle-bay-hotel.jpg");
        hotel1.Hotel("Co. Kerry","Best Western Eviston House Hotel"
                ,"This unpretentious hotel is 2.2 km from INEC Killarney music and event venue, and 3.2 km from the 15th-century Ross Castle."
                ,"97 New St, Killarney, Co. Kerry"
                ,"westernEviston.jpg");
        hotel1.Hotel("Co. Clare","Old Ground Hotel Ennis"
                ,"Built in the 18th century, this stylish ivy-clad hotel is opposite the Cathedral of Saints Peter & Paul, and 8 minutes' walk from the Ennis train and bus stations."
                ,"O'Connell Street, Clonroad Beg, Ennis, Co. Clare"
                ,"old-ground-hotel-18.jpg");
        hotel1.Hotel("Co. Clare","Falls Hotel & Spa"
                ,"Housed in an 18th-century mansion, this warm country hotel beside the Inagh River is 5 minutes' walk from Ennistimon and 4 km from Lahinch Golf Club."
                ,"Ennistymon, Sroohil, Ennistymon, Co. Clare"
                ,"fallsHotel.jpg");
        hotel1.Hotel("Co. Clare","Bellbridge House Hotel"
                ,"Overlooking Spanish Point beach and adjacent to Spanish Point Golf Course, this refined family-run hotel is 25 km from of the Cliffs of Moher."
                ,"Dough, Miltown Malbay, Co. Clare"
                ,"bell1landlarge.jpg");
    }      
    
    public String[] getAllHotelName(String town){
            String[] allHotelsName = new String[100];
            int hotelSize=0;
        for(int i = 0; i < hotelTown.length; i++){
            if(town.equals(hotelTown[i])){
                allHotelsName[i] = hotels[i];                
            }
            hotelSize++;
        }
        return allHotelsName;
    }
    
    public String[] getAllHotelDesc(String town){
        Hotel hotel = new Hotel();
        String[] allHotelsDesc = new String[100];
        int hotelSize=0;
        for(int i = 0; i < hotelTown.length; i++){
            if(hotelTown[i]==town){
                allHotelsDesc[hotelSize] = hotel.getHotelDesc()[i];                
            }
            hotelSize++;
        }
        return allHotelsDesc;
    }
    
    public String[] getAllHotelLoc(String town){
        Hotel hotel = new Hotel();
        String[] allHotelsLoc = new String[100];
        int hotelSize=0;
        for(int i = 0; i < hotelTown.length; i++){
            if(hotelTown[i]==town){
                allHotelsLoc[hotelSize] = hotel.getHotelLoc()[i];                
            }
            hotelSize++;
        }
        return allHotelsLoc;
    }
    
    public String[] getAllHotelImg(String town){
        Hotel hotel = new Hotel();
        String[] allHotelsImg = new String[100];
        int hotelSize=0;
        for(int i = 0; i < hotelTown.length; i++){
            if(hotelTown[i]==town){
                allHotelsImg[hotelSize] = hotel.getHotelImg()[i];                
            }
            hotelSize++;
        }
        return allHotelsImg;
    }
}
