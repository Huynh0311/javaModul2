package check;

import java.util.Scanner;

public class CheckInput {
    private Scanner scanner = new Scanner(System.in);

    public int checkInputInt() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập vào là số");
            }
        }
        return input;
    }
    public double checkInputDouble(){
        double inputDouble;
        while (true){
            try {
                inputDouble = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập vào là số");
            }
        }
        return inputDouble;
    }
}