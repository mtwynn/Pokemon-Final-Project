package dev.mtwynn.pokemon.entities.statics;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.entities.Entity;

//Coded with help by CodeNMore
public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
