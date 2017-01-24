package coinflipping_dnd;

public class NameArrays {
	static String[] nouns = {
		"slime", "skeleton", "spirit", "goblin", "wolf",
		"fairy", "owlbear"
	};
	
	static Coinflip flip = new Coinflip();
	static int numberOfNouns = nouns.length - 1;
	
	public static void main(String[] args) {
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
	}
}
