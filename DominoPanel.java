import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class DominoPanel extends JPanel implements KeyListener{
private int choice = 1;
public DominoPanel() {
	addKeyListener(this);
}
public void addNotify()
{
	super.addNotify();
	requestFocus();
}
@Override
public void paint(Graphics g) {
	// storing domino numbers & randomize pre 
	//super.paint(g);
	DominoNumber num = new DominoNumber();
	num.storeDominoNumber();
	num.rando();
	// create 4 players & distribute random dominoes
	DominoPlayer Player1 = new DominoPlayer(num.getrando());
	DominoPlayer Player2 = new DominoPlayer(num.getrando());
	DominoPlayer Player3 = new DominoPlayer(num.getrando());
	DominoPlayer Player4 = new DominoPlayer(num.getrando());
	//draw outline
	
	g.drawLine(160, 0, 160, 580);
	g.drawLine(0, 150, 160, 150);
	g.drawLine(0, 580, 1600, 580);
	//draw player score
	g.drawString("Score", 0, 10);
	g.drawString("Player 1:" + Player1.getScore(), 0, 40);
	g.drawString("Player 2:" + Player2.getScore(), 0, 70);
	g.drawString("Player 3:" + Player3.getScore(), 0, 100);
	g.drawString("Player 4:" + Player4.getScore(), 0, 130);
	
	//draw instructions

	//draw dominoes
	
	switch(choice)
	{
		case 1: g.clearRect(150,590,1450,960);
				g.setColor(Color.pink);
				g.fillRect(150,590,1450,960);
				g.setColor(Color.black);
			BufferedImage store;
				int x = 200;
				g.drawString("Player 1", 150, 600);
				for(int i = 0; i < Player1.getdominoamount(); i++) {
					store = Player1.getdominos(i).getImage();
					g.drawImage(store, x, 600, store.getWidth(), store.getHeight(), null);
					x = x + 100;
				}
				break;
		case 2: 
				g.clearRect(150,590,1450,960);
				g.setColor(Color.pink);
				g.fillRect(150,590,1450,960);
				g.setColor(Color.black); 
				x = 200;
				g.drawString("Player 2", 150, 600);
				for(int i = 0; i < Player2.getdominoamount(); i++) {
					store = Player2.getdominos(i).getImage();
					g.drawImage(store, x, 600, store.getWidth(), store.getHeight(), null);
					x = x + 100;
				}
				break;
		case 3: 
			 	g.clearRect(150,590,1450,960);
				g.setColor(Color.pink);
				g.fillRect(150,590,1450,960);
				g.setColor(Color.black);
				x = 200;
				g.drawString("Player 3", 150, 600);
			for(int i = 0; i < Player3.getdominoamount(); i++) {
					store = Player3.getdominos(i).getImage();
					g.drawImage(store, x, 600, store.getWidth(), store.getHeight(), null);
					x = x + 100;
				}
				break;
		case 4:
			 	g.clearRect(150,590,1450,960);
				g.setColor(Color.pink);
				g.fillRect(150,590,1450,960);
				g.setColor(Color.black);
				x = 200;
				g.drawString("Player 4", 150, 600);
			for(int i = 0; i < Player4.getdominoamount(); i++) {
				store = Player4.getdominos(i).getImage();
				g.drawImage(store, x, 600, store.getWidth(), store.getHeight(), null);
				x = x + 100;
				}
		}

	
	
}
	public void printplayerhand(DominoPlayer bot) {
		BufferedImage botimage;
		int x = 200;
		for(int i = 0; i < 7; i++) {
		botimage = bot.getdominos(i).getImage();
		repaint(x, 600, botimage.getWidth(), botimage.getHeight());
		x = x + 100;
		}
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			choice++;
			if(choice==5) {
				choice = 1;
			}
			repaint();
		}
		if(e.getKeyCode()==KeyEvent.VK_1)
			System.out.println("1");
		if(e.getKeyCode()==KeyEvent.VK_2)
			System.out.println("2");
		if(e.getKeyCode()==KeyEvent.VK_3)
			System.out.println("3");
		if(e.getKeyCode()==KeyEvent.VK_4)
			System.out.println("4");
		if(e.getKeyCode()==KeyEvent.VK_5)
			System.out.println("5");
		if(e.getKeyCode()==KeyEvent.VK_6)
			System.out.println("6");
		if(e.getKeyCode()==KeyEvent.VK_7)
			System.out.println("7");
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e)
	{
	}
	
}
