package coinflip_dnd;

public class NameDatabase {
	
	//sentance makers
	private static String [] monsters = {"slime", "skeleton", "spirit", "goblin", "wolf","fairy", "group of owlbears"};
	private static String [] proxFrag = {"Off in the distance ", "Around the corner ", "Nearby "};
	private static String [] verbFrag = {"rests a ", "is a ", "you see a "};
	private static String [] prepFrag = {" in the road.", " in a small copse of trees.", " on the ground."};
	private static String [] punct = {".", "!"};
	
	private static String [] envirAdjs = {" spooky", " bright", " lovely", "n unpleasant", " depressing", " dank", " peculiar", " disappointing"};
	private static String [] envirLocations = {" castle", " field", " ruin", " forest", " clearing", " hellscape"};
	
	
	
	public static String monsterSpotted(){
		return proxFrag[(int)(Math.random()*proxFrag.length)] + verbFrag[(int)(Math.random()*verbFrag.length)]
				 + getMobName(mob1) + punct[(int)(Math.random()*punct.length)];
		
	}
	
	public static String envirDesc(){
		return "You are in a" + envirAdjs[(int)(Math.random()*envirAdjs.length)] + envirLocations[(int)(Math.random()*envirLocations.length)];
	}
	
	
}
