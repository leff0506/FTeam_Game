package frames;

import java.awt.Color;
import java.awt.Toolkit;
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
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		frameMenu.setSize(1000,600);
		
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
		GUI.setSize();		
//		AnimPanel p = new AnimPanel("C:\\Users\\leff0\\Downloads\\Telegram Desktop\\a");
//		p.setBounds(0, 0, 300, 300);
//		p.start();
//		GUI.addToGlP(p);
		JPanel wrapper  = new JPanel();
		wrapper.setSize(300,400);
		wrapper.setLocation(frameMenu.getWidth()/2-wrapper.getWidth()/2,frameMenu.getHeight()/2-wrapper.getHeight()/2);
		wrapper.setBackground(Color.green);
		wrapper.setLayout(null);
		
		ImagePanel start = new ImagePanel();
		start.setBackground(Color.cyan);
		start.setBounds(0, 0, wrapper.getWidth(), 80);
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
//				p.stop();
				new GameFrame();
				
			}
		});
		wrapper.add(start);
		ImagePanel con = new ImagePanel();
		con.setBackground(Color.RED);
		con.setBounds(0, 80, wrapper.getWidth(), 80);
		con.addMouseListener(new MouseListener() {
			
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
				con.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				con.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(con);
		ImagePanel sett = new ImagePanel();
		sett.setBackground(Color.blue);
		sett.setBounds(0,160 , wrapper.getWidth(), 80);
		sett.addMouseListener(new MouseListener() {
			
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
				sett.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				sett.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(sett);
		ImagePanel about = new ImagePanel();
		about.setBackground(Color.DARK_GRAY);
		about.setBounds(0,240 , wrapper.getWidth(), 80);
		about.addMouseListener(new MouseListener() {
			
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
				about.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				about.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(about);
		ImagePanel exit = new ImagePanel();
		exit.setBackground(Color.LIGHT_GRAY);
		exit.setBounds(0,320 , wrapper.getWidth(), 80);
		exit.addMouseListener(new MouseListener() {
			
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
				exit.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		wrapper.add(exit);
		GUI.addToGlP(wrapper);
		
		frameMenu.setVisible(true);
		GUI.setSize();
	}
}
