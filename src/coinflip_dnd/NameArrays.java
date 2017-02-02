package coinflip_dnd;

public class NameArrays {
    static int hp = 10;
    static int atk = 1;
    
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
    
    static Coinflip flip = new Coinflip();
    static Sentence generate = new Sentence();
    static int numberOfNouns = nouns.length - 1;
    public static int numberOfSentences = sentences.length - 1;
    
    
    // Run the program!
    public static void main(String[] args) {
        generate.Sentence();
        // System.out.println(Sentence.monster);
        BattleSim.BattleSim();
    }
}
