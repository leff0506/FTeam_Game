package frames;

import java.awt.Color;

import engine.Engine;
import guiintersaption.GUI;
import imageWork.ImagePanel;
import levels.AstLevel;
import levels.DispLevel;
import levels.MarsLevel;

public class GameFrame {
	private ImagePanel glPanel;
	public GameFrame() {
		init();
		new Engine(new MarsLevel());
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