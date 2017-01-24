package coinflipping_dnd;

public class Coinflip {
	static double flip = Math.round(Math.random()*1);
	static int count = 0;
	
	
	public static void Flip() {
		flip = Math.round(Math.random()*1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(count <= 4) {
			System.out.println(flip);
			if(flip == 0) {
				System.out.println("The coin flipped tails!");
			}
			else {
				System.out.println("The coin flipped heads!");
			}
			Flip();
			count++;
		}
	}
}
