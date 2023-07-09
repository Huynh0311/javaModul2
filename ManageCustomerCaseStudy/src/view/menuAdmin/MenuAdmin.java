package view.menuAdmin;

import fontColor.SetFontColor;
import view.MenuCustomer;
import view.MenuOder;
import view.MenuRoom;

import java.util.Scanner;

public class MenuAdmin {
    private Scanner input = new Scanner(System.in);
    private MenuRoom menuRoom = new MenuRoom();
    private MenuCustomer menuCustomer = new MenuCustomer();
    private MenuOder menuOder = new MenuOder();

    public void showMenuAdmin() {
        int choice;
        do {
            System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Menu Quản lý *****" + SetFontColor.RESET);
            System.out.println("1. Quản lý Trọ");
            System.out.println("2. Quản lý Khách hàng");
            System.out.println("3. Quản lý Oder");
            System.out.println("0. Đăng xuất");
            System.out.println("Nhập lựa chọn: ");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 2) {
                        break;
                    } else {
                        System.out.println(SetFontColor.RED_BOLD + "Bạn cần nhập đúng số trong menu" + SetFontColor.RESET);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(SetFontColor.RED_BOLD + "Vui lòng nhập đúng số trong menu" + SetFontColor.RESET);
                }
            }
            switch (choice) {
                case 1:
                    menuRoom.showMenuRoom();
                    break;
                case 2:
                    menuCustomer.showMenuCustomer();
                    break;
                case 3:
                    menuOder.showOderMenu();
                    break;
            }
        } while (choice != 0);
    }
}

