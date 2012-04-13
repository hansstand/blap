package model;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Mob> mobs = new ArrayList<Mob>();
	private Player player;
	
	public Game()
	{
		
	}
	
	public void addNewPlayerToGame(String name, Type type, boolean male)
	{
		player = new Player(name,type,male);
		players.add(player);
	}
	
	public Player getCurrentPlayer()
	{
		return player;
	}
	public void addMob(Mob mob)
	{
		mobs.add(mob);
	}
}
