package Pattern.Builder;

public class Car {

    String maker;
    String color;
    String owner;

    private Car(String maker, String color, String owner){
        this.maker = maker;
        this.color = color;
        this.owner = owner;
    }

    public void displayInfo(){
        System.out.println(maker + " " + color + " " + owner);
    }

    public static class CarBuilder{

        // Create default fields
        private String maker = "none";
        private String color = "none";
        private String owner = "none";

        //methods that return CarBuilder

        public CarBuilder withMaker(String maker){
            this.maker = maker;
            return this;
        }

        public CarBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Car build(){
            return new Car(maker, color, owner);
        }
    }
}
