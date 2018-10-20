package dev.mtwynn.pokemon.gfx;

import java.awt.image.BufferedImage;

//Coded with help by CodeNMore
//Creates a SpriteSheet object, which is an BufferedImage that holds 
//tiles and graphics, and provides the crop method to cut portions
//of the image to use within the game.
public class SpriteSheet {

	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	public BufferedImage crop(int x, int y, int width, int height) {
		return (sheet.getSubimage(x, y, width, height));
	}
}
