package com.synisys.dataManager;

import java.util.ArrayList;

public class SearchDataManager {
    private String[] data = {" Sheila Preston" ,
            "Garth Butler" ,
            "Donna Ortiz" ,
            "Liberty Jennings" ,
            "Azalia Burch" ,
            "Amir Swanson" ,
            "Sydnee Beach" ,
            "Phoebe Spencer" ,
            "Shaine Flowers" ,
            "Hayes Higgins" ,
            "Scarlet Johns" ,
            "Raja Shelton" ,
            "Brenna Langley" ,
            "Kelly Hooper" ,
            "Gail Knight" ,
            "Nita Everett" ,
            "Neville Finley" ,
            "Hashim Wilkins" ,
            "Uriel Beach" ,
            "Troy Cobb" ,
            "Kerry Phillips" ,
            "Allen Rose" ,
            "Debra Larsen" ,
            "Joshua Ramirez" ,
            "Rina Chapman" ,
            "Nicole Aguirre" ,
            "Joshua Lane" ,
            "Olga Mathis" ,
            "Madison Diaz" ,
            "Nathan Holder" ,
            "Austin Oneill" ,
            "Tyler Gentry" ,
            "Mara Faulkner" ,
            "Maite Logan" ,
            "Rebekah Rollins" ,
            "Axel Frye" ,
            "Dakota Franco" ,
            "Ursula Sexton" ,
            "Nicole Middleton" ,
            "Christopher Kirk" ,
            "Daria Stafford" ,
            "Hamilton Nunez" ,
            "Keaton Henson" ,
            "Signe Quinn" ,
            "Belle Mcpherson" ,
            "Neve Dominguez" ,
            "Ahmed Whitley" ,
            "Laurel Craig" ,
            "Dane Wise" ,
            "Zorita William" ,
            "Mallory Graham" ,
            "Wyoming Knowles" ,
            "Katelyn Blankenship" ,
            "Martena Armstrong" ,
            "Aileen Mccarthy" ,
            "Tarik Robles" ,
            "Kylee Zamora" ,
            "Noble Schwartz" ,
            "Igor Hodges" ,
            "Merritt Wallace" ,
            "Paul Odom" ,
            "Imelda Baxter" ,
            "Grant Oneil" ,
            "Carson Small" ,
            "Carter Melendez" ,
            "Kevin Lewis" ,
            "Kaitlin Petty" ,
            "Ralph Ferguson" ,
            "Ruth Frost" ,
            "Flavia Bradley" ,
            "Althea Hinton" ,
            "Derek Shaffer" ,
            "Ocean Moses" ,
            "Naida Wise" ,
            "Meghan Montoya" ,
            "Quin Cobb" ,
            "Marah King" ,
            "Owen Bridges" ,
            "Kylie Jacobson" ,
            "Macy Espinoza" ,
            "Salvador Slater" ,
            "Price Bradley" ,
            "Odysseus Pollard" ,
            "Wayne Livingston" ,
            "Magee Noel" ,
            "Gavin Rice" ,
            "Kirsten Munoz" ,
            "Tasha Bowman" ,
            "Ciara Dunlap" ,
            "Uta Grimes" ,
            "Kasper Higgins" ,
            "Victoria Carroll" ,
            "Adara Reynolds" ,
            "Faith Burke" ,
            "Calista Oconnor" ,
            "Tiger Hancock" ,
            "Yetta Wilkinson" ,
            "Igor Dale" ,
            "Joelle Larsen" ,
            "Edward Howell"};

    public String[] getData() {
        return data;
    }
    public ArrayList<String> contains(String str){
        ArrayList<String> result = new ArrayList<String>();
        for( String item : data) {
            if(item.toLowerCase().startsWith(str.toLowerCase())){
                result.add(item);
            }
        }
        return result;
    }

}