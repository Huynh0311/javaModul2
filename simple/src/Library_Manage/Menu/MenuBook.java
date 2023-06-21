package Library_Manage.Menu;

import Library_Manage.Manage.BookManage;
import Library_Manage.Model.Book;

import java.util.Scanner;

public class MenuBook {
    private BookManage bookManage = new BookManage();
    Scanner scanner = new Scanner(System.in);
    public void addBook() {
        System.out.println("Nhập mã tài liệu");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản");
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả:");
        String author = scanner.nextLine();
        System.out.println("Nhập số trang:");
        int pageNumbers = Integer.parseInt(scanner.nextLine());

        Book book = new Book(id, namePublisher, numberOfRelease, author, pageNumbers);
        bookManage.add(book);
    }

    public void deleteBook() {
        System.out.println("Nhập mã tài liệu để xóa");
        int id = Integer.parseInt(scanner.nextLine());
        bookManage.delete(id);
    }

    public void editBook() {
        System.out.println("Nhập mã tài liệu muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà xuất bản");
        String namePublisher = scanner.nextLine();
        System.out.println("Nhập số bản phát hành");
        int numberOfRelease = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả:");
        String author = scanner.nextLine();
        System.out.println("Nhập số trang:");
        int pageNumbers = Integer.parseInt(scanner.nextLine());

        Book bookNew = new Book(id, namePublisher, numberOfRelease, author, pageNumbers);
        bookManage.edit(id, bookNew);
    }

    public void showAllBook() {
        for (int i = 0; i < bookManage.findAll().size(); i++) {
            System.out.println(bookManage.findAll().get(i).toString());
        }
    }

    public void findBookById() {
        System.out.println("Nhập mã tài liệu muốn tìm kiếm:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = bookManage.findIndexById(id);
        if (index != -1) {
            System.out.println(bookManage.findAll().get(index).toString());
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
