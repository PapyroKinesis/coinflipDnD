package coinflip_dnd;

public class Coinflip {
	static int Flip(int die) {
		int flip = (int) Math.round(Math.random()*die);
		return flip;
	}
}
