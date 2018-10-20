package players;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class PlayerAstr extends Player{
	ArrayList<BufferedImage> left = new ArrayList<>();
	ArrayList<BufferedImage> right = new ArrayList<>();
	private BufferedImage common;
	private int leftIm=0;
	private int rightIm=1;
	public PlayerAstr(int x,int y,int width,int height) {
		try {
			img = ImageIO.read(new File("./img/astrLevel/player/player.png"));
			common = ImageIO.read(new File("./img/astrLevel/player/player.png"));
			for(File f:new File("./img/astrLevel/player/left").listFiles()) {
				left.add(ImageIO.read(f));
			}
			for(File f:new File("./img/astrLevel/player/right").listFiles()) {
				right.add(ImageIO.read(f));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(x, y, width, height);
	}
	public PlayerAstr(int width,int height) {
		this(0,0,width,height);
		
	}
	@Override
	public void left() {
		if(leftIm <left.size()-1) {
			img=left.get(leftIm);
		}else {
			img=left.get(left.size()-1);
		}
		leftIm++;
	}
	@Override
	public void stopLeft() {
		leftIm=0;
		img=common;
	}
	@Override
	public void right() {
		if(rightIm <right.size()-1) {
			img=right.get(rightIm);
		}else {
			img=right.get(right.size()-1);
		}
		rightIm++;
	}
	@Override
	public void stopRight() {
		rightIm=0;
		img = common;
	}
}
