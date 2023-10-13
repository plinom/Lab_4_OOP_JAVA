package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.List;

abstract public class CharacterFactory {
    public MainCharacter createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Random rm = new Random();
        List<Class<? extends MainCharacter>> a = List.of(Hobbit.class, Elf.class, King.class, Knight.class);
        return a.get(new Random().nextInt(a.size())).getConstructor().newInstance();
    }
}
