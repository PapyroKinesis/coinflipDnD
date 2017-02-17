package coinflip_dnd;

public class Monster {
	private int hitPoints;
	private int mobAttack;
	private int level;
	private String mobName;
	
	
	public Monster(int lvl, String name){
		level = lvl;
		mobName = name;
		hitPoints = level; //the hitpoints are the level
		mobAttack = level +((int) (Math.random()*3)-1);
	}
	
	public void setHP(int set){
		hitPoints = set;
	}
	
	public void setName(String name){
		mobName = name;
	}
	
	public int getHP(){
		return hitPoints;
	}
	
	public int getLevel(){
		return level;
	}
	
	public int getAtk(){
		return mobAttack;
	}
	
	public String getName(){
		return mobName;
	}
	
}
    
