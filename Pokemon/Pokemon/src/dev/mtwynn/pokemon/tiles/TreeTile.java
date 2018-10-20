package dev.mtwynn.pokemon.tiles;

import dev.mtwynn.pokemon.gfx.Assets;

public class TreeTile extends Tile{
	
	public TreeTile(int id) {
		super(Assets.tree, id);
	}
	
	public boolean isSolid() {
		return true;
	}
}
