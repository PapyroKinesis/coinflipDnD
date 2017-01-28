package coinflip_dnd;

import java.util.Scanner;

public class BattleSim {

    String name = Sentence.monster;
    Monster victim = new Monster();

    public static void BattleSim() {
        System.out.println("The " + Sentence.monster + " engages in battle!\nCall heads or tails to strike!");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equalsIgnoreCase(Sentence.Attack())) {
            System.out.println("You missed!");
        }
        else {
            System.out.println("You attacked, and hit!");
            
        }
        EnemyAtk();
    }
    public static void EnemyAtk() {
        System.out.println("The " + Sentence.monster + " swings!\nCall heads or tails to defend!");
        Scanner scAtk = new Scanner(System.in);
        String input = scAtk.nextLine();
        if(input.equals(Sentence.Attack())) {
            System.out.println("You failed at blocking!");
            NameArrays.hp = NameArrays.hp - 1;
            System.out.println("You have " + NameArrays.hp + " points of health left!");
        }
        else {
            System.out.println("You swiftly evaded!");
        }
        BattleSim();
    }
}