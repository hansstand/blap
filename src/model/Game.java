package model;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Player player;
	
	public Game()
	{
		
	}
	
	public void addNewPlayerToGame(String name, Type type, boolean male)
	{
		player = new Player(name,type,male);
	}
	
	public Player getCurrentPlayer()
	{
		return player;
	}
}
