package Library_Manage.Menu;

import Library_Manage.Manage.BookManage;
import Library_Manage.Manage.MagazineManage;
import Library_Manage.Manage.NewspaperManage;
import Library_Manage.Model.Book;
import Library_Manage.Model.Magazine;
import Library_Manage.Model.Newspaper;

import java.util.Scanner;

public class MenuNewspaper {
    private NewspaperManage newspaperManage = new NewspaperManage();
    Scanner scanner = new Scanner(System.in);
    public void addNewspaper() {
        System.out.println("Nhập mã tài liệu");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản");
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày phát hành:");
        int dayRelease = Integer.parseInt(scanner.nextLine());

        Newspaper newspaper = new Newspaper(id, namePublisher, numberOfRelease, dayRelease);
        newspaperManage.add(newspaper);
    }

    public void deleteNewspaper() {
        System.out.println("Nhập mã tài liệu để xóa");
        int id = Integer.parseInt(scanner.nextLine());
        newspaperManage.delete(id);
    }

    public void editNewspaper() {
        System.out.println("Nhập mã tài liệu muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản");
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày phát hành:");
        int dayRelease = Integer.parseInt(scanner.nextLine());

        Newspaper newspaper = new Newspaper(id, namePublisher, numberOfRelease, dayRelease);
        newspaperManage.edit(id, newspaper);
    }

    public void showAllNewspaper() {
        for (int i = 0; i < newspaperManage.findAll().size(); i++) {
            System.out.println(newspaperManage.findAll().get(i).toString());
        }
    }

    public void findNewspaperById() {
        System.out.println("Nhập mã tài liệu muốn tìm kiếm:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = newspaperManage.findIndexById(id);
        if (index != -1) {
            System.out.println(newspaperManage.findAll().get(index).toString());
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
