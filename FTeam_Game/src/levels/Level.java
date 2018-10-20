package levels;

import java.util.ArrayList;

import actors.Actor;
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
	
}
