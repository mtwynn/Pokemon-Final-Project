package dev.mtwynn.pokemon.entities.creatures.pokemon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.gfx.ImageLoader;

public class Pikachu extends Pokemon {
	
	private String type;
	private int attackratio;
	public Image pikachu = ImageLoader.loadImage("/textures/pokemon/Pikachu.png");
	public Pikachu(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		name = "Pikachu";
		type = "Electric";
	}
	
	public void die() {
		
	}

    public void attack1(Pokemon enemy) {
    	if(enemy.getType().equals("Water")) {
    		attackratio = 10 * 2;
    		enemy.hurt(attackratio);
    	}
    	else
    	    enemy.hurt(10);
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
		g.drawImage(pikachu, (int) x, (int) y, null);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public int getAttackRatio() {
		return attackratio;
	}

	@Override
	public String getEffectiveness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
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
