package lotr;

import lombok.ToString;
import java.util.Random;

@ToString
public class Knight extends MainCharacter {
    protected Knight(int minimum) {
        Random rm = new Random();
        hp = rm.nextInt(12) + minimum;
        power = rm.nextInt(12) + minimum;
    }
    public Knight() {
        this(2);
    }
    public void kick(MainCharacter character) {
        character.setHp(character.getHp() - power);
    }
}
