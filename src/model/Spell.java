package model;

import java.util.List;

public class Spell {

	private int minDamage;
	private int maxDamage;
	private int level;
	private int manaCost;
	
	private String name;
	
	public Spell(String name, int level,int minDamage, int maxDamage, int manaCost)
	{
		setLevel(level);
		setManaCost(manaCost);
		setMaxDamage(maxDamage);
		setMinDamage(minDamage);
		setName(name);
	}
	
	@Override
	public String toString()
	{
		return "Spell : " + name + " Damage: " + minDamage + " - " + maxDamage + " Mana cost: " + manaCost;
	}
	
	
	
	public void setLevel(int level) {
		this.level = level;
	}
	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}public void setName(String name) {
		this.name = name;
	}
	
	
	
}
