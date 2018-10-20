package dev.mtwynn.pokemon.tiles;

import dev.mtwynn.pokemon.gfx.Assets;

public class STreeTile extends Tile{
	
	public STreeTile(int id) {
		super(Assets.sTree, id);
	}
	
	public boolean isSolid() {
		return true;
	}

}
