package Pattern.Behavioral.Strategy.Example;

public class AxeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
