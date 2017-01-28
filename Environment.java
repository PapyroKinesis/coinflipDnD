package coinflip_dnd;

public class Environment {

    static Coinflip roll = new Coinflip();
    
    //gets your punctuation
    String fragments [][] = NameArrays.sentences;
    
    //gets environment array from NameArrays
    String environments [][] = NameArrays.environments;
    
    //gets length of the punctuation section of your fragment array
    int punctuation = fragments[3].length - 1;
    
    //gets length of sections in environment array
    int generalLocation = environments[0].length - 1;
    int generalAdj = environments[1].length - 1;
    
    public void EnvironmentDescription(){
        
        System.out.println("You are in a" + environments[0][roll.Flip(generalAdj)] + environments[1][roll.Flip(generalLocation)] 
                + fragments[3][roll.Flip(punctuation)]);
        
    }

}
