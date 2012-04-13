package model;

public class Stats {
	private int hp;
	private int mp;
	private int stamina;
	private int strength;
	private int intellect;
	private String name;
	private int level;
	private int attack;
	private int defence;
	private int magicAttack ;
	private int magicDefence;
	
	public Stats ()
	{
		
	}
	
	public void createNewItemStats(String name,int level)
	{
		setName(name);
		setLevel(level);
	}
	public void createNewPlayerStats(String name,Type type)
	{
		this.name = name;
		level = 5;
		hp = 100;
		mp = 100;
		intellect = 10;
		strength = 10;
		stamina = 10;
		attack = 5;
		defence = 5;
		magicAttack = 5;
		magicDefence = 5;
		
		
		if (type == Type.WARRIOR)
		{
			hp = hp + 50;
			mp = mp - 50;
		}
		
		if (type == Type.MAGE)
		{
			hp = hp - 50;
			mp = mp + 50;
		}
	}
	
	@Override
	public String toString()
	{
		String message = "Name: " + name + "\n";
		message += "Level: " + level + "\n";
		message += "Hp: " + hp + "\n";
		
		return message;
	}
	
	public int getAttack() {
		return attack;
	}
	public int getDefence() {
		return defence;
	}
	public int getHp() {
		return hp;
	}
	public int getIntellect() {
		return intellect;
	}public int getLevel() {
		return level;
	}public int getMagicAttack() {
		return magicAttack;
	}public int getMagicDefence() {
		return magicDefence;
	}public String getName() {
		return name;
	}public int getMp() {
		return mp;
	}public int getStamina() {
		return stamina;
	}public int getStrength() {
		return strength;
	}public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
