package Library_Manage.Menu;

import Library_Manage.Manage.BookManage;
import Library_Manage.Manage.MagazineManage;
import Library_Manage.Model.Book;
import Library_Manage.Model.Magazine;

import java.util.Scanner;

public class Menu {
    private MenuBook menuBook = new MenuBook();
    private MenuMagazine menuMagazine = new MenuMagazine();
    Scanner scanner = new Scanner(System.in);

    public void showAllMenu() {
        int choice;
        do {
            System.out.println("====Quản lí thư viện====\n" +
                    "1.Quản lí sách\n" +
                    "2.Quản lí báo\n" +
                    "3.Quản lí tạp chí\n" +
                    "0.Thoát khỏi chương trình");
            System.out.println("Nhập lựa chọn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showMenuBook();
                    break;
                case 2:
                    showMenuMagazine();
                    break;
            }
        } while (choice != 0);

    }

    public void showMenuBook() {
        int choice;
        do {
            System.out.println("====Quản lí Sách====\n" +
                    "1.Thêm mới Sách\n" +
                    "2.Xóa sách\n" +
                    "3.Sửa sách\n" +
                    "4.Hiển thị sách\n" +
                    "5.Tìm kiếm sách\n" +
                    "0.Trở lại quản lý thư viện");
            System.out.println("Nhập số");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuBook.addBook();
                    break;
                case 2:
                    menuBook.deleteBook();
                    break;
                case 3:
                    menuBook.editBook();
                    break;
                case 4:
                    menuBook.showAllBook();
                    break;
                case 5:
                    menuBook.findBookById();
                    break;
            }
        } while (choice != 0);
    }
    public void showMenuMagazine() {
        int choice;
        do {
            System.out.println("====Quản lí Tạp chí====\n" +
                    "1.Thêm mới báo\n" +
                    "2.Xóa báo\n" +
                    "3.Sửa báo\n" +
                    "4.Hiển thị báo\n" +
                    "5.Tìm kiếm báo\n" +
                    "0.Trở lại quản lý thư viện");
            System.out.println("Nhập số");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuMagazine.addMagazine();
                    break;
                case 2:
                    menuMagazine.deleteMagazine();
                    break;
                case 3:
                    menuMagazine.editMagazine();
                    break;
                case 4:
                    menuMagazine.showAllMagazine();
                    break;
                case 5:
                    menuMagazine.findMagazineById();
                    break;
            }
        } while (choice != 0);
    }
}
