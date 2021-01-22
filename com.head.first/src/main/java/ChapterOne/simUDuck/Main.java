package ChapterOne.simUDuck;

import ChapterOne.simUDuck.flyRealization.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCaller duckCaller = new DuckCaller();
        duckCaller.customCall(duck);

    }
}
