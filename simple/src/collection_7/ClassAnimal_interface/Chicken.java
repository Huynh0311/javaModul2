package collection_7.ClassAnimal_interface;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "cluck_luck!";
    }

    @Override
    public String howToEat() {
        return "Chiên giòn";
    }

    @Override
    public void fruit() {

    }
}
