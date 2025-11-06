package Pattern.Behavioral.Strategy.Example;

public abstract class Character {

    private WeaponBehaviour weapon; // ссылка на СТРАТЕГИЮ

    public Character(){

    }

    public void setWeapon(WeaponBehaviour w){
        this.weapon = w;
    }

    void useWeapon(){
        if (weapon != null){
            weapon.useWeapon();
        }
    }

    public abstract void fight();
}
