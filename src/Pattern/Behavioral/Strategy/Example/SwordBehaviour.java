package Pattern.Behavioral.Strategy.Example;

public class SwordBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("swinging the sword");
    }
}
