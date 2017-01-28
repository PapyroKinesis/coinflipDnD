package coinflip_dnd;

import java.util.Scanner;

public class BattleSim {

    String string = Sentence.monster;

    public static void BattleSim() {
        System.out.println("The " + Sentence.monster + " engages in battle!\nCall heads or tails to strike!");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(Sentence.Attack())) {
            System.out.println("You missed!");
        }
        else {
            System.out.println("You attacked, and hit!");
        }
    }
}
