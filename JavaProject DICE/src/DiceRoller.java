import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;



public class DiceRoller extends JFrame implements ActionListener {
    private JLabel dice1, dice2;
    private ImageIcon[] diceImages;
    private JButton rollButton;
    private Timer timer1, timer2;
    private int dice1Value, dice2Value;


    public DiceRoller() {
        setTitle("Dice Roller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        int Num1 = (int) (Math.random() * 6) + 1;
        int Num2 = (int) (Math.random() * 6) + 1;

        // Load dice images
        diceImages = new ImageIcon[6];
        diceImages[0] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\Dice-1.jpg");
        diceImages[1] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\dice-2.png");
        diceImages[2] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\Dice-3.png");
        diceImages[3] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\Dice-3.png");
        diceImages[4] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\dice-5.png");
        diceImages[5] = new ImageIcon("C:\\Users\\tasnim\\IdeaProjects\\JavaProject DICE\\.idea\\dice-6.png");
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JLabel dice1 = new JLabel(diceImages[0]);
        JLabel dice2 = new JLabel(diceImages[0]);

        add(dice1);
        add(dice2);
        label.setVisible(true);
        rollButton = new JButton("Roll");
        rollButton.addActionListener(this);
        add(new JLabel()); // empty label for spacing
        add(rollButton);
        setVisible(true);


        // timer for how quickly the images are flicking through:
        timer1 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomnumber = (int) (Math.random() * 6) + 1;
                dice1.setIcon(diceImages[randomnumber]);
            }
        });
        timer2 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomnumber2 = (int) (Math.random() * 6) + 1;
                dice2.setIcon(diceImages[randomnumber2]);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rollButton) {
            timer1.start();
            timer2.start();
            // Stop rolling dice after 1 second
            new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    timer1.stop();
                    timer2.stop();
                    // Set dice values
                    dice1Value = (int) (Math.random() * 6) + 1;
                    dice2Value = (int) (Math.random() * 6) + 1;


                }
            }).start();
        }
    }

    public static void main(String[] args) {

        DiceRoller gui = new DiceRoller();
        gui.setVisible(true);




    }
}


