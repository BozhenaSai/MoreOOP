package lotr;

import java.util.Random;

public abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void ToString() {
        System.out.println("Character{hp=" + hp + ", power=" + power + "}");
    }

    public int randomHp(int num1, int num2) {
        Random random = new Random();
        return random.nextInt(num1) + num2;
    }
    public int randomPower(int num1, int num2) {
        Random random = new Random();
        return random.nextInt(num1) + num2;
    }
}
