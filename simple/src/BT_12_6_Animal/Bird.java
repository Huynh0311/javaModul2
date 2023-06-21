package BT_12_6_Animal;

public class Bird extends Animal {
    private String Mo;
    private boolean isFLy;
    private String type;

    public Bird(int idAnimal, String name, int birth, String mo, boolean isFLy, String type) {
        super(idAnimal, name, birth);
        Mo = mo;
        this.isFLy = isFLy;
        this.type = type;
    }
    public void makeSound() {
        System.out.println("Quang quang đòi trà sữa");
    }
}
