package check;

import java.util.Scanner;

public class CheckRegex {
    private Scanner Input = new Scanner(System.in);
    public String checkRegex(String str, String regex) {
        String input;
        boolean check = false;
        do {
            System.out.println(str);
            input = Input.nextLine();
            check = input.matches(regex);
        } while (!check);
        return input;
    }
}
