package com.company;

import java.util.ArrayList;
import java.net.FileNameMap;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int place = 6;

        ArrayList<FILM> Films2 = new ArrayList<FILM>();

        Films2.add(new FILM("The Godfather", 1500, 20,25));
        Films2.add(new FILM("Scarface", 1500,20, 24));
        Films2.add(new FILM("Titanic", 1500,20, 23));
        Films2.add(new FILM("Casablanca", 1500,20, 22));
        Films2.add(new FILM("American Beauty", 1500,20, 21));
//
        Films2.add(new FILM("Requiem for a dream", 1000,10, 20));
        Films2.add(new FILM("Taxi Driver", 1000,10, 19));
        Films2.add(new FILM("The Exocist", 1000,10, 18));
        Films2.add(new FILM("Fight Club", 1000,10, 17));
        Films2.add(new FILM("Eyes Wide shut", 1000,10, 16));
//
        Films2.add(new FILM("Lost in Translation", 750,7, 15));
        Films2.add(new FILM("The Shining", 750,7, 14));
        Films2.add(new FILM("Carrie", 750,7, 12));
        Films2.add(new FILM("Leon", 750,7, 11));
//
        Films2.add(new FILM("Black Swan", 500,5, 10));
        Films2.add(new FILM("Girl Interupted", 500,5, 9));
        Films2.add(new FILM("Helter Skelter", 500,5, 8));
        Films2.add(new FILM("Fallen Angels", 500,5, 7));
        Films2.add(new FILM("Midsummer", 500,5, 6));
//
        Films2.add(new FILM("Belladonna of Sadness", 250,2, 5));
        Films2.add(new FILM("Pulp Fiction", 250,2, 4));
        Films2.add(new FILM("The Trumen Show", 250,2, 3));
        Films2.add(new FILM("Eternal Sunshine of the Spotless Mind", 250,2, 2));
        Films2.add(new FILM("Scott Pilgrem vs The World", 250,2, 1));
//
int cost1= 0;
int cost2= 0;
int cost3= 0;

        if (place >= 0 && place <=4){
             cost1 = 75;  cost2 =200; cost3 =750;
        }
        else if (place >= 5 && place <=9){
             cost1 = 50;  cost2 =100; cost3 =500;
        }
        else if (place >= 10 && place <=14){
             cost1 = 40;  cost2 =75; cost3 =300;
        }
       else if (place >= 15 && place <=19){
             cost1 = 30;  cost2 =50; cost3 =200;
        }
       else if (place >= 20 && place <=24){
             cost1 = 20;  cost2 =40; cost3 =100;
        }




        FilmCard filmform = new FilmCard(Films2.get(place).getFilmName(),Films2.get(place).getOwner(), Films2.get(place).getCost(), Films2.get(place).getCLevel(), Films2.get(place).getFee(), cost1, cost2, cost3 );


    }

}