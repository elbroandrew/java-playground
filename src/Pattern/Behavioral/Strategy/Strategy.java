package Pattern.Behavioral.Strategy;

public class Strategy {

    // Head First Design Patterns book

}





class Quack implements QuackBehaviour{
    public void quack(){
        System.out.println("Quack");
    }
}

class NoQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("<< Silence >>");
    }
}

class Squeak implements QuackBehaviour {
    public void quack(){
        System.out.println("Squeak");
    }
}




class Fly implements FlyBehaviour{
    public void fly(){
        System.out.println("Can fly");
    }
}

class NoFly implements FlyBehaviour{
   public void fly(){
        System.out.println("Cannot Fly");
    }
}



