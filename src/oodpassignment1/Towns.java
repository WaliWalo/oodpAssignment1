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
public class Towns extends Town{
    public void setTowns(){
        Town townss = new Town();
        townss.setTown("Galway"
                        , "Galway, a harbour city on Ireland’s west coast, sits where the River Corrib meets the Atlantic Ocean"
                                + ". The city’s hub is 18th-century Eyre Square, a popular meeting spot surrounded by shops and "
                                + "traditional pubs that often offer live Irish folk music."
                        , "Dún Bhun na Gaillimhe (\"Fort at the Mouth (bottom) of the Gaillimh\") was constructed in 1124, "
                                + "by the King of Connacht, Tairrdelbach Ua Conchobair (1088–1156)."
                                + " Eventually, a small settlement grew up around this fort. During the Norman invasion of Connacht in the 1230s"
                                + ", Galway fort was captured by Richard Mor de Burgh, who had led the invasion."
                        , "galwayMap.png");
        townss.setTown("Wicklow"
                        , "Wicklow (Irish: Cill Mhantáin, meaning \"church of the toothless one\") is the county town of County Wicklow and the capital of the Mid-East Region in Ireland"
                                + ". Located south of Dublin on the east coast of the island, it has a population of 10,356 according to the 2011 census."
                        , "During excavations to build the Wicklow road bypass in 2010, a Bronze Age cooking pit (Fulach Fiadh) and hut site was uncovered in the Ballynerrn Lower area of the town"
                                + ". A radio carbon-dating exercise on the site puts the timeline of the discovery at 900 BC."
                        , "wicklowMap.jpg");
        townss.setTown("Co. Kerry"
                        , "County Kerry (Irish: Contae Chiarraí) is a county in Ireland. It is located in the South-West Region and is also part of the province of Munster"
                                + ". It is named after the Ciarraige who lived in part of the present county. "
                        , "Kerry (Irish: Ciarraí or more anciently Ciarraighe) means the \"people of Ciar\" which was the name of the pre-Gaelic tribe who lived in part of the present county"
                                + ". The legendary founder of the tribe was Ciar, son of Fergus mac Róich"
                        , "kerryMap.jpg");
        townss.setTown("Co. Clare"
                        , "County Clare (Irish: Contae an Chláir) is a county in Ireland, in the Mid-West Region and the province of Munster. Clare County Council is the local authority"
                                + ". The county had a population of 117,196 at the 2011 census."
                        , "There was a Neolithic civilisation in the Clare area — the name of the peoples is unknown, but the Prehistoric peoples left evidence behind in the form of ancient dolmen: single-chamber megalithic tombs, usually consisting of three or more upright stones. Clare is one of the richest places for these tombs in Ireland"
                                + ". The most noted one is in The Burren area; it is known as Poulnabrone dolmen which translates to hole of sorrows."
                        , "clareMap.jpg");
        
    }        
    
}
