package Pattern.Behavioral.Strategy.Example;

public class Knight extends Character{

    @Override
    public void fight() {
        System.out.println("Knight: ");
        useWeapon();
    }
}
