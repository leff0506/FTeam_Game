package actors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Saturn extends Actor{
	private static int SPEED = 1;
	private double deltx=0;
	public Saturn() {
		try {
			img =(ImageIO.read(new File("./img/astrLevel/SATURN.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isSaturn = true;
	}
	public void update() {
		deltx+=0.9;
		setX(getX()-(int)(deltx)*SPEED);
		if(deltx>=1) {
			deltx=0;
		}
	}
}
