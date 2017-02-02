package coinflip_dnd;

import java.util.Scanner;

public class BattleSim {

    String name = Sentence.monster;
    static Monster victim = new Monster();
    static int start = 0;
    
    public static void BattleSim() {
        if(start == 0) {
            System.out.println("The " + Sentence.monster + " engages in battle!");
        }
        System.out.println("Call heads or tails to strike!");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(Sentence.Attack())) {
            System.out.println("You missed!");
            EnemyAtk();
        }
        else {
            System.out.println("You attacked, and hit!");
            victim.hp = victim.hp - NameArrays.atk;
            System.out.println("The " + victim.name + " is at " + victim.hp + " hitpoints!");
            if(victim.hp > 0) {
                EnemyAtk();
            }
            else {
                System.out.println("The " + victim.name + " has died!");
                System.out.println("");
                NameArrays.Reset();
            }
        }
        
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
