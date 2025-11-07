package Pattern.Behavioral.Observer.Example01;

public class MobileApp implements Observer{

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
