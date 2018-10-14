package guiintersaption;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	public static ArrayList<Component> dataGlP = new ArrayList<>();
	public static JFrame glFrame;
	public static JPanel glPanel;
	public static void addToGlF(Component c) {
		glFrame.add(c);
	}
	public static void clearGlF() {
		glFrame.removeAll();
	}
	public static void addToGlP(Component c) {
		glPanel.add(c);
	}
	public static void clearGlP() {
		glPanel.removeAll();
	}
}
