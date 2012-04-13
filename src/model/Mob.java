package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Mob {
	private Stats stats=  new Stats();
	private HashMap<Item,Double> loot;
	
	public Mob(String name,int level,HashMap<Item,Double> map)
	{
		stats.createNewMobStats(name, level);
        setLoot(loot);
	}
	
	public void setLoot(HashMap<Item,Double>loot)
	{
		this.loot = loot;
	}
	
	public double getGold()
	{
		Random random = new Random(100);
		int x = random.nextInt();
		double y = Math.pow(x,stats.getLevel());
		return y;
	}
	
	public ArrayList<Item> getLoot()
	{
		ArrayList<Item> result =  new ArrayList<Item>();
		Random random = new Random(1000);
		double y = (random.nextDouble()/1000)*100;
		for (Item item : loot.keySet())
		{
			if(loot.get(item)<= y && loot.size()<= stats.getLevel()+2)
				result.add(item);
		}
		return result;
	}
	
	@Override
	public String toString()
	{
		return stats.toString();
	}
}
