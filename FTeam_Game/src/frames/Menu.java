package frames;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import guiintersaption.GUI;
import imageWork.AnimPanel;
import imageWork.ImagePanel;

public class Menu {
	public static JFrame frameMenu;
	private BufferedImage bi1=null;
	private BufferedImage bi = null;
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
		ImagePanel wrapper  = new ImagePanel();
		wrapper.setSize(300,350);
		wrapper.setLocation(75,frameMenu.getHeight()/2-wrapper.getHeight()/2);
		wrapper.setBackground(new Color(0,0,0,0));
		wrapper.setLayout(null);
		
		
		
		try {
			bi = ImageIO.read(new File("./img/menu/menitemdef.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			bi1 = ImageIO.read(new File("./img/menu/menitemen.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ImagePanel start = new ImagePanel();
		start.setBackground(new Color(0,0,0,0));
		
		start.setImage(bi);
		
		start.setBounds(0, 0, wrapper.getWidth(), 60);
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
				start.setImage(bi);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setImage(bi1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				p.stop();
				new GameFrame();
				
			}
		});
		wrapper.add(start);
		ImagePanel con = new ImagePanel();
		con.setBackground(new Color(0,0,0,0));
		con.setImage(start.getImage());
		con.setBounds(0, 70, wrapper.getWidth(), 60);
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
				con.setImage(bi);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				con.setImage(bi1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(con);
		ImagePanel sett = new ImagePanel();
		sett.setBackground(new Color(0,0,0,0));
		sett.setImage(start.getImage());
		sett.setBounds(0,140 , wrapper.getWidth(),60);
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
				sett.setImage(bi);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				sett.setImage(bi1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(sett);
		ImagePanel about = new ImagePanel();
		about.setBackground(new Color(0,0,0,0));
		about.setImage(start.getImage());
		about.setBounds(0,210 , wrapper.getWidth(), 60);
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
				about.setImage(bi);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				about.setImage(bi1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(about);
		ImagePanel exit = new ImagePanel();
		exit.setBackground(new Color(0,0,0,0));
		exit.setImage(start.getImage());
		exit.setBounds(0,280 , wrapper.getWidth(), 60);
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
				exit.setImage(bi);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setImage(bi1);
				frameMenu.repaint();
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
