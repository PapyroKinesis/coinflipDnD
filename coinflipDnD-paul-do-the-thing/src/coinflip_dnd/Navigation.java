package coinflip_dnd;

import java.util.Scanner;

public class Navigation {
   
    static int[] [] rooms = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 0, 1},
    };

    static int [] inRoom = {1, 1};
    static String north = null;
    static String south = null;
    static String east = null;
    static String west = null;

    static String[] encounters = {
			"chest", "monster", "monster", "nothing", "nothing", "nothing"
	};
	static String[] chestContents = {
			" a potion", " a surprise", "nothing"
	};
	static String contents;
	static String name = encounters[Coinflip.Flip(encounters.length - 1)];

	public void checkDir() {
		Nullify();
		north = checkNorth();
		south = checkSouth();
		west = checkWest();
		east = checkEast();
		if(north != null || south != null || east != null || west != null) {
			System.out.println("There is a path:");
			if(north.equals("north")) {
				System.out.println("north");
			}
			if(south.equals("south")) {
				System.out.println("south");
			}
			if(east.equals("east")) {
				System.out.println("east");
			}
			if(west.equals("west")) {
				System.out.println("west");
			}
		}
		name = encounters[Coinflip.Flip(encounters.length - 1)];
		CheckEncounter();
		Travel();
	}
	public void Travel() {
		System.out.println("Choose a direction to travel:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//if() {
			if(input.equals(north) && north.equals("north")) {
				inRoom[0]++;
				NameArrays.worldgen.EnvironmentDescription();
			}
			if(input.equals(south) && south.equals("south")) {
				inRoom[0]--;
				NameArrays.worldgen.EnvironmentDescription();
			}
			if(input.equals(west) && west.equals("west")) {
				inRoom[1]--;
				NameArrays.worldgen.EnvironmentDescription();
			}
			if(input.equals(east) && east.equals("east")) {
				inRoom[1]++;
				NameArrays.worldgen.EnvironmentDescription();
			//}
		}
		else {
			//System.out.println("Invalid input.");
			checkDir();
			Travel();
		}
	}
	public static void Nullify() {
		north = null;
		south = null;
		east = null;
		west = null;
	}
	public static String checkNorth() {
		if(inRoom[1]  != 0 && rooms[inRoom[0]-1] [inRoom[1]] != 0) {
			return "north";
		}
		else {
			return "no way north";
		}
	}
	public static String checkSouth() {
		if(inRoom[1] != 2 && rooms[inRoom[0]+1] [inRoom[1]] != 0) {
			return "south";
		}
		else {
			return "no way south";
		}
	}
	public static String checkWest() {
		if(inRoom[0] != 0 && rooms[inRoom[0]] [inRoom[1]-1] != 0) {
			return "west";
		}
		else {
			return "no way west";
		}
	}
	public static String checkEast() {
		if(inRoom[0] != 2 && rooms[inRoom[0]] [inRoom[1]+1] != 0) {
			return "east";
		}
		else {
			return "no way east";
		}
	}

	public void Navigate() {
		checkDir();
		Travel();
	}

	public void CheckEncounter() {
		if(name.equals("chest")) {
			System.out.println("You stumble upon a chest! Open it?");
			System.out.println("Type 'open' or 'leave'.");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			if(input.equals("open")) {
				contents = chestContents[Coinflip.Flip(chestContents.length) - 1];
				System.out.println("Within the chest was" + contents + 
						".");
				checkDir();
			}
			if(input.equals("leave")) {
				System.out.println("Best not to risk it.");
			}
			else {
				System.out.println("Best not to risk it.");
			}
		}
		if(name.equals("monster")) {
			BattleSim.BattleSim();
		}
		if(name.equals("nothing")) {
			System.out.println("There's nothing.");
		}
		//checkDir();
		//Travel();
	}
}