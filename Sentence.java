package coinflip_dnd;

public class Sentence {
    
    static Coinflip roll = new Coinflip();
    
    String[][] fragments = NameArrays.sentences;
    static String[] nouns = NameArrays.nouns;
    static int monsters = nouns.length - 1 ;
    int proximityFrag = fragments[0].length - 1;
    int verbFrag = fragments[1].length - 1;
    int prepFrag = fragments[2].length - 1;
    int punct = fragments[3].length - 1;
    
    static String monster = nouns[roll.Flip(monsters)];
    
    public void Sentence() {
        System.out.println(fragments[0][roll.Flip(proximityFrag)] + fragments[1][roll.Flip(verbFrag)] 
                + monster + fragments[3][roll.Flip(punct)]);
    }
    /*
     * Tim's Opinion on how you could make it better (scans thru whole array and prints stuff)
    public void sentence() {
        String sent = "";
        for(int r = 0; r < fragments.length; r++) {
            if(r == 2) 
                sent += monster + " ";
             sent += fragments[r][roll.Flip(fragments[r].length)]; 
        }
        System.out.println(sent);
    }
    */
    public static String Attack() {
        int hit = Coinflip.Flip(1);
        if(hit == 0) {
            return "tails";
        }
        else {
            return "heads";
        }
    }
    
    
}