package ChapterOne.Game;

import ChapterOne.Game.weapon.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weapon;
    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
