package Town_Manage.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);
    TownMenu townMenu = new TownMenu();
    int choice;

    public void showMenuTown() {
        do {
            System.out.println("===== Khu phố ======");
            System.out.println("1. Thêm nhà");
            System.out.println("2. Sửa nhà theo Id");
            System.out.println("3. Xóa nhà");
            System.out.println("4. Danh sách các Nhà");
            System.out.println("Nhập lựa chọn: ");
            try {
                choice = inputNumber.nextInt();
            } catch (InputMismatchException e) {
                inputNumber.nextLine();
                System.out.println("Vui lòng nhập số");
                choice = inputNumber.nextInt();
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
        } while (choice != 0);

    }
}
