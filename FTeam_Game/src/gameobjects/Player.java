package gameobjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Player{
	
	private int x,y,width,height;
	private BufferedImage img;
	
	public static int SPEED = 10;
	public Player(int x,int y,int width,int height) {
		try {
			img = ImageIO.read(new File("./img/player.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(x, y, width, height);
	}
	public Player(int width,int height) {
		this(0,0,width,height);
		
	}
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
}
