package dev.mtwynn.pokemon.gfx;

import java.awt.image.BufferedImage;

//Coded with help by CodeNMore
//handles the frame by frame animation of a sprite by cycling through
//a BufferedImage array at a set interval specified in the constructor
public class Animation {
	
	private int speed, index;
	private long lastTime, timer;
	private BufferedImage[] frames;
	
	//creates an Animation object that takes in an int speed 
	//(how often to should the image be updated for faster/slower animation)
	public Animation(int speed, BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames; 
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}

	public void tick() {
		timer += System.currentTimeMillis() - lastTime; //sets timer to the time passed from last tick() call to current tick() call
		lastTime = System.currentTimeMillis();//resets lastTime to the time when tick() was called at this instance 
		
		if(timer > speed) {
			index++;
			timer = 0;
			if(index >= frames.length)
				index = 0;
		}
	}
	
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}
}
