package dev.mtwynn.pokemon;

public class Launcher {

	//launches game
	public static void main (String [] args) {
		Game game = new Game("Pokemon", 1132, 853);
		game.start();
	}
}
