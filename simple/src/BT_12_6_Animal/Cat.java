package BT_12_6_Animal;

public class Cat  extends Animal{
    private String eyeColor;
    private boolean status;
    private String type;

    public Cat(int idAnimal, String name, int age, String eyeColor, boolean status, String type) {
        super(idAnimal, name, age);
        this.eyeColor = eyeColor;
        this.status = status;
        this.type = type;
    }
    public void makeSound() {
        System.out.println("meow meow");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String healing(String heal){
        return "mèo được uống thuốc " + heal;
    }
    public String healing(String heal, int amount){
        return "mèo được uống thuốc "+ heal + amount + " viên";
    }

    @Override
    public String toString() {
        return "Cat " + super.toString() +
                "eyeColor='" + eyeColor +
                ", type='" + type + '\'' +
                " ";
    }
}
