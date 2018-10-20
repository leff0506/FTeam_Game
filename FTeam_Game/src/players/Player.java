package players;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public abstract class Player{
	
	private int x,y,width,height;
	protected BufferedImage img;
	
	public static int SPEED = 10;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage getImg() {
		return img;
	}
	public void setImg(BufferedImage img) {
		this.img = img;
	}
	public void setBounds(int x,int y,int width,int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	public void left() {
		// TODO Auto-generated method stub
		
	}
	public void right() {
		// TODO Auto-generated method stub
		
	}
	public void stopLeft() {
		// TODO Auto-generated method stub
		
	}
	public void stopRight() {
		// TODO Auto-generated method stub
		
	}
}
