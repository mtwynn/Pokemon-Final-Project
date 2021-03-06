package dev.mtwynn.pokemon.states;

import java.awt.Graphics;

import dev.mtwynn.pokemon.Game;
import dev.mtwynn.pokemon.Handler;

//Coded with help by CodeNMore
//Creates a state of the game (menu, gameplay, worlds, ending screen, instructions, etc) 
public abstract class State {
	
	protected Game game;
	protected Handler handler;
	private static State currentState = null;
	protected float spawnX, spawnY;
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	public State(Handler handler) {
		this.handler = handler;
	}
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
