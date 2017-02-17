
package coinflip_dnd;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class BattleSim {
	
	
	
	static int start = 0;

	public void arena(){
		
		Monster mob1 = new Monster( (int)(Math.random()*3+1), NameDatabase.getMonster());
		
		System.out.println("The " + Sentence.monster + " engages in battle!");
		System.out.println("It is level " + mob1.getLevel() + " with " + mob1.getHP() + " hitpoint(s)!");
	
	
		while(mob1.getHP() > 0){
			
			System.out.println("The " + mob1.getName() + " swings!\nCall heads or tails to defend!");
			Scanner scAtk = new Scanner(System.in);
			String input = scAtk.nextLine();
			if(input.equals(Sentence.Attack())) {
				System.out.println("You swiftly evaded!");
			}
			else {
				System.out.println("You failed at blocking!");
				NameArrays.hp = NameArrays.hp - 1;
				System.out.println("You have " + NameArrays.hp + " points of health left!");
				if(NameArrays.hp <= 0) {
					System.out.println("Game Over!");
				}
			

			}
	
	
		}
	
	
	
	
	
	
	
	
	/*
	public static void brsSim() {
		if (start < 1) {
			System.out.println("The " + Sentence.monster + " engages in battle!");
			System.out.println("It is level " + NameArrays.victim.lvl + " with " + NameArrays.victim.hpM + " hitpoint(s)!");
		}
		System.out.println("Call heads or tails to strike!");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equals(Sentence.Attack())) {
			System.out.println("You attacked, and hit!");
			NameArrays.victim.hpM = NameArrays.victim.hpM - 1;
			System.out.println("The " + Sentence.monster + " is now at " + NameArrays.victim.hpM + " hitpoint(s)!");
		}
		else {
			System.out.println("You missed!");
		}
		start++;
		if(NameArrays.victim.hpM <= 0) {
			System.out.println("The " + Sentence.monster + " has died!");
			NameArrays.Run();
		}
		else {
			EnemyAtk();
		}
	}

	public static void EnemyAtk() {
		System.out.println("The " + Sentence.monster + " swings!\nCall heads or tails to defend!");
		Scanner scAtk = new Scanner(System.in);
		String input = scAtk.nextLine();
		if(input.equals(Sentence.Attack())) {
			System.out.println("You swiftly evaded!");
		}
		else {
			System.out.println("You failed at blocking!");
			NameArrays.hp = NameArrays.hp - 1;
			System.out.println("You have " + NameArrays.hp + " points of health left!");
			if(NameArrays.hp <= 0) {
				System.out.println("Game Over!");
			}
		}
		BattleSim();*/
	}
}
