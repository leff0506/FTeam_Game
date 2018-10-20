package engine;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import actors.Actor;
import levels.Level;
import players.Player;

public class Display extends JPanel{
	private Level level;
	public Display(Level level) {
		this.level =level;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawField(g);
		g.drawImage(level.getPlayer().getImg(), level.getPlayer().getX(), level.getPlayer().getY(), level.getPlayer().getWidth(), level.getPlayer().getHeight(), null);
		drawActors(g);
	}

	private void drawField(Graphics g) {
		for(Actor a:level.getBg()) {
			g.drawImage(a.getImg(), a.getX(), a.getY(), a.getWidth(), a.getHeight(), null);
		}	

	}
	private void drawActors(Graphics g) {
		for(Actor a:level.getActors()) {
			g.drawImage(a.getImg(), a.getX(), a.getY(), a.getWidth(), a.getHeight(), null);
		}	

	}
}
