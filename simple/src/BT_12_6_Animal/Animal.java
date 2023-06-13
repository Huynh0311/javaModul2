package BT_12_6;

public class Animal {
    private int idAnimal;
    private String name;
    private int birth;
    private static int countId = 0;
    private boolean checkCat;
    public Animal(){

    }

    public Animal(int idAnimal, String name, int birth) {
        this.idAnimal = countId;
        this.name = name;
        this.birth = birth;
        countId++;
    }

    @Override
    public String toString() {
        return "Animal " +
                "idAnimal=" + idAnimal +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ' ';
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public static int getCountId() {
        return countId;
    }

    public void makeSound(){
        System.out.println("Animal make sound");
    }
    public static boolean isCheckCat(Animal animal){
        return animal instanceof Cat;
    }

    
}
