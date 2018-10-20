package players;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class PlayerMars extends Player{
	private ArrayList<BufferedImage> left = new ArrayList<>();
	private ArrayList<BufferedImage> right = new ArrayList<>();
	private ArrayList<BufferedImage> up = new ArrayList<>();
	private ArrayList<BufferedImage> upRight= new ArrayList<>();
	private ArrayList<BufferedImage> down = new ArrayList<>();
	private ArrayList<BufferedImage> downRight = new ArrayList<>();
	private ArrayList<BufferedImage> downLeft = new ArrayList<>();
	private ArrayList<BufferedImage> upLeft = new ArrayList<>();
	private double leftIm=1;
	private double upIm=1;
	private double rightIm=1;
	private double downIm=1;
	private double upRightIm=1;
	private double downRightIm=1;
	private double downLeftIm=1;
	private double upLeftIm=1;
	public PlayerMars(int x,int y,int width,int height) {
		for(File f:new File("./img/marsLevel/player/0").listFiles()) {
			try {
				left.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/180").listFiles()) {
			try {
				right.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/90").listFiles()) {
			try {
				up.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(File f:new File("./img/marsLevel/player/270").listFiles()) {
			try {
				down.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/135").listFiles()) {
			try {
				upRight.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/225").listFiles()) {
			try {
				downRight.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/315").listFiles()) {
			try {
				downLeft.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(File f:new File("./img/marsLevel/player/45").listFiles()) {
			try {
				upLeft.add(ImageIO.read(f));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		img=up.get(0);
		setBounds(x, y, width, height);
	}
	public PlayerMars(int width,int height) {
		this(0,0,width,height);
		
	}
	public Rectangle getBounds() {
		return new Rectangle(getWidth()/2-5,getHeight()/2,10,20);
	}
	public void left() {
		if(leftIm <left.size()-5) {
			img=left.get((int)leftIm);
		}else {
			img=left.get(2);
			leftIm=2;
		}
		leftIm+=0.1;
	}
	
	public void stopLeft() {
		leftIm=1;
		img=left.get(0);
	}
	public void stopRight() {
		rightIm=1;
		img=right.get(0);
	}
	public void right() {
		if(rightIm <right.size()-5) {
			img=right.get((int)rightIm);
		}else {
			img=right.get(2);
			rightIm=2;
		}
		rightIm+=0.1;
	}
	public void up() {
		if(upIm <up.size()-5) {
			img=up.get((int)upIm);
		}else {
			img=up.get(2);
			upIm=2;
		}
		upIm+=0.1;
	}
	public void stopUp() {
		upIm=1;
		img=up.get(0);
	}
	public void down() {
		if(downIm <down.size()-5) {
			img=down.get((int)downIm);
		}else {
			img=down.get(2);
			downIm=2;
		}
		downIm+=0.1;
	}
	public void stopDown() {
		downIm=1;
		img=down.get(0);
	}
	public void upRight() {
		if(upRightIm <upRight.size()-5) {
			img=upRight.get((int)upRightIm);
		}else {
			img=upRight.get(2);
			upRightIm=2;
		}
		upRightIm+=0.1;
	}

	public void downRight() {
		if(downRightIm <downRight.size()-5) {
			img=downRight.get((int)downRightIm);
		}else {
			img=downRight.get(2);
			downRightIm=2;
		}
		downRightIm+=0.1;
	}
	public void downLeft() {
		if(downLeftIm <downLeft.size()-5) {
			img=downLeft.get((int)downLeftIm);
		}else {
			img=downLeft.get(2);
			downLeftIm=2;
		}
		downLeftIm+=0.1;
	}
	public void upLeft() {
		if(upLeftIm <upLeft.size()-5) {
			img=upLeft.get((int)upLeftIm);
		}else {
			img=upLeft.get(2);
			upLeftIm=2;
		}
		upLeftIm+=0.1;
	}
	
}
