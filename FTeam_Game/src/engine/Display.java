package engine;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


import gameobjects.Player;

public class Display extends JPanel{
	private Player player;
	public Display(Player player) {
		this.player= player;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(player.getImg(), player.getX(), player.getY(), player.getWidth(), player.getHeight(), null);
		
	}

	private void drawField(Graphics2D g) {

	

	}
}
