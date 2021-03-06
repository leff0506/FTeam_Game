package actors;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import java.util.ArrayList;



public class Actor {
	private int x,y,width,height;
	protected BufferedImage img;
	protected BufferedImage common;
	protected ArrayList<BufferedImage> anim = new ArrayList<>();
	public boolean isWhite = false;
	public boolean isSaturn = false;
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
	public void update() {
		
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,width,height);
	}
}
