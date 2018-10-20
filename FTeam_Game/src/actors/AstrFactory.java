package actors;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class AstrFactory {
	private static Asteroid first; 
	protected static BufferedImage img;
	protected static BufferedImage common;
	protected static ArrayList<BufferedImage> anim ;
	public static Asteroid get1() {
		if(img==null) {
			anim=new ArrayList<>();
			try {
				
				for(File f : new File("./img/astrLevel/asteroids/1/anim").listFiles()) {
					anim.add(ImageIO.read(f));
				}
				img=anim.get(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Asteroid ast = new Asteroid();
		ast.anim=anim;
		ast.img=img;
		
		return ast;
	}
}
