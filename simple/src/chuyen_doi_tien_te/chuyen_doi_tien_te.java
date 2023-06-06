package chuyen_doi_tien_te;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Nhập số tiền muốn chuyển đổi");
        usd = scanner.nextDouble();
        vnd = usd * 23480;
        System.out.println(usd + " USD bằng " + vnd + " VND");
    }
}
