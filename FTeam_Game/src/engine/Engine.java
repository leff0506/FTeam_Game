package engine;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

import guiintersaption.GUI;
import imageWork.AnimLabel;
import levels.Level;
import players.Player;




public class Engine {
	public static boolean isRunning = true;
	public static final int TARGET_FPS = 60;
	public static final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
	public static AnimLabel animL;
	public static boolean[] keyboard = new boolean[500];
	private Level level;
	public Engine(Level level) {
		GUI.clearGlP();
		initAnimatedLabel();
		initDisplay(level);
		
		addKeyListener();
		Thread engine = new Thread(new Runnable() {
			
			@Override
			public void run() {
				engine();

			}
		});
		engine.start();
		
	}
	private void initDisplay(Level level) {
		this.level=level;
		Display display = new Display(level);
		display.setBounds(0, 0, GUI.width, GUI.height);
		GUI.addToGlP(display);
	}
	private void initAnimatedLabel() {
		animL = new AnimLabel();
		animL.setBounds(600, 300, 250, 100);
		animL.setForeground(Color.RED);
		
		GUI.addToGlP(animL);
		animL.setGlText("wfewfwefafaafddfavzcvasdfaaaasdddddd");
	}
	private void addKeyListener() {
		for (boolean b : keyboard) {
			b = false;
		}
		GUI.glFrame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				keyboard[e.getKeyCode()] = false;

			}

			@Override
			public void keyPressed(KeyEvent e) {
				keyboard[e.getKeyCode()] = true;

			}
		});

	}
	private void engine() {
		long lastLoopTime = System.nanoTime();

		int lastFpsTime = 0;
		int lastFpsTime1 = 0;
		int fps = 0;
		while (isRunning) {
			long now = System.nanoTime();
			long updateLength = now - lastLoopTime;
			lastLoopTime = now;

			// update the frame counter
			lastFpsTime += updateLength;
			lastFpsTime1 += updateLength;

			// update our FPS counter if a second has passed since
			// we last recorded
			if (lastFpsTime >= 1000000000) {
				System.out.println("(FPS: " + fps + ")");
				lastFpsTime = 0;
				fps = 0;
			}
			if (lastFpsTime1 > OPTIMAL_TIME) {
				fps++;
				update(lastFpsTime1);
				lastFpsTime1 = 0;

				GUI.glFrame.repaint();
			}
			

		}
	}
	private void update(long time){
		level.update();
		
	}
}
