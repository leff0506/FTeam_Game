package frames;

import java.awt.Color;
import java.awt.image.ImagingOpException;

import javax.swing.*;

import guiintersaption.GUI;
import imageWork.AnimPanel;
import imageWork.ImagePanel;

public class Menu {
	public static JFrame frameMenu;
	private ImagePanel glPanel;
	public Menu() {
		init();
	}
	private void init() {
		
		frameMenu = new JFrame("FTeam_Game");
		frameMenu.setSize(1000, 800);
		frameMenu.setLocationRelativeTo(null);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.setResizable(false);
		GUI.glFrame=frameMenu;
		glPanel = new ImagePanel();
		glPanel.setBackground(Color.BLACK);
		glPanel.setLayout(null);
		glPanel.setImage("./img/menuBG.jpg");
		GUI.glPanel=glPanel;
		GUI.addToGlF(glPanel);
		AnimPanel p = new AnimPanel("C:\\Users\\leff0\\Downloads\\Telegram Desktop\\a");
		p.setBounds(0, 0, 300, 300);
		p.start();
		GUI.addToGlP(p);
		
		ImagePanel start = new ImagePanel();
		start.setBackground(Color.RED);
		start.setBounds(300, 300, 200, 100);
		GUI.addToGlP(start);
		frameMenu.setVisible(true);
		
	}
}
