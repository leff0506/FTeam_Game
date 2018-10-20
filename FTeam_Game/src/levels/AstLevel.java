package levels;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import actors.Actor;
import engine.Engine;
import guiintersaption.GUI;
import players.Player;
import players.PlayerAstr;
import players.PlayerMars;

public class AstLevel extends Level{
	private boolean smthPressed=false;
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
		//bg.add(bgA);
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
		} 
		if (Engine.keyboard[KeyEvent.VK_S]) {
			player.setY((int) (player.getY()+Player.SPEED));
			player.right();
			smthPressed=true;
		} 
		 else if (Engine.keyboard[KeyEvent.VK_ESCAPE]) {
			System.exit(0);
		}
		if(!smthPressed) {
			player.stopLeft();
			player.stopRight();
		}
		
	}

}
