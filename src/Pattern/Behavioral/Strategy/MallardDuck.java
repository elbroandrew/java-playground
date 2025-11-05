package Pattern.Behavioral.Strategy;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

}
