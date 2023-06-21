package BT_12_6_Animal;

public class Dog extends Animal {
    private String color;
    private String type;

    public Dog(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public Dog(int idAnimal, String name, int birth, String color, String type) {
        super(idAnimal, name, birth);
        this.color = color;
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public String toString() {
        return "Dog " + super.toString() +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                " ";
    }
}
