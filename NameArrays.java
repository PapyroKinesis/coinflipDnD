package coinflipping_dnd;

public class NameArrays {
	static String[] monsters = {
		"slime", "skeleton", "spirit", "goblin", "wolf",
		"fairy"
	};
	
	static Coinflip flip = new Coinflip();
	static int sizeOfMonsters = monsters.length - 1;
	
	public static void main(String[] args) {
		System.out.println(monsters[flip.Flip(sizeOfMonsters)]);
		System.out.println(monsters[flip.Flip(sizeOfMonsters)]);
		System.out.println(monsters[flip.Flip(sizeOfMonsters)]);
		System.out.println(monsters[flip.Flip(sizeOfMonsters)]);
		System.out.println(monsters[flip.Flip(sizeOfMonsters)]);
	}
}
