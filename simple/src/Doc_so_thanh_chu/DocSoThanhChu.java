package Doc_so_thanh_chu;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int num, hundreds, tens, ones;
        num = scanner.nextInt();
        String hundreds_string, tens_string, ones_string;

        hundreds = num / 100;
        tens = (num / 10) % 10;
        ones = num % 10;
        if(hundreds != 0) {
            hundreds_string = layChuoi(hundreds) + "trăm";
        } else {
            hundreds_string = "";
        }
        tens_string = "";
        if (hundreds == 0 && tens == 0) {
            tens_string = "";
        } else if (tens == 1) {
            tens_string = "Mười";
        } else if(tens == 0){
            tens_string = "Linh";
        }
        if(ones == 0){
            ones_string = "Mươi";
        }else {
            ones_string =layChuoi(ones);
        }
        System.out.println(hundreds_string + tens_string + ones_string);

    }

    public static String layChuoi(int so) {
        String chuoi = "";
        switch (so) {
            case 1:
                chuoi = "Một ";
                break;
            case 2:
                chuoi = "Hai ";
                break;
            case 3:
                chuoi = "Ba ";
                break;
            case 4:
                chuoi = "Bốn ";
                break;
            case 5:
                chuoi = "Năm ";
                break;
            case 6:
                chuoi = "Sáu ";
                break;
            case 7:
                chuoi = "Bảy ";
                break;
            case 8:
                chuoi = "Tám ";
                break;
            case 9:
                chuoi = "Chín ";
                break;

        }
        return chuoi;
    }
}
