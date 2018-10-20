package players;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlayerMars extends Player{
	public PlayerMars(int x,int y,int width,int height) {
		try {
			img = ImageIO.read(new File("./img/player.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(x, y, width, height);
	}
	public PlayerMars(int width,int height) {
		this(0,0,width,height);
		
	}
}
