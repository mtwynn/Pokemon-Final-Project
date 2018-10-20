package dev.mtwynn.pokemon.entities.creatures;

import java.util.ArrayList;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.entities.Entity;
import dev.mtwynn.pokemon.entities.creatures.pokemon.Pokemon;
import dev.mtwynn.pokemon.tiles.Tile;

//Coded with help by CodeNMore
public abstract class Creature extends Entity {

	public ArrayList<Pokemon> team = new ArrayList<Pokemon>();
	public static float DEFAULT_SPEED = 2.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 32,
			                DEFAULT_CREATURE_HEIGHT = 32;
	protected Pokemon main;
	protected float speed;
	protected float xMove, yMove;

	
	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	
	public void move() { //if no collision, invoke move character according to xMove, the speed 
		if(!checkCollision(xMove, 0f))
			moveX();
		if(!checkCollision(0f, yMove))
		    moveY();
	}
	
	public void moveX() {
		if(xMove > 0) { //moving to the right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH; // right side of the bounding box
			
			if(!collision(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) && !collision(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
				x += xMove;
			}
			else {
				x = tx * Tile.TILEWIDTH - bounds.x - bounds.width - 1;
			}
		}
		
		else if(xMove < 0) { // moving to the left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH; // left side of the bounding box
			
			if(!collision(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) && !collision(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
			    x += xMove;
			}
			else {
				x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
			}
		}
	}
	
	public void moveY() {
		if(yMove < 0) { //moving up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT; // top side of the bounding box
			
			if(!collision((int) (x + bounds.x) / Tile.TILEWIDTH, ty) && !collision((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			}
			else {
				y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
			}
		}
		
		else if(yMove > 0) { // moving down
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT; // bottom side of the bounding box
			
			if(!collision((int) (x + bounds.x) / Tile.TILEWIDTH, ty) && !collision((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
			    y += yMove;
			}
			else {
				y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height - 1;
			}
		}
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	protected boolean collision(int x, int y) {
		return handler.getWorld().getTile(x, y).isSolid();
	}
	
	public abstract Pokemon getMain();
}
