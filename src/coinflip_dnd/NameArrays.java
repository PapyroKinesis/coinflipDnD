package coinflip_dnd;

public class NameArrays {
	//Character statistics
	static int hp = 10;
	static int atk = 1;
	static int mLvl = 1;
	static int potions = 0;
	
	public static String[] nouns = {
        "slime", "skeleton", "spirit", "goblin", "wolf",
        "fairy", "group of owlbears"
    };
    
    public static String[][] sentences = {
            {   //proximityFrag
                "Off in the distance ", "Around the corner ", "Nearby "
            },
            {   //verbFrag
                "rests a ", "is a ", "you see a "
            },
            {   //prepFrag
                " in the road.", " in a small copse of trees.", " on the ground."
            },
            {   //punct
                ".", "!"
            }
    };
    public static String[][] environments = {
            {   //generalAdj
                " spooky", " bright", " lovely", "n unpleasant",
                " depressing", " dank", " peculiar"
            },
            {   //generalLocation
                " castle", " field", " ruin",
                " forest", " clearing"
            }
    };
    
    static Coinflip flip = new Coinflip();
    static Sentence generate = new Sentence();
    static Environment worldgen = new Environment();
    static int numberOfNouns = nouns.length - 1;
    public static int numberOfSentences = sentences.length - 1;
    
    static Monster victim = new Monster();
    
    public static void Run() {
    	worldgen.EnvironmentDescription();
    	//generate.Sentence();
    	Monster victim = new Monster();
        Monster.setUp();
    	victim.setLvl();
    	victim.setHp();
    	
    	BattleSim.start = 0;
        //BattleSim.BattleSim();
    	Navigate.Navigate();
    }
    
    // Run the program!
    public static void main(String[] args) {
    	//Run();
    	Navigate.Navigate();
    }
}
