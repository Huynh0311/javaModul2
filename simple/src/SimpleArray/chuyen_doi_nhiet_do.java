package SimpleArray;

import java.util.Scanner;

public class chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double F, C;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");

            System.out.println("Nhập số");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("nhập độ F");
                    F = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(F));
                case 2:
                    System.out.println("Nhập độ C");
                    C = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(C));
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
