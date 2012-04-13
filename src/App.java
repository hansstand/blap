import model.*;


public class App {

	public static void main(String [ ] args)
	{
		System.out.println("Welkom");
		Game game = new Game();
		game.addNewPlayerToGame("hans", Type.WARRIOR,true);
		Player player = game.getCurrentPlayer();
		System.out.println(player.toString());

		
		Item helm = new Item("first helm",1,Rareness.COMMON,Slot.HELM,1);
		Item sword = new Item("first sword",1,Rareness.COMMON,Slot.WEAPON,1);
		Item helm2 = new Item("second helm",1,Rareness.COMMON,Slot.HELM,2);
		
		player.equipItem(helm);
		player.equipItem(sword);
		player.equipItem(helm2);
		Equipement e = player.getEquiement();
		System.out.println(e);
		
		Spellbook book = new Spellbook();
		Spell spell = new Spell("fireball",1,1,10,5);
		player.learnSpell(spell);
		System.out.println(player.getSpellbook().toString());
	}
}
