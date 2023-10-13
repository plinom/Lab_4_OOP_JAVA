package lotr;

public class Elf extends MainCharacter {
    public Elf() {
        power = 10;
        hp = 10;
    }
    public void kick(MainCharacter character) {
        if(character.getPower() < power) {
            character.setHp(0);
        } else {
            --power;
        }
    }
    @Override
    public String toString() {
        return "Elf{" + "hp=" + hp + ", power=" + power + '}';
    }
}
