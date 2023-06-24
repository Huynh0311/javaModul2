package Town_Manage.Menu;

import Town_Manage.Manage.Family;
import Town_Manage.Manage.Town;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TownMenu {
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);
    Town town = new Town();
    FamilyMenu familyMenu = new FamilyMenu();
    public void showAddFamily() {
        System.out.println("==== Menu thêm mới nhà =====");
        System.out.println("Nhập ID");
        int id = inputNumber.nextInt();
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
        try {
            choice = inputNumber.nextInt();
        } catch (InputMismatchException e) {
            inputNumber.nextLine();
            System.out.println("Vui lòng nhập số");
            choice = inputNumber.nextInt();
        }
        if (choice != 0) {
            familyMenu.showMenuPerson(town.getAll().get(choice - 1));
        }
    }

    public void editFamily() {
        System.out.println("==== Menu chỉnh sửa nhà =====");
        System.out.println("Nhập ID nhà muốn sửa");
        int id = inputNumber.nextInt();
        System.out.println("Nhập ID mới");
        int idNew = inputNumber.nextInt();
        Family family = new Family(idNew);
        town.edit(id, family);
    }

    public void deleteFamily() {
        System.out.println("==== Menu xóa nhà =====");
        System.out.println("Nhập ID nhà muốn xóa");
        int id = inputNumber.nextInt();
        town.delete(id);
    }
}
