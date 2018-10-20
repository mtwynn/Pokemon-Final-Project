package dev.mtwynn.pokemon.states;

import java.awt.Graphics;
import java.awt.Image;

import dev.mtwynn.pokemon.Handler;
import dev.mtwynn.pokemon.gfx.Assets;
import dev.mtwynn.pokemon.gfx.ImageLoader;
import dev.mtwynn.pokemon.ui.ClickListener;
import dev.mtwynn.pokemon.ui.UIImageButton;
import dev.mtwynn.pokemon.ui.UIManager;

//Creates the instruction screen displayed when user clicks "How to Play"
//in the main menu. 
public class InstructionState extends State {

	private UIManager uiManager;
	public Image instructionScreen = ImageLoader.loadImage("/textures/decor/InstructionScreen.png");
	
	public InstructionState(final Handler handle) {
		super(handle);
    	uiManager = new UIManager(handle);
     	handler.getMouseManager().setUIManager(uiManager);
     	uiManager.addObject(new UIImageButton(923, 702, 200, 151, Assets.btn_back, new ClickListener(){
     		
			Handler handler = handle;

			public void onClick() {
				handler.getMouseManager().setUIManager(uiManager);
				MenuState menuState = new MenuState(handle);
				State.setState(menuState);
			}
		}));
	}
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(instructionScreen, 0, 0, null);
		uiManager.render(g);
	}
}
