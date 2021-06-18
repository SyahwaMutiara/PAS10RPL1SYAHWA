package com.example.pas10rpl1syahwa;

import java.util.ArrayList;
import java.util.List;

public class ClubData {
    private static String[] clubName = {
            "Aston Villa",
            "Burnley",
            "Chelsea",
            "Everton",
            "Internazionale ",
            "Juventus",
            "Manchester United ",
            "Milan",
            "Palermo",
            "Persib ",

    };
    private static String[] clubDetail = {
            "Aston Villa adalah klub sepak bola profesional yang bermarkas di Villa Park, Birmingham, Inggris",
            "Burnley adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire",
            "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London",
            "Everton dalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris yang saat ini berkompetisi di Liga Premier",
            "Internazionale adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia",
            "Juventus adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte",
            "Manchester United adalah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris",
            "Milan adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A",
            "Palermo sebuah tim sepak bola Italia yang bermarkas di Palermo, Italia. Awalnya didirikan pada 1 November 1900",
            "Persib Bandung adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat",

    };
    private static int[] clubImage = {
            R.drawable.aston,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.everton,
            R.drawable.internazionale,
            R.drawable.juventus,
            R.drawable.masterunited,
            R.drawable.milan,
            R.drawable.palermo,
            R.drawable.persib,


    };

    static ArrayList<Club> getLisData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++) {
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}

