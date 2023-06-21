package Library_Manage.Menu;

import Library_Manage.Manage.MagazineManage;
import Library_Manage.Model.Magazine;

import java.util.Scanner;

public class MenuMagazine {
    private MagazineManage magazineManage = new MagazineManage();
    Scanner scanner = new Scanner(System.in);
    public void addMagazine() {
        System.out.println("Nhập mã tài liệu");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản");
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Số phát hành:");
        int numberRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Số tháng phát hành:");
        int monthRelease = Integer.parseInt(scanner.nextLine());

        Magazine magazine = new Magazine(id, namePublisher, numberOfRelease, numberRelease, monthRelease);
        magazineManage.add(magazine);
    }

    public void deleteMagazine() {
        System.out.println("Nhập mã tài liệu để xóa");
        int id = Integer.parseInt(scanner.nextLine());
        magazineManage.delete(id);
    }

    public void editMagazine() {
        System.out.println("Nhập mã tài liệu muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Số phát hành:");
        int numberRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Số tháng phát hành:");
        int monthRelease = Integer.parseInt(scanner.nextLine());

        Magazine magazine = new Magazine(id, namePublisher, numberOfRelease, numberRelease, monthRelease);
        magazineManage.edit(id, magazine);
    }

    public void showAllMagazine() {
        for (int i = 0; i < magazineManage.findAll().size(); i++) {
            System.out.println(magazineManage.findAll().get(i).toString());
        }
    }

    public void findMagazineById() {
        System.out.println("Nhập mã tài liệu muốn tìm kiếm:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = magazineManage.findIndexById(id);
        if (index != -1) {
            System.out.println(magazineManage.findAll().get(index).toString());
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
