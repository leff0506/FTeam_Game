package imageWork;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JLabel;

import guiintersaption.GUI;

public class AnimLabel extends JLabel{
	Queue<Character> queue = new LinkedList<>();
	boolean isRunning=true;
	/**
	 * @param str
	 */
	public void setGlText(String str) {
//		Font f = null;
//		try {
//			f = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("./font/font.ttf"));
//		} catch (FontFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//;
//		System.out.println(f.getName());
		
//		setFont(f);
		for(char c:str.toCharArray())queue.add(c);
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long lastLoopTime = System.nanoTime();
				int lastFpsTime1 = 0;	
				while (isRunning) {
					long now = System.nanoTime();
					long updateLength = now - lastLoopTime;
					lastLoopTime = now;
					lastFpsTime1 += updateLength;

					// update our FPS counter if a second has passed since
					// we last recorded
					if (lastFpsTime1 > 1000000000 /2) {
						
						if(!queue.isEmpty()) {
							String temp = getText();
							if(temp==null) {
								temp="";
							}
							temp+=queue.remove();
							setText(temp);
							lastFpsTime1 = 0;
						}else {
							isRunning=false;
						}
						
					}
					

				}
				
			}
		},"AnimLabel");
		th.start();
	}
	
}
