package coinflipping_dnd;

public class Coinflip {
	int Flip(int die) {
		int flip = (int) Math.round(Math.random()*die);
		return flip;
	}
}
