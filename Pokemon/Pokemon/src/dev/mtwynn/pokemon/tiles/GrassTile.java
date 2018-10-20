package dev.mtwynn.pokemon.tiles;

import dev.mtwynn.pokemon.gfx.Assets;

public class GrassTile extends Tile{
	
	public GrassTile(int id) {
		super(Assets.grass, id);
	}

	public boolean isSolid() { 
		return false;
	}

}
