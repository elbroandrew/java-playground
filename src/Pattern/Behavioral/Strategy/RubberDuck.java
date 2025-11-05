package Pattern.Behavioral.Strategy;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new NoQuack();
    }
}
