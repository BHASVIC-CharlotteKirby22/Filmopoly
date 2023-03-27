package com.company;
import javax.swing.*;

public class FilmCard extends JFrame{
    private JPanel Filmcards;
    private JLabel title;
    private JLabel filmname;
    private JLabel currentlevel;
    private JLabel level;
    private JLabel level0;
    private JLabel level1;
    private JLabel level2;
    private JLabel level3;
    private JLabel cost;
    private JLabel owner;
    private JLabel cost0;
    private JLabel cost1;
    private JLabel cost2;
    private JLabel cost3;
    private JLabel totalcost;
    private JLabel ownername;




    public FilmCard(String Cname, String COname,  int CCost, int CCLevel, int CFee, int Ccost1, int Ccost2, int Ccost3) {
        setContentPane(Filmcards);
        setTitle("Film Card");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        filmname.setText(Cname);
        ownername.setText(COname);
        totalcost.setText(Integer.toString(CCost));
        level.setText(Integer.toString(CCLevel));
        cost0.setText(Integer.toString(CFee));
        cost1.setText(Integer.toString(Ccost1));
        cost2.setText(Integer.toString(Ccost2));
        cost3.setText(Integer.toString(Ccost3));

    }
}
