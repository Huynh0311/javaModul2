package chi_so_can_nang;

import java.util.Scanner;

public class chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.printf("Chỉ số bmi của bạn là: "+ bmi +". Bạn đang thiếu cân");
        } else if (bmi < 25.0) {
            System.out.printf("Chỉ số bmi của bạn là: "+ bmi +". Bạn đang bình thường");
        } else if (bmi < 30.0) {
            System.out.printf("Chỉ số bmi của bạn là: "+ bmi +". Bạn đang bị thừa cân");
        }else{
             System.out.printf("Chỉ số bmi của bạn là: " + bmi + ". Bạn đang bị béo phì");
         }
    }
}
