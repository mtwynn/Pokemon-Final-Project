package dev.mtwynn.pokemon.Sound;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {//holds all AudioClip objects and their respective .wav files (sound dictionary, basically)
	
	//BGM
    public static final AudioClip Background = Applet.newAudioClip(Sound.class.getResource("/audio/music/Maple.wav"));
    public static final AudioClip start = Applet.newAudioClip(Sound.class.getResource("/audio/music/Start Menu.wav"));
    public static final AudioClip Tommy = Applet.newAudioClip(Sound.class.getResource("/audio/music/SecretLevel.wav"));
    public static final AudioClip HappyVille = Applet.newAudioClip(Sound.class.getResource("/audio/music/HappyVille.wav"));
    public static final AudioClip Battle = Applet.newAudioClip(Sound.class.getResource("/audio/music/Battle.wav"));
    
    //Monologues
    public static final AudioClip Sally = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/Sally.wav"));
    public static final AudioClip Jimbob = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/Jimbob.wav"));
    public static final AudioClip DillPickle = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/Dill Pickle.wav"));
    public static final AudioClip SallyDeny = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/SallyDeny.wav"));
    public static final AudioClip JimbobDeny = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/JimbobDeny.wav"));
    public static final AudioClip DillPickleDeny = Applet.newAudioClip(Sound.class.getResource("/audio/monologue/Dill PickleDeny.wav"));

    
    //Sound Effects
    public static final AudioClip victory = Applet.newAudioClip(Sound.class.getResource("/audio/sfx/Victory.wav"));
    public static final AudioClip defeat = Applet.newAudioClip(Sound.class.getResource("/audio/sfx/Defeat.wav"));
    
    //Moves
    public static final AudioClip tackle = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Tackle.wav"));
    public static final AudioClip vineWhip = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Vine Whip.wav"));
    public static final AudioClip leechSeed = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Leech Seed.wav"));
    public static final AudioClip bubble = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Bubble.wav"));
    public static final AudioClip waterGun = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Water Gun.wav"));
    public static final AudioClip poisonPowder = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Poison Powder.wav"));
    public static final AudioClip tailWhip = Applet.newAudioClip(Sound.class.getResource("/audio/attacks/Tail Whip.wav"));





}