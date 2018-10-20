package players;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class PlayerMars extends Player{
	ArrayList<BufferedImage> left = new ArrayList<>();
	private double leftIm=1;
	public PlayerMars(int x,int y,int width,int height) {
		for(File f:new File("./img/marsLevel/player/0").listFiles()) {
			try {
				left.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		img=left.get(0);
		setBounds(x, y, width, height);
	}
	public PlayerMars(int width,int height) {
		this(0,0,width,height);
		
	}
	public Rectangle getBounds() {
		return new Rectangle(getWidth()/2-5,getHeight()/2,10,20);
	}
	public void left() {
		if(leftIm <left.size()-20) {
			img=left.get((int)leftIm);
		}else {
			img=left.get(10);
			leftIm=10;
		}
		leftIm+=0.5;
	}
	
	public void stopLeft() {
		leftIm=1;
		img=left.get(0);
	}
	public void right() {
		
	}
}
