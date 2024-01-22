package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener,KeyListener{
    
	private int[]snakexlength=new int[750];
	private int[]snakeylength=new int[750];
    private int snakelength=3;	
    private int move=0;
	
	private boolean left=false;
	private boolean right=true;
	private boolean up=false;
	private boolean down=false;
	
	private Timer timer;  //timer variable;
	private int delay=100;  //set delayer;
	
	
	
	//used to create instances to set variables to store the image;
	private ImageIcon snakeheading =new ImageIcon("snake heading.png");
	private ImageIcon rightmouth =new ImageIcon("rightmouth.png");
	private ImageIcon leftmouth =new ImageIcon("leftmouth.png");
	private ImageIcon upmouth =new ImageIcon("upmouth.png");
	private ImageIcon downmouth =new ImageIcon("downmouth.png");
	private ImageIcon snakeimage =new ImageIcon("snakeimage.png");
	
	
	GamePanel(){
		addKeyListener(this);   //used for enabling keypad instructions.
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
		
		timer=new Timer(delay,this);   //used to set timer to create panel wrt delay;
		timer.start();
	}
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.white);
		g.drawRect(24,10,851,55);
		g.drawRect(24,74,851,576);
		
		snakeheading.paintIcon(this,g,25,11);
		
		if(move==0) {
			snakexlength[0]=100;
			snakexlength[1]=75;
			snakexlength[2]=50;
			
			snakeylength[0]=100;
			snakeylength[1]=100;
			snakeylength[2]=100;
			move++;
		}
		
		if(left) {
			leftmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
		}
		if(right) {
			rightmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
		}
		if(up) {
			upmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
		}
		if(down) {
			downmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
		}
		
		for(int i=1;i<snakelength;i++) {
			snakeimage.paintIcon(this, g, snakexlength[i], snakeylength[i]);
		}
		g.dispose();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		for(int i=snakelength-1;i>0;i--) {
			snakexlength[i]=snakexlength[i-1];
		}
		if(left) {
			snakexlength[0]-=25;
		}
		if(right) {
			snakexlength[0]=snakexlength[0]+25;
		}
		if(up) {
			snakeylength[0]-=25;
		}
		if(down) {
			snakeylength[0]+=25;
		}
		if(snakexlength[0]>850)snakexlength[0]=25;
		if(snakexlength[0]<25)snakexlength[0]=850;
		
		if(snakeylength[0]<75)snakeylength[0]=575;
		if(snakeylength[0]>575)snakexlength[0]=25;
		
		repaint();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			right=true;
			left=false;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			right=false;
			left=true;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			right=false;
			left=false;
			up=true;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			right=false;
			left=false;
			up=false;
			down=true;
		}
	}



	@Override
	public void keyPressed(KeyEvent e) {
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
