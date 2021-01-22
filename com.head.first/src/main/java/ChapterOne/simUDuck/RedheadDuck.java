package ChapterOne.simUDuck;

import ChapterOne.simUDuck.flyRealization.FlyNoWay;
import ChapterOne.simUDuck.quackRealization.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I`m Redhead Duck");
    }
}
