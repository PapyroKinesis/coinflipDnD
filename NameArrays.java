package coinflip_dnd;

public class NameArrays {
	static String[] nouns = {
		"slime", "skeleton", "spirit", "goblin", "wolf",
		"fairy", "group of owlbears"
	};
	
	static String[][] sentences = {
			{
				"Off in the distance ", "Around the corner ", "Nearby "
			},
			{
				"rests a ", "is a ", "you see a "
			},
			{
				" in the road.", " in a small copse of trees.", " on the ground."
			}
	};
	
	static Coinflip flip = new Coinflip();
	static int numberOfNouns = nouns.length - 1;
	static int numberOfSentences = sentences.length - 1;
	
	public static void main(String[] args) {
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		System.out.println(nouns[flip.Flip(numberOfNouns)]);
		
	}
}
