package lotr;

public class Knight extends Character{
    public Knight() {
        super(10, 10);
        this.hp = randomHp(9, 2);
        this.power = randomPower(9, 2);
    }

    @Override
    public void kick(Character c) {
        int damage = this.power;
        c.setHp(c.getHp() - damage);
    }
    
}
