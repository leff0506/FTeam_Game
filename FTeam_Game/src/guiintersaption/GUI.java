package guiintersaption;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	public static ArrayList<Component> dataGlP = new ArrayList<>();
	public static int width,height;
	public static JFrame glFrame;
	public static JPanel glPanel;
	public static void addToGlF(Component c) {
		glFrame.add(c);
		glFrame.repaint();
	}
	public static void clearGlF() {
		glFrame.remove(glPanel);
		glFrame.repaint();
	}
	public static void addToGlP(Component c) {
		glPanel.add(c);
		dataGlP.add(c);
		glFrame.repaint();
	}
	public static void clearGlP() {
		for(Component c : dataGlP) {
			glPanel.remove(c);
		}
		dataGlP.clear();
		glFrame.repaint();
	}
	public static void clearAll() {
		
		clearGlP();
		clearGlF();
	}
	public static void setSize() {
		width=glPanel.getWidth();
		height=glPanel.getHeight();
		
	}
}
