package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("The fight begins between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.getHp() > 0 && c2.getHp() > 0) {
            // System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + " with " + c1.getPower() + " power");
            c1.kick(c2);
            // System.out.println(c2.getClass().getSimpleName() + " has " + c2.getHp() + " HP left");

            if (c2.getHp() <= 0) {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated!");
                break;
            } else {
                System.out.println(c2.getClass().getSimpleName() + " has " + c2.getHp() + " HP left");
            }


            // System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + " with " + c2.getPower() + " power");
            c2.kick(c1);
            // System.out.println(c2.getClass().getSimpleName() + " has " + c2.getHp() + " HP left");

            if (c1.getHp() <= 0) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated!");
                break;
            } else {
                System.out.println(c1.getClass().getSimpleName() + " has " + c1.getHp() + " HP left");
            }

        }

        if (c1.getHp() > 0) {
            System.out.println(c1.getClass().getSimpleName() + " wins the battle!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " wins the battle!");
        }
    }
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character c1 = new CharacterFactory().createCharacter();
        Character c2 = new CharacterFactory().createCharacter();

        while (c1.getClass().equals(c2.getClass())) {
            c2 = characterFactory.createCharacter();
        }
        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);
    }

}
