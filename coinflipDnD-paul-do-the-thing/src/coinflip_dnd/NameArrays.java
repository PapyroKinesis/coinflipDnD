package coinflip_dnd;

public class NameArrays {//OBSOLETE - FASE OUT ASAP
    static int hp = 10;
    static int atk = 1;
    static int mLvl = 1;
    
    public String[] nouns = {
        "slime", "skeleton", "spirit", "goblin", "wolf",
        "fairy", "group of owlbears"
    };
    
    public String[][] sentences = {
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
    
    public String[][] environments = {
            {   //generalAdj
                " spooky", " bright", " lovely", "n unpleasant", " depressing", " dank", " peculiar", " disappointing"
            },
            {   //generalLocation
                " castle", " field", " ruin", " forest", " clearing", " hellscape"
            }
    };
    

    
    Coinflip flip = new Coinflip();
    Sentence generate = new Sentence();
    Environment worldgen = new Environment();
    int numberOfNouns = nouns.length - 1;
    public int numberOfSentences = sentences.length - 1;
    
    
    

}
