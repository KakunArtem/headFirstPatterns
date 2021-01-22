package ChapterOne.simUDuck;

import ChapterOne.simUDuck.quackRealization.Quack;
import ChapterOne.simUDuck.quackRealization.QuackBehavior;

public class DuckCaller {
    public QuackBehavior quackBehavior;

    public DuckCaller() {
        quackBehavior = new Quack();
    }

    public void customCall(Duck duck) {
        System.out.print("Call as founded duck: ");
        duck.performQuack();
    }

    public void callDuck() {
        quackBehavior.quack();
    }

}
