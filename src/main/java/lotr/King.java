package lotr;
public class King extends Character {

    public King() {
        super(5, 5);
        this.hp = randomHp(11, 5);
        this.power = randomPower(11, 5);
    }

    @Override
    public void kick(Character c) {
        int damage = this.power;
        c.setHp(c.getHp() - damage);

    }

}
