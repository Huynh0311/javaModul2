package BT_12_6_Animal;

public class Manage {
    public Animal[] animals;
    public static int size = 0;

    public Manage() {
        animals = new Animal[100];
    }

    public void addAnimals(Animal animal) {
        animals[size] = animal;
        size++;
    }

    public void showAnimals() {
        for (int i = 0; i < size; i++) {
            System.out.println(animals[i].toString());
        }
    }

    public int findAnimal(int id) {
        for (int i = 0; i < size; i++) {
            if (animals[i].getIdAnimal() == id) {
                return i;
            }
        }
        return -1;
    }
    public void deleteAnimal(int id) {
        int index = findAnimal(id);
        for (int i = index; i < size; i++) {
            animals[i] = animals[i + 1];
        }
        animals[size -1] = null;
        size--;
    }
    public void editAnimal(int id, String name, int birth){
        int index = findAnimal(id);
        if(index > -1){
            animals[index].setName(name);
            animals[index].setBirth(birth);
        }
    }
}