package lotr;

import lombok.Getter;

@Getter
abstract public class MainCharacter {
    protected int power;
    protected int hp;
    abstract public void kick(MainCharacter character);
    public boolean isAlive() {
        return hp > 0;
    }
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
