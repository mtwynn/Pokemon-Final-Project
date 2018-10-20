package dev.mtwynn.pokemon.entities.creatures.pokemon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.Sound.Sound;
import dev.mtwynn.pokemon.gfx.Assets;
import dev.mtwynn.pokemon.gfx.ImageLoader;

public class Bulbasaur extends Pokemon {

    private int attackratio;
	private String type;
    private String effectiveness;
    private String move;
    private Color colorType;
	public Image bulbasaur = ImageLoader.loadImage("/textures/pokemon/Bulbasaur.png");

	public Bulbasaur(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		name = "Bulbasaur";
		type = "Grass";
		attack1 = "VINE WHIP";
		attack2 = "LEECH SEED";
	    attack3 = "TACKLE";
	    attack4 = "POISON POWDER";
	    colorType = Color.GREEN;
	    att1 = Assets.btn_vw;
	    att2 = Assets.btn_ls;
	    att3 = Assets.btn_tc;
	    att4 = Assets.btn_pp;
	}
	
	public void attack1(Pokemon enemy) {
		Sound.vineWhip.play();
		move = attack1;
		if(enemy.getType().equals("Water")) {
			effectiveness = "super effective!";
			attackratio = 20;
    		enemy.hurt(attackratio);
		}
    	else {
    		effectiveness = "okay.";
    		attackratio = 10;
    	    enemy.hurt(attackratio);
    	}
	}
	public void attack2(Pokemon enemy) {
		Sound.leechSeed.play();
		move = attack2;
		if(enemy.getType().equals("Water")) {
			effectiveness = "super effective!";
			attackratio = 30;
    		enemy.hurt(attackratio);
		}
    	else {
    		effectiveness = "okay.";
    		attackratio = 5;
    	    enemy.hurt(attackratio);
    	}
	}
	
	public void attack3(Pokemon enemy) {
		Sound.tackle.play();
		move = attack3;
		effectiveness = "okay.";
		attackratio = 10;
		enemy.hurt(attackratio);
	}
	
	public void attack4(Pokemon enemy) {
		move = attack4;
		Sound.poisonPowder.play();
		if(enemy.getType().equals("Grass")) {
			effectiveness = "super effective!";
			attackratio = 20;
    		enemy.hurt(attackratio);
		}
    	else {
    		effectiveness = "okay.";
    		attackratio = 5;
    	    enemy.hurt(attackratio);
    	}
	}
	

	public void forfeit() {
		
	}

	public void tick() {
			
	}

	public void render(Graphics g) {
		g.drawImage(bulbasaur, (int) x, (int) y, null);

	}
	
	public String getType() {
		return type;
	}
	
	public int getAttackRatio() {
		return attackratio;
	}

	public void die() {
		
	}

	
	public String getEffectiveness() {
		return effectiveness;
	}

	public String getMove() {
		return move;
	}

	public Color getColor() {
		return colorType;
	}

	@Override
	public BufferedImage[] getAtt1() {
		return att1;
	}

	@Override
	public BufferedImage[] getAtt2() {
		return att2;
	}

	@Override
	public BufferedImage[] getAtt3() {
		return att3;
	}

	@Override
	public BufferedImage[] getAtt4() {
		return att4;
	}

}
