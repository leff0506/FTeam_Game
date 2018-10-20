package levels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import actors.Actor;
import engine.Engine;
import guiintersaption.GUI;
import players.Player;
import players.PlayerMars;

public class MarsLevel extends Level{
	private static final int SPEED=2;
	private ArrayList<Actor> toDelete=new ArrayList<>();
	private boolean smthPressed;
	public MarsLevel() {
		player=new PlayerMars(0,0,GUI.width,GUI.height);
		Actor bgA = new Actor();
		bgA.setBounds(-1000, -1000, 2000+GUI.width, 2000+GUI.height);
		try {
			bgA.setImg(ImageIO.read(new File("./img/marsLevel/bg/marsTex.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bg.add(bgA);
		Actor temp = new Actor();
		temp.setBounds(100, 100, 50, 50);
		try {
			temp.setImg(ImageIO.read(new File("./img/astrLevel/player/player.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actors.add(temp);
		addKeyListener();
	}
	@Override
	public void update() {
		if(!update) return;
		smthPressed=false;
		if (Engine.keyboard[KeyEvent.VK_W]) {
			for(Actor a:bg) {
				a.setY(a.getY()+SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()+SPEED);
			}
			smthPressed=true;
		} 
		if (Engine.keyboard[KeyEvent.VK_S]) {
			for(Actor a:bg) {
				a.setY(a.getY()-SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()-SPEED);
			}
			smthPressed=true;
		} 
		if (Engine.keyboard[KeyEvent.VK_A]) {
			for(Actor a:bg) {
				a.setX(a.getX()+SPEED);
			}
			for(Actor a:actors) {
				a.setX(a.getX()+SPEED);
			}
			player.left();
			smthPressed=true;
		}
		if (Engine.keyboard[KeyEvent.VK_D]) {
			for(Actor a:bg) {
				a.setX(a.getX()-SPEED);
			}
			for(Actor a:actors) {
				a.setX(a.getX()-SPEED);
			}
			smthPressed=true;
		} else if (Engine.keyboard[KeyEvent.VK_ESCAPE]) {
			System.exit(0);
		}
		if(!smthPressed) {
			player.stopLeft();
		}
		collision();

	}
	private void collision() {
		toDelete.clear();
		for(Actor a : actors) {
			if(a.getBounds().intersects(player.getBounds())) {
				toDelete.add(a);
			}
		}
		actors.removeAll(toDelete);
	}
	
}
