package view.MenuUser;

import model.entity.Customer;
import model.sevice.CustomerManage;
import view.CurrentUser;
import view.MenuCustomer;
import view.MenuOder;

import java.util.Scanner;

public class MenuLoginLogout {
    private CustomerManage customerManage = new CustomerManage();
    private MenuCustomer menuCustomer = new MenuCustomer();
    private MenuOder menuOder = new MenuOder();
    private Scanner input = new Scanner(System.in);

    public void showMenuLoginRegister() {
        int choice;
        do {
            System.out.println("----- Trang chủ thuê phòng trọ -----");
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng Nhập");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 2) {
                        break;
                    } else {
                        System.out.println("Bạn cần nhập đúng số trong menu");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập đúng số trong menu");
                }
            }
            switch (choice) {
                case 1:
                    showMenuRegister();
                    break;
                case 2:
                    showLogin();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuRegister() {
        menuCustomer.showAddCustomer();
    }

    public void showLogin() {
        while (true) {
            System.out.println("Nhập số căn cước công dân");
            int idUser = Integer.parseInt(input.nextLine());
            System.out.println("Nhập mật khẩu");
            String passwordUser = input.nextLine();
            boolean check = false;
            for (Customer customer : customerManage.getAll()) {
                if (idUser == customer.getIdPerson() && passwordUser.equals(customer.getPassword())) {
                    CurrentUser.idCurrentUser = idUser;
                    check = true;
                } else {
                    System.out.println("Tài khoản hoặc mật khẩu không chính xác. Vui lòng nhập lại");
                }
            }
            if (check) {
                break;
            }
        }
        menuOder.showOderMenu();
    }
}
