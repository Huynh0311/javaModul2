package Tu_duy_giai_quyet;

import java.util.Scanner;

public class FindS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập S");
        int S = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    if (i + j + k == S){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
