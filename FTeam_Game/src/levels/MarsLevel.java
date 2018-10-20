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
	private boolean leftPressed=false;
	private boolean leftWasPressed=false;
	private boolean rightPressed=false;
	private boolean rightWasPressed=false;
	private boolean upPressed=false;
	private boolean upWasPressed=false;
	private boolean downPressed=false;
	private boolean downWasPressed=false;
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
		leftPressed=false;
		rightPressed=false;
		upPressed=false;
		downPressed=false;
		if(Engine.keyboard[KeyEvent.VK_W]&&Engine.keyboard[KeyEvent.VK_D]) {
			
			for(Actor a:bg) {
				a.setY(a.getY()+SPEED);
				a.setX(a.getX()-SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()+SPEED);
				a.setX(a.getX()-SPEED);
			}
			player.upRight();
			upPressed=true;
			upWasPressed=true;
			rightPressed=true;
			rightWasPressed=true;

			 
		}
		if(Engine.keyboard[KeyEvent.VK_S]&&Engine.keyboard[KeyEvent.VK_D]) {
			
			for(Actor a:bg) {
				a.setY(a.getY()-SPEED);
				a.setX(a.getX()-SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()-SPEED);
				a.setX(a.getX()-SPEED);
			}
			player.downRight();
			downPressed=true;
			downWasPressed=true;
			rightPressed=true;
			rightWasPressed=true;
			
		}
		if(Engine.keyboard[KeyEvent.VK_S]&&Engine.keyboard[KeyEvent.VK_A]) {
			
			for(Actor a:bg) {
				a.setY(a.getY()-SPEED);
				a.setX(a.getX()+SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()-SPEED);
				a.setX(a.getX()+SPEED);
			}
			player.downLeft();
			downPressed=true;
			downWasPressed=true;
			leftPressed=true;
			leftWasPressed=true;
			
		}
		if(Engine.keyboard[KeyEvent.VK_W]&&Engine.keyboard[KeyEvent.VK_A]) {
			
			for(Actor a:bg) {
				a.setY(a.getY()+SPEED);
				a.setX(a.getX()+SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()+SPEED);
				a.setX(a.getX()+SPEED);
			}
			player.upLeft();
			upPressed=true;
			upWasPressed=true;
			leftPressed=true;
			leftWasPressed=true;
			
		}
		if (Engine.keyboard[KeyEvent.VK_W]&&!upPressed) {
			for(Actor a:bg) {
				a.setY(a.getY()+SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()+SPEED);
			}
			player.up();
			upPressed=true;
			upWasPressed=true;

		} 
		if (Engine.keyboard[KeyEvent.VK_S]&&!downPressed) {
			for(Actor a:bg) {
				a.setY(a.getY()-SPEED);
			}
			for(Actor a:actors) {
				a.setY(a.getY()-SPEED);
			}
			downPressed=true;
			downWasPressed=true;
			player.down();
		} 
		if (Engine.keyboard[KeyEvent.VK_A]&&!leftPressed) {
			for(Actor a:bg) {
				a.setX(a.getX()+SPEED);
			}
			for(Actor a:actors) {
				a.setX(a.getX()+SPEED);
			}
			player.left();
			leftPressed=true;
			leftWasPressed=true;
		}
		if (Engine.keyboard[KeyEvent.VK_D]&&!rightPressed) {
			for(Actor a:bg) {
				a.setX(a.getX()-SPEED);
			}
			for(Actor a:actors) {
				a.setX(a.getX()-SPEED);
			}
			rightPressed=true;
			rightWasPressed=true;
			player.right();
		}
		if (Engine.keyboard[KeyEvent.VK_ESCAPE]) {
			System.exit(0);
		}
		if(!leftPressed&&leftWasPressed) {
			player.stopLeft();
			leftWasPressed=false;
		}
		if(!rightPressed&&rightWasPressed) {
			player.stopRight();
			rightWasPressed=false;
		}
		if(!upPressed&&upWasPressed) {
			player.stopUp();
			upWasPressed=false;
		}
		if(!downPressed&&downWasPressed) {
			player.stopDown();
			downWasPressed=false;
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
