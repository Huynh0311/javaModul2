package view.menuAdmin;

import view.MenuCustomer;
import view.MenuRoom;

import java.util.Scanner;

public class MenuAdmin {
    private Scanner input = new Scanner(System.in);
    private MenuRoom menuRoom = new MenuRoom();
    private MenuCustomer menuCustomer = new MenuCustomer();

    public void showMenuAdmin() {
        int choice;
        do {
            System.out.println("***** Menu Quản lý *****");
            System.out.println("1. Quản lý Trọ");
            System.out.println("2. Quản lý Khách hàng");
            System.out.println("0. Đăng xuất");
            System.out.println("Nhập lựa chọn: ");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 2) {
                        break;
                    } else {
                        System.out.println("Bạn cần nhập đúng số trong menu");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập đúng số trong menu");
                }
            }
            switch (choice) {
                case 1:
                    menuRoom.showMenuRoom();
                    break;
                case 2:
                    menuCustomer.showMenuCustomer();
                    break;
            }
        } while (choice != 0);
    }
}

