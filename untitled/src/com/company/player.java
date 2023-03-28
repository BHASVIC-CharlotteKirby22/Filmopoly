package com.company;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class player {

    private int amountofplayers;
    private int money = 1500;
    private int turn;
    private String name;
    private String actor;
    private int playeramount;
    private String[] actors = {"Michael Cera", "Leonardo Dicaprio", "Brad Pitt", "Magrot Robbie", "Natasha Lyonne", "Jared Leto"};

    public player(String playername,String playeractor,int playermoney,int playerposition){
        actor = playeractor;
        name = playername;
        money = playermoney;

    }

    public void setActor(){
        boolean actorchosen = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your actor from the following" + String.valueOf(actors));
        String actorinput = input.nextLine();
        while(actorchosen = false) {
            for (int i = actors.length; i > 0; i--) {
                if (actorinput == actors[i] && actors[i] != "REMOVED") {
                    actors[i] = "REMOVED";
                    actor = actorinput;
                    actorchosen = true;
                    break;
                } else {
                    System.out.println("Actor is either taken or you have put the wrong one.");
                }

            }
        }
    }
    public void nextturn()
    {
        if (turn > amountofplayers){
            turn = 1;
        }
        else{
            turn++;
        }
    }
    public void addmoney(int addedmoney)
    {
        money = money + addedmoney;
    }
    public void deductmoeny(int reducdedmoney)
    {
        money = money - reducdedmoney;
    }

}
