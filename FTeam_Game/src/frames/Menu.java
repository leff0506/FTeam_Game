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
	private BufferedImage ci1=null;
	private BufferedImage ci = null;
	private BufferedImage ai1=null;
	private BufferedImage ai = null;
	private BufferedImage di1=null;
	private BufferedImage di = null;
	private BufferedImage ei1=null;
	private BufferedImage ei = null;
	private BufferedImage ri1=null;
	private BufferedImage ri = null;
	private ImagePanel glPanel;
	public Menu() {
		init();
	}
	private void init() {
		
		frameMenu = new JFrame("FTeam_Game");
		
//		frameMenu.setSize(1000,600);
		frameMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameMenu.setUndecorated(true);
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
		frameMenu.setVisible(true);
		ImagePanel wrapper  = new ImagePanel();
		wrapper.setSize(300,350);
		wrapper.setLocation(75,frameMenu.getHeight()/2-wrapper.getHeight()/2);
		wrapper.setBackground(new Color(0,0,0,0));
		wrapper.setLayout(null);
		
		
		
		try {
			bi = ImageIO.read(new File("./img/menu/start1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			bi1 = ImageIO.read(new File("./img/menu/start2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ai = ImageIO.read(new File("./img/menu/continue1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ai1 = ImageIO.read(new File("./img/menu/continue2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ci = ImageIO.read(new File("./img/menu/settings1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ci1 = ImageIO.read(new File("./img/menu/settings2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			di = ImageIO.read(new File("./img/menu/about1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			di1 = ImageIO.read(new File("./img/menu/about2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ei = ImageIO.read(new File("./img/menu/exit1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ei1 = ImageIO.read(new File("./img/menu/exit2.png"));
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
		con.setImage(ai);
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
				con.setImage(ai);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				con.setImage(ai1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(con);
		ImagePanel sett = new ImagePanel();
		sett.setBackground(new Color(0,0,0,0));
		sett.setImage(ci);
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
				sett.setImage(ci);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				sett.setImage(ci1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(sett);
		ImagePanel about = new ImagePanel();
		about.setBackground(new Color(0,0,0,0));
		about.setImage(di);
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
				about.setImage(di);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				about.setImage(di1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		wrapper.add(about);
		ImagePanel exit = new ImagePanel();
		exit.setBackground(new Color(0,0,0,0));
		exit.setImage(ei);
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
				exit.setImage(ei);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setImage(ei1);
				frameMenu.repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		wrapper.add(exit);
		GUI.addToGlP(wrapper);
		
		
		GUI.setSize();
	}
}
