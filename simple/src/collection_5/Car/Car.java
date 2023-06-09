package collection_5.Car;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars ++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.getNumberOfCars());
        System.out.println("Xe: " + car1.getName());
        System.out.println("Động cơ: " + car1.getEngine());

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.getNumberOfCars());
        System.out.println("Xe: " + car2.getName());
        System.out.println("Động cơ: " + car2.getEngine());
    }
}
