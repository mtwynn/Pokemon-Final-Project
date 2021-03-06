package dev.mtwynn.pokemon.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

//Coded with help by CodeNMore
//Creates an interactive button for the user to interact with.
public class UIImageButton extends UIObject {
	
	private BufferedImage[] images;
	private ClickListener clicker;

	public UIImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker) {
		super(x, y, width, height);
		this.images = images;
		this.clicker = clicker;	}

	public void tick() {}

	public void render(Graphics g) {
		if(hovering)
			g.drawImage(images[1], (int) x, (int) y, (int) width, (int) height, null);
		else
			g.drawImage(images[0], (int) x, (int) y, (int) width, (int) height, null);
	}

	public void onClick() {
		clicker.onClick();
	}
}
