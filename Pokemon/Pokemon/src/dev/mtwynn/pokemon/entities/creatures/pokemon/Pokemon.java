package dev.mtwynn.pokemon.entities.creatures.pokemon;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.entities.Entity;

public abstract class Pokemon extends Entity {

	protected String type;
	protected String attack1, attack2, attack3, attack4;
	protected String effectiveness;
	protected Color colorType;
	protected BufferedImage[] att1, att2, att3, att4;
	protected Image pokemon;
	public Pokemon(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		
	}
	
	//commands Pokemon to perform an attack
	public abstract void attack1(Pokemon enemy);
	public abstract void attack2(Pokemon enemy);
	public abstract void attack3(Pokemon enemy);
	public abstract void attack4(Pokemon enemy);
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth() { 
		
	}

	public abstract String getType();
	public abstract int getAttackRatio();
	public abstract String getEffectiveness();
	public abstract String getMove();
	public abstract Color getColor();
	public abstract BufferedImage[] getAtt1();
	public abstract BufferedImage[] getAtt2();
	public abstract BufferedImage[] getAtt3();
	public abstract BufferedImage[] getAtt4();
}
