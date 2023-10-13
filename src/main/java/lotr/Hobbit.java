package lotr;

public class Hobbit extends MainCharacter {
    public Hobbit() {
        hp = 3;
        power = 0;
    }
    public void kick(MainCharacter character) {
        System.out.println("---");
    }
    @Override
    public String toString() {
        return "Hobbit{" + "hp=" + hp + ", power=" + power + '}';
    }
}
