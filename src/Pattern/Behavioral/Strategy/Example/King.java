package Pattern.Behavioral.Strategy.Example;

public class King extends Character{


    @Override
    public void fight() {
        System.out.println("King: ");
        useWeapon();
    }
}
