package coinflipping_dnd;

public class Coinflip {
	// static int count = 0;
	// static int die = 1;
	// static double flip = Math.round(Math.random()*die);
	// static int flip = (int) Math.round(Math.random());
	
	int Flip(int die) {
		int flip = (int) Math.round(Math.random()*die);
		return flip;
	}
}
