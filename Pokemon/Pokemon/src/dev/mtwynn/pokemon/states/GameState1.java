package dev.mtwynn.pokemon.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.Sound.Sound;
import dev.mtwynn.pokemon.ui.UIManager;
import dev.mtwynn.pokemon.worlds.World;

//Coded with help by CodeNMore
//Initializes a playable state of the game by initializing a world. 
public class GameState1 extends State {

    private UIManager uiManager;
	private World world1;
	private Handler handler;
	public GameState1(final Handler handle, int spawnX, int spawnY) {
		super(handle);
		handler = handle;
		uiManager = new UIManager(handle);
		world1 = new World(handle, "res/Worlds/world1.txt", spawnX, spawnY);
		handle.setWorld(world1);
		handle.getCamera().center(handler.getWorld().getEntityManager().getPlayer());
     	handle.getMouseManager().setUIManager(uiManager);
     	
    }
			
	public void tick() {
		world1.tick();
		//System.out.println(handler.getWorld().getEntityManager().getPlayer().getX() + "   "
				//+ handler.getWorld().getEntityManager().getPlayer().getY());
		if(handler.getWorld().getEntityManager().getPlayer().getY() > 1440 && 
				handler.getWorld().getEntityManager().getPlayer().getX() < 1435 &&
		handler.getWorld().getEntityManager().getPlayer().getX() > 1380){ 
			GameState2 gameState2 = new GameState2(handler, 1409, 15);
			State.setState(gameState2);
		}
		
		if(handler.getWorld().getEntityManager().getPlayer().getY() < -65) { 
			GameState0 gameState0 = new GameState0(handler);
			State.setState(gameState0);
			Sound.Background.stop();
		}
		
	}

	public void render(Graphics g) {
		uiManager.render(g);
		world1.render(g);
		g.setFont(new Font("TimesRoman", Font.BOLD, 18)); 
		g.setColor(Color.BLACK);
		g.drawString("Plains 1", 1050, 25);

	}

}
