package dev.mtwynn.pokemon.entities.creatures.pokemon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.Sound.Sound;
import dev.mtwynn.pokemon.gfx.ImageLoader;

public class Charmander extends Pokemon {
	
	private String type;
	private int attackratio;
	public Image charmander = ImageLoader.loadImage("/textures/pokemon/Charmander.png");
	public Charmander(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		name = "Charmander";
		type = "Fire";
	}
	
	public void die() {
		
	}

    public void attack1(Pokemon enemy) {
    	if(enemy.getType().equals("Grass")) {
    		attackratio = 15;
    		enemy.hurt(attackratio);
    	}
    	else
    		attackratio = 5;
    	    enemy.hurt(attackratio);
	}
	
	public void attack2(Pokemon enemy) {
		
	}
	
	public void attack3(Pokemon enemy) {
		
	}
	
	public void attack4(Pokemon enemy) {
		
	}


	public void forfeit() {
		
	}

	public void tick() {
			
	}

	public void render(Graphics g) {
		g.drawImage(charmander, (int) x, (int) y, null);
	}
	
	public String getType() {
		return type;
	}

	public int getAttackRatio() {
		return attackratio;
	}

	public String getEffectiveness() {
		return effectiveness;
	}

	public String getMove() {
		return null;
	}

	@Override
	public Color getColor() {
		return null;
	}

	@Override
	public BufferedImage[] getAtt1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage[] getAtt2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage[] getAtt3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage[] getAtt4() {
		// TODO Auto-generated method stub
		return null;
	}

}
