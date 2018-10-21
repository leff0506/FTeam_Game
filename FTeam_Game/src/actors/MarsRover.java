package actors;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MarsRover extends Actor{
	private double delt=0;
	public MarsRover() {
		try {
			anim.add(ImageIO.read(new File("./img/marsLevel/marsRover/1.png")));
			anim.add(ImageIO.read(new File("./img/marsLevel/marsRover/2.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update() {
		delt+=0.1;
		if(delt>=anim.size()) {
			delt=0;
		}
		img=anim.get((int)(delt));
	}
	
}
