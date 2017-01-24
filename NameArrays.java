package coinflipping_dnd;

public class NameArrays<E> {
	static String[] names = {
		"slime", "skeleton", "spirit", "goblin", "wolf",
		"fairy"
	};
	
	static Coinflip flip = new Coinflip();
	
	public static void main(String[] args) {
		
		// System.out.println();
		System.out.println(names[flip.Flip(5)]);
		
	}
}
