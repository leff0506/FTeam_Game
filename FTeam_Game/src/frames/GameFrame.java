package frames;

import java.awt.Color;

import engine.Engine;
import gameobjects.Player;
import guiintersaption.GUI;
import imageWork.ImagePanel;

public class GameFrame {
	private ImagePanel glPanel;
	public GameFrame() {
		init();
		new Engine(new Player(50,50));
	}
	private void init() {
		GUI.clearAll();
		glPanel = new ImagePanel();
		glPanel.setBackground(Color.BLACK);
		glPanel.setLayout(null);
		glPanel.setImage("./img/menuBG.jpg");
		glPanel.setBounds(0, 0, GUI.width, GUI.height);
		GUI.glPanel=glPanel;
		GUI.addToGlF(glPanel);
	}
}