package engine;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

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
		
		g.drawImage(level.getPlayer().getImg(), level.getPlayer().getX(), level.getPlayer().getY(), level.getPlayer().getWidth(), level.getPlayer().getHeight(), null);
		
	}

	private void drawField(Graphics2D g) {

	

	}
}
