package Algorithm;


import Algorithm.Sort.MergeSort.MergeSort;
import Pattern.Behavioral.Strategy.MallardDuck;
import Pattern.Behavioral.Strategy.RubberDuck;

public class Main {

    public static void main(String[] args) {


        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();





    }
}
