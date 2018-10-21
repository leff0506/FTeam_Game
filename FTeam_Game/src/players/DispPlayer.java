package players;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DispPlayer extends Player{
	public DispPlayer() {
		try {
			img = ImageIO.read(new File("./img/astrLevel/player/player.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBounds(0, 0, 0, 0);
	}
}
