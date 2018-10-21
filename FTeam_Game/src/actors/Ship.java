package actors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ship extends Actor{
	public Ship() {
		try {
			img = ImageIO.read(new File("./img/marsLevel/ship.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
