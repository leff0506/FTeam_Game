package frames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
		start.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				start.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				p.stop();
				new GameFrame();
				
			}
		});
		GUI.addToGlP(start);
		
		frameMenu.setVisible(true);
		GUI.setSize();
	}
}
