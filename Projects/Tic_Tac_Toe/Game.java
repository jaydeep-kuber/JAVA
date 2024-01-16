package Tic_Tac_Toe;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Game extends JFrame{

    JLabel Head ;
    Font font = new Font("", Font.ROMAN_BASELINE, 30);
    // constructor
    Game(){
        setTitle("Tic Tac Toe Game");
        ImageIcon imageIcon=new ImageIcon("Tic_Tac_Toe/img/icon.png");
        setIconImage(imageIcon.getImage());
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI();
        setVisible(true);
    }

    public void GUI() {
        Head = new JLabel("Tic-Tac-Toe");
        Head.setFont(font);
        this.setLayout(new BorderLayout());
        this.add(Head, BorderLayout.NORTH);
        Head.setHorizontalAlignment(SwingConstants.CENTER);
        
        
    }

    public void ignore(){
        System.out.println("game runnig....");
    }
    
}
