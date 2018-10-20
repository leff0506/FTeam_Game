package levels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import engine.Engine;
import guiintersaption.GUI;
import players.Player;
import players.PlayerMars;

public class MarsLevel extends Level{
	public MarsLevel() {
		player=new PlayerMars(50,50);
		addKeyListener();
	}
	@Override
	public void update() {
		if(!update) return;
		if (Engine.keyboard[KeyEvent.VK_W]) {
			player.setY((int) (player.getY()-Player.SPEED));
		} 
		if (Engine.keyboard[KeyEvent.VK_S]) {
			player.setY((int) (player.getY()+Player.SPEED));
		} 
		if (Engine.keyboard[KeyEvent.VK_A]) {
			player.setX((int) (player.getX()-Player.SPEED));
		} 
		if (Engine.keyboard[KeyEvent.VK_D]) {
			player.setX((int) (player.getX()+Player.SPEED));
		} else if (Engine.keyboard[KeyEvent.VK_ESCAPE]) {
			System.exit(0);
		}
		
	}
	private void addKeyListener() {
		for (boolean b : Engine.keyboard) {
			b = false;
		}
		GUI.glFrame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				Engine.keyboard[e.getKeyCode()] = false;

			}

			@Override
			public void keyPressed(KeyEvent e) {
				Engine.keyboard[e.getKeyCode()] = true;

			}
		});

	}
	
}
