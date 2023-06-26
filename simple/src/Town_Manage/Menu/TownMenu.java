package Town_Manage.Menu;

import Town_Manage.Manage.Family;
import Town_Manage.Manage.Town;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TownMenu {
    private Scanner input = new Scanner(System.in);
    Town town = new Town();
    FamilyMenu familyMenu = new FamilyMenu();
    public void showAddFamily() {
        System.out.println("==== Menu thêm mới nhà =====");
        System.out.println("Nhập ID");
        int id = Integer.parseInt(input.nextLine());
        Family family = new Family(id);
        town.add(family);
    }

    public void showMenuFamily() {
        int choice = -1;
        String str = "===== Menu các hộ gia đình =====\n";
        for (int i = 0; i < town.getAll().size(); i++) {
            str += (i + 1) + ". Hộ gia đình " + town.getAll().get(i).getIdFamily() + "\n";
        }
        str += "0. Trở lại Menu khu phố";
        System.out.println(str);
        System.out.println("Nhập lựa chọn: ");
        while (true) {
            try {
                choice = Integer.parseInt(input.nextLine());
                if (choice >= 0 && choice <= town.getAll().size()) {
                    break;
                } else {
                    System.out.println("Bạn cần nhập đúng số trong menu");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số dúng theo danh sách");
            }
        }
        if (choice != 0) {
            familyMenu.showMenuPerson(town.getAll().get(choice - 1));
        }
    }

    public void editFamily() {
        System.out.println("==== Menu chỉnh sửa nhà =====");
        System.out.println("Nhập ID nhà muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập ID mới");
        int idNew = Integer.parseInt(input.nextLine());
        Family family = new Family(idNew);
        town.edit(id, family);
    }

    public void deleteFamily() {
        System.out.println("==== Menu xóa nhà =====");
        System.out.println("Nhập ID nhà muốn xóa");
        int id = Integer.parseInt(input.nextLine());
        town.delete(id);
    }
}
