package actors;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Crator extends Actor{
	public Crator() {
		try {
			img=ImageIO.read(new File("./img/marsLevel/crator.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
