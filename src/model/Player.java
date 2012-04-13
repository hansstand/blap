package model;

public class Player {
	private Spellbook spellbook;
	private Inventory inventory;
	private Equipement equiement;
	private Type type;
	private Stats stats = new Stats();
	private boolean male ;
	
	
	public Player (String name, Type type, boolean male)
	{
		stats.setName(name);
		setType(type);
		setMale(male);
		stats.createNewPlayerStats(name,type);
		equiement = new Equipement();
		spellbook = new Spellbook();
	}
	
	public void equipItem(Item item)
	{
		equiement.equipItem(item);
	}
	
	public void learnSpell(Spell spell)
	{
		spellbook.learnNewSpell(spell);
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public void setMale(boolean male) {
		this.male = male;
	}
	
	
	
	@Override
	public String toString()
	{
		return stats.toString();
	}
	public Stats getStats() {
		return stats;
	}
	public Equipement getEquiement() {
		return equiement;
	}
	public Spellbook getSpellbook() {
		return spellbook;
	}
	
	
}
