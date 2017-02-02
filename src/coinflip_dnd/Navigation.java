package coinflip_dnd;

import java.lang.reflect.Array;

public class Navigate {

    static int[] rooms = {
            0, 1, 0,
            1, 1, 1,
            0, 0, 1
    };

    static int inRoom = 4;
    static Array[] paths = new Array[4];
    static String north = null;
    static String south = null;
    static String east = null;
    static String west = null;

    public static void checkDir() {
        if(inRoom > 2 && inRoom < 6) {
            north = checkNorth();
            south = checkSouth();
        }

    }

    public static String checkNorth() {
        if((inRoom - 3 ) > 0 && rooms[inRoom - 3] > 0) {
            return "north";
        }
        else {
            return "no way north";
        }
    }
    public static String checkSouth() {
        if((inRoom + 3) < 8 && rooms[inRoom + 3] > 0) {
            return "south";
        }
        else {
            return "no way south";
        }
    }
    public static String checkWest() {
        if(rooms[inRoom - 1] >= 0 && rooms[inRoom - 1] <= 8) {
            return "west";
        }
        else {
            return "no way west";
        }
    }
    public static String checkEast() {
        if(rooms[inRoom + 1] >= 0 && rooms[inRoom + 1] <= 8) {
            return "east";
        }
        else {
            return "no way east";
        }
    }

    public static void Navigate() {
        checkDir();
        if(north != null && south != null) { //&& west != null && east != null) {
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
    }
}
