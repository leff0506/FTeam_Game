package levels;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import actors.Actor;
import engine.Engine;
import guiintersaption.GUI;
import players.Player;

public abstract class Level {
	protected ArrayList<Actor> bg = new ArrayList<>();
	protected ArrayList<Actor> actors = new ArrayList<>();
	protected Player player;
	protected boolean update=true;
	public abstract void update();
	public ArrayList<Actor> getBg() {
		return bg;
	}
	public void setBg(ArrayList<Actor> bg) {
		this.bg = bg;
	}
	public ArrayList<Actor> getActors() {
		return actors;
	}
	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	protected void addKeyListener() {
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
