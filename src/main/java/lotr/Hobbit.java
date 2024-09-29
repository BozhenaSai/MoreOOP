package lotr;
public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    public void toCry() {
        System.out.println("Hobbit is crying, womp womp");
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    @Override
    public String toString() {
        return "Hobbit{hp="  + hp + ", power=" + power + "}";
    }
}