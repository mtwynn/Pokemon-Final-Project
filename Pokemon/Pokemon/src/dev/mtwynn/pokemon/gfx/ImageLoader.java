package dev.mtwynn.pokemon.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

//Coded with help by CodeNMore
//loads an Image by reading from a file
public class ImageLoader {

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));//returns image at path
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);//exits game if no image load
		}
		return null;
	}
}
