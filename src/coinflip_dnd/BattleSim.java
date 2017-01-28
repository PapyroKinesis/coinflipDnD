package coinflip_dnd;

public class BattleSim {
    
    String string = Sentence.monster;
    
    public static void BattleSim() {
        System.out.println("The " + Sentence.monster + " engages in battle!");
        if(Sentence.Attack() == true) {
            System.out.println("You missed!");
        }
        else {
            System.out.println("You attacked, and hit!");
        }
    }
}
