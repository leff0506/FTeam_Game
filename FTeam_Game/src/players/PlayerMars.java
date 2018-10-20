package players;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlayerMars extends Player{
	public PlayerMars(int x,int y,int width,int height) {
		try {
			img = ImageIO.read(new File("./img/marsLevel/player/player.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(x, y, width, height);
	}
	public PlayerMars(int width,int height) {
		this(0,0,width,height);
		
	}
	public Rectangle getBounds() {
		return new Rectangle(getX(),getY()+10,getWidth()-100,getHeight()-20);
	}
}
