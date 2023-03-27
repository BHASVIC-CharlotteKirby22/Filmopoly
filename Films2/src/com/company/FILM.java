package com.company;

import java.util.Random;
import java.util.Scanner;

public class FILM {
    private String FilmName;
    private String Owner;
    private int CLevel;
    private int Cost;
    private int Fee;
    private int Place;


    public FILM(String FName, int FCost, int FFee, int FPlace) {
        FilmName = FName;
        Cost = FCost;
        Fee = FFee;
        Place = FPlace;
        CLevel = 0;
        Owner = "none";


    }

    public void upgrade() {
        // money = money - Cost
        CLevel++;
        //increases level
        if ((Place <= 25) && (Place >= 21)) {
            if (CLevel == 1) {
                Fee = 75;
            } else if (CLevel == 2) {
                Fee = 200;
            } else if (CLevel == 3) {
                Fee = 750;
            }
        } else if ((Place <= 20) && (Place >= 16)) {
            if (CLevel == 1) {
                Fee = 50;
            } else if (CLevel == 2) {
                Fee = 100;
            } else if (CLevel == 3) {
                Fee = 500;
            }
        } else if ((Place <= 15) && (Place >= 11)) {
            if (CLevel == 1) {
                Fee = 40;
            } else if (CLevel == 2) {
                Fee = 75;
            } else if (CLevel == 3) {
                Fee = 300;
            }
        } else if ((Place <= 10) && (Place >= 6)) {
            if (CLevel == 1) {
                Fee = 30;
            } else if (CLevel == 2) {
                Fee = 50;
            } else if (CLevel == 3) {
                Fee = 200;
            }
        } else if ((Place <= 5) && (Place >= 1)) {
            if (CLevel == 1) {
                Fee = 20;
            } else if (CLevel == 2) {
                Fee = 40;
            } else if (CLevel == 3) {
                Fee = 100;
            }
            //checks which level and updates the fee accordingly also takes into account place on board
        }
    }

    public void FOwner() {
        if (Owner == "none") {
            //give option to buy
            System.out.println("Noone owns this film, would you like to buy? Y/N");
            Scanner scanner = new Scanner(System.in);
            String ans1 = scanner.nextLine();
            if (ans1 == "Y") {
                // money = money - cost
                // Owner = playing player
            }
            //  else if (ans1 == "N"){
            //keep going
            // }
        } else // if owner != playing player //
        {
            //amount of fee
            System.out.println("You landed on someone elses land fee = " + Fee);
            //money = money - fee
        }
    }


    public String getFilmName() {
        return FilmName;
    }
    public String getOwner(){
        return Owner;
    }
    public int getCost(){
        return Cost;
    }
    public int getCLevel(){
        return CLevel;
    }
    public int getFee(){
        return Fee;
    }
}
