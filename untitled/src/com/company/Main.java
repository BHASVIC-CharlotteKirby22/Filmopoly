package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;
public class Main {
    private static int amountofplayers;

    public static void main(String[] args) {
        while (true) {
            System.out.println("How many players do you want?");
            Scanner input = new Scanner(System.in);
            int amountofplayers = Integer.valueOf(input.nextLine());
            if (amountofplayers > 4){
                 System.out.println("Invalid amount of players");
                 continue;
            }
            else if(amountofplayers < 2){
                System.out.println("Invalid amount of players");
                continue;
            }
            else{
                break;
            }
        }

        ArrayList<player> players = new ArrayList<player>();
        for(int x = amountofplayers;x > 0;x--){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name");
            String playername = input.nextLine();
            String name = playername;
            players.add(new player(name,"",1500,0));
        }
        players.forEach(player::setActor);




        }
    }