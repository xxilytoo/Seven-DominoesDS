import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Domino {
	private int Dleftnum;
	private int Drightnum;
	private String name;
	private BufferedImage bot;
	public Domino(int a, int b, String n) {
		Dleftnum = a;
		Drightnum = b;
		name = n+".PNG";
		try
		{
			bot = ImageIO.read(Domino.class.getResource("Images/"+name));
		}
		catch(Exception E)
		{
			System.out.println("Image print error");
		}
	}
	
	public int getleft() {
		return Dleftnum;
		
	}
	
	public int getright() {
		return Drightnum;
	}
	
	public String getname() {
		return name;
	}
	
	public boolean getdouble() {
		if(Dleftnum == Drightnum) 
		{
			return true;
		}
		else
			return false;
	}
	
	public BufferedImage getImage() {
		return bot;
	}
}
