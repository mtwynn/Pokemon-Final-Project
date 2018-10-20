package dev.mtwynn.pokemon.worlds;

import java.awt.Graphics;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.entities.EntityManager;
import dev.mtwynn.pokemon.entities.creatures.Opponent;
import dev.mtwynn.pokemon.entities.creatures.Opponent2;
import dev.mtwynn.pokemon.entities.creatures.Opponent3;
import dev.mtwynn.pokemon.entities.creatures.Player;
import dev.mtwynn.pokemon.tiles.Tile;
import dev.mtwynn.pokemon.utils.Utils;

//Coded with help by CodeNMore
//Creates a World to hold entities as well as to set tiles in place
//based on the specifications within the world.txt files 
public class World {

	private Handler handler;
	private int width, height;
	private int[][] tiles;
	
	private EntityManager entityManager;
	
	public World(Handler handler, String path, int spawnX, int spawnY) { // initializes entities and loads world
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));//initializes an entity manager, and passes along a newly created player
		entityManager.addEntity(new Opponent(handler, 450, 317));
		entityManager.addEntity(new Opponent2(handler, 750, 620));
		entityManager.addEntity(new Opponent3(handler, 300, 750));
		loadWorld(path);
	}
	
	public int[][] getTiles() {
		return tiles;
	}

	public void setTiles(int[][] tiles) {
		this.tiles = tiles;
	}

	public void tick() {
		entityManager.tick();
	}
	
	//renders each unique tile at x and y, influenced by camera variables
	public void render(Graphics g) {
		int xStart = (int) Math.max(0, handler.getCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
	    int yStart = (int) Math.max(0, handler.getCamera().getyOffset() / Tile.TILEHEIGHT);
	    int yEnd = (int) Math.min(height, (handler.getCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) ((x * Tile.TILEWIDTH) - handler.getCamera().getxOffset()), 
						(int) ((y * Tile.TILEHEIGHT) - handler.getCamera().getyOffset()));
			}
		}
		
		entityManager.render(g);
	}
	
	//returns the tile (ID) at the x and y coordinates passed as arguments from loadWorld
	public Tile getTile(int x, int y) {
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.grassTile;
		return t;
	}
	
	//Splits the .txt file into components, assigns the values within the .txt file
	//to the variables specified in this class. Populates the tiles[][] 2D array 
	//with tile objects. 
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String [] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		
		tiles = new int[width][height];
	//	tiles[0][1] = Tile.treeTile;
		for(int y = 0; y < height; y++)
			for(int x = 0; x < width; x++)
			{
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 2]);
			}
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
