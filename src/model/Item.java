package model;

public class Item {

	private int price;
	private Rareness rareness;
	private Slot slot;
	private Type type;
	private Stats stats = new Stats(); 
	
	public Item(String name, int level, Rareness r, Slot s, int price)
	{
		stats.createNewItemStats(name, level);
		setPrice(price);
		setRareness(r);
		setSlot(s);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public void setType(Type type) {
		this.type = type;
	} 
	public void setRareness(Rareness rareness) {
		this.rareness = rareness;
	}
	
	public int getPrice() {
		return price;
	}public Rareness getRareness() {
		return rareness;
	}public Slot getSlot() {
		return slot;
	}public Stats getStats() {
		return stats;
	}public Type getType() {
		return type;
	}
	
	@Override
	public String toString()
	{
		return "Item: " + stats.getName() + " - Level: " + stats.getLevel() + " - " + rareness; 
	}
	
}
