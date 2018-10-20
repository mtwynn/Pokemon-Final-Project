package dev.mtwynn.pokemon.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.Sound.Sound;
import dev.mtwynn.pokemon.entities.creatures.pokemon.Charmander;
import dev.mtwynn.pokemon.entities.creatures.pokemon.Pokemon;
import dev.mtwynn.pokemon.gfx.Animation;
import dev.mtwynn.pokemon.gfx.Assets;

//creates a Creature that acts like a Player
public class Opponent extends Creature {
	
private Animation animLeft, animRight;

    private ArrayList<Pokemon> team = new ArrayList<Pokemon>();

	public Opponent(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 8;
		bounds.y = 8;
		bounds.width = 15;
		bounds.height = 21;
		
		animLeft = new Animation(125, Assets.opp_left);
		animRight = new Animation(125, Assets.opp_right);
		name = "Sally";
		team.add(new Charmander(handler, 725, 375, 100, 100));
		talk = Sound.Sally;
		deny = Sound.SallyDeny;
		main = team.get(0);
	}

	//updates player variables according to keyboard input as well as camera variables
	public void tick() {
        animRight.tick();
        animLeft.tick();
		
		
		getLoc();
		move();
		checkInteract();
	}
	
	private void getLoc() {
		xMove = speed;
		if(x >= (490)) {
			speed *= -1;
			xMove = speed;
		}
		if(x == (350)) {
			speed *= -1;
			xMove = speed;
		}
	}
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimFrame(), (int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), null);
	}
	
	private BufferedImage getCurrentAnimFrame() {
		if(xMove > 0)
			return animRight.getCurrentFrame();
		else if(xMove < 0)
			return animLeft.getCurrentFrame();
		else
			return Assets.player;
	}
	
	private void checkInteract() { 
	}
	
	public void die() {
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public String getName() {
		return name;
	}
	
	public Pokemon getMain() {
		return main;
	}
}