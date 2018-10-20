package dev.mtwynn.pokemon.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.entities.creatures.Player;

//Coded with help by CodeNMore
public class EntityManager {
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {
		public int compare(Entity a, Entity b) {
			if(a.bounds.y + a.bounds.getHeight() < b.bounds.y + b.bounds.getHeight())
				return -1;
			return 1;
		}
	};
	public EntityManager (Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		entities.add(player);
	}
	
	public void tick() {
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
		Collections.sort(entities, renderSorter);
	}
	
	public void render(Graphics g) {
		for(Entity e : entities) { 
			e.render(g);
		}
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
}
