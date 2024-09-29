package lotr;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Random random = new Random();
        int characterType = random.nextInt(4);

        if (characterType == 0) {
            return new King();
        } else if (characterType == 1) {
            return new Knight();
        } else if (characterType == 2) {
            return new Elf();
        } else {
            return new Hobbit();
        }
    }
}
