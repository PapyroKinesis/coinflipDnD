package coinflip_dnd;

import java.util.Scanner;

public class PlayCoinFlipDnD {
	
	int playerHP = 10;
	int playerAtk = 1;
	
	static String [] monsters = {"slime", "skeleton", "spirit", "goblin", "wolf","fairy", "group of owlbears"};
	static String [] proxFrag = {"Off in the distance ", "Around the corner ", "Nearby "};
	static String [] verbFrag = {"rests a ", "is a ", "you see a "};
	static String [] prepFrag = {" in the road.", " in a small copse of trees.", " on the ground."};
	static String [] punct = {".", "!"};
	
	static String [] envirAdjs = {" spooky", " bright", " lovely", "n unpleasant", " depressing", " dank", " peculiar", " disappointing"};
	static String [] envirLocations = {" castle", " field", " ruin", " forest", " clearing", " hellscape"};
	
	static Monster mob1;
	
	
	
	public static String monsterSpotted(){
		return proxFrag[(int)(Math.random()*proxFrag.length)] + verbFrag[(int)(Math.random()*verbFrag.length)]
				 + mob1.getName() + punct[(int)(Math.random()*punct.length)];
		
	}
	
	public static String envirDesc(){
		return "You are in a" + envirAdjs[(int)(Math.random()*envirAdjs.length)] + envirLocations[(int)(Math.random()*envirLocations.length)];
	}
	
	
	
	public static void run() {
		envirDesc();
		mob1 = new Monster((int)(Math.random()*3+1), monsters[(int)(Math.random()*monsters.length+1)]);
		monsterSpotted();
		
		battleSim();
		
		
		/*
        //worldgen.EnvironmentDescription();
    	generate.Sentence();
    	//Monster victim = new Monster();
        //Monster.setUp();
    	//victim.setLvl();
    	//victim.setHp();
    	BattleSim.start = 0;
        BattleSim.BattleSim();
        */
    }
	
	public static void main(String[] args) {
		run();
	}
	
	public int Coinflip(int die) {
		return (int) (Math.random()*die+1);
	}
	
	public static String headsOrTails(){
		if(Math.random() >= .5){
			return "heads";
		}
		else{
			return "tails";
		}
	}
	
	public static void battleSim(){
		
		System.out.println("The " + mob1.getName() + " engages in battle!");
		System.out.println("It is level " + mob1.getLevel() + " with " + mob1.getHP() + " hitpoint(s)!");
	
	
		while(mob1.getHP() > 0){
			
			System.out.println("The " + mob1.getName() + " swings!\nCall heads or tails to defend!");
			Scanner scAtk = new Scanner(System.in);
			String input = scAtk.nextLine();
			if(input.equals(headsOrTails())) {
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
	}
	
}
