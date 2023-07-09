package check;

import fontColor.SetFontColor;

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
                System.out.println(SetFontColor.RED_BOLD +"Nhập vào là số" + SetFontColor.RESET);
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
                System.out.println(SetFontColor.RED_BOLD + "Nhập vào là số" + SetFontColor.RESET);
            }
        }
        return inputDouble;
    }
}