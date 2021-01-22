package ChapterOne.simUDuck;

import ChapterOne.simUDuck.flyRealization.FlyNoWay;
import ChapterOne.simUDuck.quackRealization.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m model duck");
    }


}
