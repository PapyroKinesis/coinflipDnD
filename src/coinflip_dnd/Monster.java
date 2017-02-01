package coinflip_dnd;

class Monster {
    // Monster statistics
    int hp = 1;
    int atkMonster = 1;
    String name;
    
    public Monster() {

    }
    public void setHp(int range) {
        Coinflip.Flip(range);
    }

}
