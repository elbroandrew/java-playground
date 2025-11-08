package Pattern.Behavioral.Observer.PUSH;

public class MobileApp implements Observer{

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
