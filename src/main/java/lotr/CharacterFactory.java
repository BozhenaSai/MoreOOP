package lotr;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class CharacterFactory {

    public Character createCharacter() throws InstantiationException, 
IllegalAccessException, IllegalArgumentException, InvocationTargetException, 
NoSuchMethodException, SecurityException, ClassNotFoundException {
        Random random = new Random();
        int characterType = random.nextInt(4);

        if (characterType == 0) {
            return (Character) Class.forName("lotr.King").getDeclaredConstructor().newInstance();
        } else if (characterType == 1) {
            return (Character) Class.forName("lotr.Knight").getDeclaredConstructor().newInstance();
        } else if (characterType == 2) {
                return (Character) Class.forName("lotr.Elf").getDeclaredConstructor().newInstance();
        } else {
                return (Character) Class.forName("lotr.Hobbit").getDeclaredConstructor().newInstance();
        }
    }
}