package dev.mtwynn.pokemon.tiles;

import dev.mtwynn.pokemon.gfx.Assets;

public class SHillTile extends Tile{

	public SHillTile(int id) {
		super(Assets.sHill, id);
	}
	
	public boolean isSolid() {
		return true;
	}

}
