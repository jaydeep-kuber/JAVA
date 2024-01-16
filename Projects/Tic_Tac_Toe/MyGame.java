package Tic_Tac_Toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyGame extends JFrame implements ActionListener {

    JLabel Heading;
    JPanel mainpanl;
    JButton[] btns = new JButton[9];
    Font font = new Font("", Font.ROMAN_BASELINE, 30);

    // instance of game

    int gameChance[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int activePlayer = 0;

    // for winner
    int[][] winComb={
        {0,1,2},{3,4,5},{6,7,8},{6,3,0},{1,4,7},{2,6,9},{4,0,8},{4,2,6}
    };
    
    int winner = 2;

    // Draw Logic
    // boolean GameOver = false;


    MyGame() {
        setTitle("TIc Tac Toe Game");
        setSize(700, 700);
        ImageIcon imgIcon = new ImageIcon("Tic_Tac_Toe/img/icon.png");
        setIconImage(imgIcon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();

        setVisible(true);

    }

    public void createGUI() {
        // Background Color
        this.getContentPane().setBackground(Color.decode("#006262"));
        this.setLayout(new BorderLayout());

        // north Top Section

        // Heading
        Heading = new JLabel("Tic Tac Toe Game");
        Heading.setFont(font);
        Heading.setForeground(Color.white);

        // add heading in north -Top
        this.add(Heading, BorderLayout.NORTH);
        Heading.setHorizontalAlignment(SwingConstants.CENTER);

        ////////////////// pannel ////////////////////

        mainpanl = new JPanel();

        mainpanl.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton();
            mainpanl.add(btn);
            btn.setFont(font);
            btn.setBackground(Color.decode("#8DA399"));
            btns[i - 1] = btn;
            btn.addActionListener(this);
            btn.setName(String.valueOf(i - 1));
        }
        this.add(mainpanl, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton currentButton = (JButton) e.getSource();

        String str = currentButton.getName();
        // System.out.println("CLicked"+str);
        int name = Integer.parseInt(str.trim());

       

        if (gameChance[name] == 2) {

            if (activePlayer == 1) {
                currentButton.setIcon(new ImageIcon("Tic_Tac_Toe/img/x1.png"));
                gameChance[name] = activePlayer;

                activePlayer = 0;
            } else {

                currentButton.setIcon(new ImageIcon("Tic_Tac_Toe/img/o1.png"));
                gameChance[name] = activePlayer;
                activePlayer = 1;
            }

            /////////// Winner Logic ////////////

            for (int[]  Temp : winComb) {

                if ((gameChance[Temp[0]] == gameChance[Temp[1]]) && (gameChance[Temp[1]] == gameChance[Temp[2]])
                        && (gameChance[Temp[2]] != 2)) {
                   
                    winner = gameChance[Temp[0]];
                    JOptionPane.showMessageDialog(null, "Congrats Player ~[" + winner + "]~ You Win :)");
                    int i = JOptionPane.showConfirmDialog(null, "Do You Want To Play Again..?");
                    if (i == 0) {
                        this.setVisible(false);
                        new MyGame();
                    }
                    else if (i == 1) {
                        System.exit(000);
                    }else{}
                    System.out.println(i);
                    break;
                }
                
            }

        } else {
            JOptionPane.showMessageDialog(this, "Alredy Inserted... ");
        }

    }

    // igore for warningb
    void show(String name) {
        System.out.println("hello" + name);
    }

}