package model;

import java.util.HashMap;
import java.util.Map;

public class Equipement {
	
	
	private Map<Slot,Item> items = new HashMap<Slot,Item>();
	
	public Equipement()
	{
		
	}
	
	public void equipItem(Item item)
	{
		if (items.containsKey(item.getSlot()))
		{
			items.remove(item.getSlot());
			items.put(item.getSlot(),item);
		}
		else
			items.put(item.getSlot(),item);
	}
	
	@Override
	public String toString()
	{
		String message = "";
		for (Item i : items.values())
		{
			message += i.toString() +  "\n"; 
		}
		return message;
	}
	

}
