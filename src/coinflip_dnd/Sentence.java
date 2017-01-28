package coinflip_dnd;

public class Sentence {
	
	static Coinflip roll = new Coinflip();
	
	String[][] fragments = NameArrays.sentences;
	String[] nouns = NameArrays.nouns;
	int monsters = nouns.length - 1 ;
	int proximityFrag = fragments[0].length - 1;
	int verbFrag = fragments[1].length - 1;
	int prepFrag = fragments[2].length - 1;
	int punct = fragments[3].length - 1;

	public void Sentence() {
		System.out.println(fragments[0][roll.Flip(proximityFrag)] + fragments[1][roll.Flip(verbFrag)] 
				+ nouns[roll.Flip(monsters)] + fragments[3][roll.Flip(punct)]);
	}
	
}
