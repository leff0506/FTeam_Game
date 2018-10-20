package actors;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Asteroid extends Actor{
	private double delt=1;
	private double deltx=0;
	private int SPEED ;
	public Asteroid() {
		Random rd = new Random();
		SPEED =Math.abs(rd.nextInt())%5+1;
	}
	public void update() {
		delt+=0.1;
		deltx+=0.9;
		if(delt>=anim.size()-1) {
			delt=0;
		}
		img=anim.get((int)(delt));
		setX(getX()-(int)(deltx)*SPEED);
		if(deltx>=1) {
			deltx=0;
		}
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}
	public Rectangle getBounds() {
		return new Rectangle(getX()+50,getY()+20,getWidth()-50,getHeight()-20);
	}
}
