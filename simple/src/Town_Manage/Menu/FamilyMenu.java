package Town_Manage.Menu;

import Town_Manage.Manage.Family;
import Town_Manage.Manage.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamilyMenu {
    private Scanner input = new Scanner(System.in);

    public void showMenuPerson(Family family) {
        int choice;
        do {
            System.out.println("====Menu nhà số " + family.getIdFamily() + "====");
            System.out.println("1. Thêm thành viên:");
            System.out.println("2. Sửa thành viên");
            System.out.println("3. Xóa thành viên");
            System.out.println("4. Hiển thị thành viên");
            System.out.println("0. Quay lại chọn nhà");
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
                    MenuAddPerson(family);
                    break;
                case 2:
                    MenuEditPerson(family);
                    break;
                case 3:
                    MenuDeletePerson(family);
                    break;
                case 4:
                    showAllPerson(family);
                    break;
            }
        } while (choice != 0);
    }

    public void MenuAddPerson(Family family) {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên thành viên: ");
        String name = input.nextLine();
        System.out.println("Nhập tuổi thành viên: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập nghề nghiệp thành viên: ");
        String job = input.nextLine();
        Person person = new Person(id, name, age, job);
        family.add(person);
    }

    public void MenuEditPerson(Family family) {
        System.out.println("Nhập id thành viên muốn sửa");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên mới của thành viên: ");
        String name = input.nextLine();
        System.out.println("Nhập tuổi mới của thành viên: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập nghề nghiệp mới của thành viên: ");
        String job = input.nextLine();
        Person person = new Person(id, name, age, job);
        family.edit(id, person);
    }

    public void MenuDeletePerson(Family family) {
        System.out.println("Nhập id thành viên muốn xóa");
        int id = Integer.parseInt(input.nextLine());
        family.delete(id);
    }

    public void showAllPerson(Family family) {
        for (int i = 0; i < family.getAll().size(); i++) {
            System.out.println(family.getAll().get(i));
        }
    }
}
