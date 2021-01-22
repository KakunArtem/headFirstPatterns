package ChapterOne.Game;

import ChapterOne.Game.weapon.BowAndArrowBehavior;
import ChapterOne.Game.weapon.KnifeBehavior;

public class Main {
    public static void main(String[] args) {
        Character queen = new Queen();

        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
    }
}
