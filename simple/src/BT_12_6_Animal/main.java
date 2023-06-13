package BT_12_6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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


    }
}
