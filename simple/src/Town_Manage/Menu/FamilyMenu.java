package Town_Manage.Menu;

import Town_Manage.Manage.Family;
import Town_Manage.Manage.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamilyMenu {
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMenuPerson(Family family) {
        int choice = -1;
        do {
            System.out.println("====Menu nhà số " + family.getIdFamily() + "====");
            System.out.println("1. Thêm thành viên:");
            System.out.println("2. Sửa thành viên");
            System.out.println("3. Xóa thành viên");
            System.out.println("4. Hiển thị thành viên");
            System.out.println("0. Quay lại chọn nhà");
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
        int id = inputNumber.nextInt();
        System.out.println("Nhập tên thành viên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi thành viên: ");
        int age = inputNumber.nextInt();
        System.out.println("Nhập nghề nghiệp thành viên: ");
        String job = inputString.nextLine();
        Person person = new Person(id, name, age, job);
        family.add(person);
    }

    public void MenuEditPerson(Family family) {
        System.out.println("Nhập id thành viên muốn sửa");
        int id = inputNumber.nextInt();
        System.out.println("Nhập tên mới của thành viên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi mới của thành viên: ");
        int age = inputNumber.nextInt();
        System.out.println("Nhập nghề nghiệp mới của thành viên: ");
        String job = inputString.nextLine();
        Person person = new Person(id, name, age, job);
        family.edit(id, person);
    }

    public void MenuDeletePerson(Family family) {
        System.out.println("Nhập id thành viên muốn xóa");
        int id = inputNumber.nextInt();
        family.delete(id);
    }

    public void showAllPerson(Family family) {
        for (int i = 0; i < family.getAll().size(); i++) {
            System.out.println(family.getAll().get(i));
        }
    }
}
