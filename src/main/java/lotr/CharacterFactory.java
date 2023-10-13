package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.List;

abstract public class CharacterFactory {
    public MainCharacter createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Random rm = new Random();
        List<Class<? extends MainCharacter>> character = List.of(Elf.class, Hobbit.class, King.class, Knight.class);
        return character.get(rm.nextInt(character.size())).getConstructor().newInstance();
    }
}
