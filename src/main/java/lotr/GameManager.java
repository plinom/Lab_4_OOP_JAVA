package lotr;

import java.util.Random;

public class GameManager {
    void fight(MainCharacter character1, MainCharacter character2) {
        Random rm = new Random();
        if(rm.nextInt(2) == 1) {
            MainCharacter target = character1;
            character1 = character2;
            character2 = target;
            System.out.println("Second__)");
        } else {
            System.out.println("First__)");
        }
        if(!character1.isAlive()) {
            System.out.println("First is dead(((");
        } else if(!character2.isAlive()) {
            System.out.println("Second is dead((");
        }
        while(character1.isAlive() && character2.isAlive()) {
            System.out.println("Still draw((");
            character2.kick(character1);
            MainCharacter target = character1;
            character1 = character2;
            character2 = target;
        }
    }
}
