package imageWork;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class  ImagePanel extends JPanel{
	 private Image image;
	 
	 public Image getImage() {
	     return image;
	 }
	
	 public void setImage(Image image) {
	     this.image = image;
	 }
	 public void setImage(String str) {
		 try {
			setImage(ImageIO.read(new File(str)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void paintComponent(Graphics g) {
	     super.paintComponent(g);
	     if(image != null){
	    	 Graphics2D g2D = (Graphics2D) g.create();
	         g2D.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	     }
	 }
}
