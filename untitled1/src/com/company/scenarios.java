package com.company;
import java.util.Random;

public class scenarios {
    private int money;
    private int[] scenarios = {1000,250,500,1100,750,100,50,50,100,50,-200,-1000,-500,-750,-1000,-100,-150,-50,-500,-500};
    Random rand = new Random();
    private String[] positives = {"Your film got good ratings","A fan gave you money","Zendaya joined your cast","Cinema ticket bought","go fund me","Twitter advertised you","Celebrity recommened your film","Your film is popular","Your film is rated 5/5"};
    public void random(){
        int random2 = rand.nextInt();
        int random = rand.nextInt(21);
        money = scenarios[random];

    }
}
