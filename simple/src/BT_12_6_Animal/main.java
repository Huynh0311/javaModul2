package BT_12_6_Animal;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog(1, "Chó", 2000, "Blue", "ngu");
        Cat cat = new Cat(2, "meo", 2001, "blue", false, "bietBay");
        System.out.println(dog.toString());
        dog.makeSound();
        cat.makeSound();

        System.out.println(Animal.isCheckCat(cat));
        System.out.println(Animal.isCheckCat(dog));
        System.out.println(Animal.getCountId());

        if(cat.isStatus()){
            System.out.println(cat.healing("Thuốc bổ"));
        }else {
            System.out.println(cat.healing("thuốc bắc ", 2));
        }
        Manage manage = new Manage();
        Dog dog1 = new Dog(0, "Chó", 2000, "red", "ngu");
        Cat cat1 = new Cat(1, "meo", 2001, "blue", false, "anh long ngan");
        manage.addAnimals(dog1);
        manage.addAnimals(cat1);
        manage.showAnimals();
        manage.deleteAnimal(1);
        manage.showAnimals();
        manage.editAnimal(0, "cú", 2005);
        manage.showAnimals();
    }
}
