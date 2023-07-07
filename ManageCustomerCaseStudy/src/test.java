import check.CheckRegex;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        CheckRegex checkRegex = new CheckRegex();
        Scanner input = new Scanner(System.in);
        String timeStartOder;
        String str = "Nhập ngày đặt phòng vd: 01/01/2000";
        String regex = "^(0?[1-9]|1[0-2])/(0?[1-9]|1\\d|2\\d|3[01])/(19|20)\\d{2}$";
        timeStartOder = checkRegex.checkRegex(str, regex);
        System.out.println(timeStartOder);
    }
}
