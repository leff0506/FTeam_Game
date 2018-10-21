package levels;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import actors.Actor;
import guiintersaption.GUI;
import players.DispPlayer;
import players.Player;

public class DispLevel extends Level{
	public DispLevel() {
		player = new DispPlayer();
		Actor bg1 = new Actor();
		bg1.setBounds(GUI.width/2-GUI.height/2, 0, GUI.height,GUI.height);
		try {
			bg1.setImg(ImageIO.read(new File("./img/dispLevel/display.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bg.add(bg1);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
