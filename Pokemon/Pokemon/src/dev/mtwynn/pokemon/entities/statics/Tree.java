package dev.mtwynn.pokemon.entities.statics;

import java.awt.Graphics;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.gfx.Assets;
import dev.mtwynn.pokemon.tiles.Tile;

//Coded with help by CodeNMore
public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 24;
	    bounds.y = 54;
	    bounds.width = 16;
	    bounds.height = 9;
	}
	
	public void die() { 
		
	}
	
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.tree, (int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), null);
		
	}
}
