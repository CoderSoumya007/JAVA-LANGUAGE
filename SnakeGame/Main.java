package SnakeGame;

import javax.swing.JFrame;
import java.awt.Color;


public class Main {
    public static void main(String[] args) {
        
    
    JFrame frame=new JFrame("SnakeGame");
frame.setBounds(10,10,905,700);
frame.setResizable(false);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

GamePanel panel=new GamePanel();
panel.setBackground(Color.black);
frame.add(panel);

}
}
