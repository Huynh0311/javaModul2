package Town_Manage.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    TownMenu townMenu = new TownMenu();

    public void showMenuTown() {
        int choice;
        do {
            System.out.println("===== Khu phố ======");
            System.out.println("1. Thêm nhà");
            System.out.println("2. Sửa nhà theo Id");
            System.out.println("3. Xóa nhà");
            System.out.println("4. Danh sách các Nhà");
            System.out.println("Nhập lựa chọn: ");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 4) {
                        break;
                    } else {
                        System.out.println("Bạn cần nhập đúng số trong menu");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số dúng theo danh sách");
                }
            }
            switch (choice) {
                case 1:
                    townMenu.showAddFamily();
                    break;
                case 2:
                    townMenu.editFamily();
                    break;
                case 3:
                    townMenu.deleteFamily();
                    break;
                case 4:
                    townMenu.showMenuFamily();
                    break;
            }
        }while (choice != 0);
    }
}
