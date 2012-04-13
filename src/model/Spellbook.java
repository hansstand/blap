package model;

import java.util.ArrayList;

public class Spellbook {
	
	private ArrayList<Spell> spells;
	
	public Spellbook()
	{
		spells = new ArrayList<Spell>();
	}
	
	public void learnNewSpell(Spell spell)
	{
		if(!spells.contains(spell))
		{
			spells.add(spell);
		}
	}
	
	@Override
	public String toString()
	{
		String message = "SpellBook: \n";
		for(Spell s : spells)
		{
			message += s.toString() +  "\n";
		}
		return message;
	}
}
