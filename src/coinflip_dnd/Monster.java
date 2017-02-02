package coinflip_dnd;

public class Monster {
	// Monster statistics
	static int hpM = 1;
	static int atkMonster = 1;
	static int lvl = 1;
	static String name = Sentence.monster;
	static int[][] levels = {
			{
				1, 2
			},
			{
				1, 2, 3
			}
	};

	public void setLvl() {
		lvl = Coinflip.Flip(NameArrays.mLvl);
		if (lvl < 1) {
			lvl = 1;
		}
	}
	public void setHp() {
		this.hpM = levels[this.lvl][Coinflip.Flip(levels[lvl].length - 1)];
	}
	public static void setUp() {
		hpM = 1;
		atkMonster = 1;
		lvl = 1;
		name = Sentence.monster;
	}
    public Monster() {
	}
}
    
