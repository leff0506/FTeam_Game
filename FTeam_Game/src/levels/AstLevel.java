package levels;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import actors.Actor;
import actors.Asteroid;
import actors.AstrFactory;
import engine.Engine;
import guiintersaption.GUI;
import players.Player;
import players.PlayerAstr;


public class AstLevel extends Level{
	private boolean smthPressed=false;
	private double delt=0;
	private static final int SPEEDMAP =1;
	private Actor white;
	public AstLevel() {
		player=new PlayerAstr(20,GUI.height/2-25,200,115);
		
		Actor bgA = new Actor();
		bgA.setBounds(0, 0, 1000, 800);
		try {
			bgA.setImg(ImageIO.read(new File("./img/astrLevel/bg/astbg.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bg.add(bgA);
		Asteroid temp = AstrFactory.get1();
		temp.setBounds(700, 300, 100, 100);
		actors.add(temp);
		Asteroid temp1 = AstrFactory.get1();
		temp1.setBounds(600, 200, 100, 100);
		actors.add(temp1);
		Asteroid temp2 = AstrFactory.get1();
		temp2.setBounds(500, 500, 100, 100);
		actors.add(temp2);
		Asteroid temp3 = AstrFactory.get1();
		temp3.setBounds(700, 100, 100, 100);
		actors.add(temp3);
		white = new Actor();
		white.isWhite=true;
		white.setBounds(-150,player.getY()-90, 600,300);
		try {
			white.setImg(ImageIO.read(new File("./img/astrLevel/white.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bg.add(white);
		addKeyListener();
	}
	@Override
	public void update() {
		smthPressed=false;
		if(!update) return;
		if (Engine.keyboard[KeyEvent.VK_W]) {
			player.setY((int) (player.getY()-Player.SPEED));
			player.left();
			
			smthPressed=true;
			if(player.getY()<0) {
				player.setY(0);
			}
		} 
		if (Engine.keyboard[KeyEvent.VK_S]) {
			player.setY((int) (player.getY()+Player.SPEED));
			player.right();
			smthPressed=true;
			if(player.getY()+player.getHeight()>GUI.height) {
				player.setY(GUI.height-player.getHeight());
			}
			
		} 
		 else if (Engine.keyboard[KeyEvent.VK_ESCAPE]) {
			System.exit(0);
		}
		if(!smthPressed) {
			player.stopLeft();
			player.stopRight();
		}
		white.setBounds(-150,player.getY()-90, 600,300);
		collision();
		updateMap();
		updateActors();
		
	}
	private void collision() {
		for(Actor a:actors) {
			if(a.getBounds().intersects(player.getBounds())) {
				System.exit(0);
			}
		}
	}
	private void updateActors() {
		for(Actor a:actors) {
			a.update();
		}
	}
	private void updateMap() {
		delt+=0.02;
		for(Actor a:bg) {
			
			if(!a.isWhite)a.setX(a.getX()-(int)(delt)*SPEEDMAP);
		}
		if(delt>=1) {
			delt=0;
		}
	}

}
