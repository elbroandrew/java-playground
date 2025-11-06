package Pattern.Behavioral.Strategy.Example;

public class Game {

    public static void main(String[] args) {
        Character king = new King();
        Character knight = new Knight();

        king.setWeapon(new SwordBehaviour());
        knight.setWeapon(new SwordBehaviour());

        king.fight();
        knight.fight();

        king.setWeapon(new AxeBehaviour());
        king.fight();
    }

}
