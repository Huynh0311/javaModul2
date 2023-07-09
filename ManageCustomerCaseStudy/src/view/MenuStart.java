package view;

import check.CheckRegex;
import fontColor.SetFontColor;
import model.entity.Customer;
import model.sevice.CustomerManage;
import view.MenuUser.CurrentUser;
import view.menuAdmin.MenuAdmin;

import java.util.Scanner;

public class MenuStart {

    private CustomerManage customerManage = new CustomerManage();
    private MenuCustomer menuCustomer = new MenuCustomer();
    private MenuAdmin menuAdmin = new MenuAdmin();
    private MenuOder menuOder = new MenuOder();
    private Scanner input = new Scanner(System.in);
    private CheckRegex checkRegex = new CheckRegex();

    public void showMenuLoginRegister() {
        int choice;
        do {
            System.out.println(SetFontColor.BLACK + SetFontColor.CYAN_BACKGROUND + "----- Trang chủ thuê phòng trọ -----" + SetFontColor.RESET);
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
                        System.out.println(SetFontColor.RED_BOLD + "Bạn cần nhập đúng số trong menu" + SetFontColor.RESET);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(SetFontColor.RED_BOLD + "Vui lòng nhập đúng số trong menu" + SetFontColor.RESET);
                }
            }
            switch (choice) {
                case 1:
                    showMenuRegister();
                    break;
                case 2:
                    showLoginUser();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuRegister() {
        menuCustomer.showAddCustomer();
    }

    public void showLoginUser() {
        System.out.println(SetFontColor.BLACK + SetFontColor.CYAN_BACKGROUND + "++++++ Menu đăng nhập ++++++" + SetFontColor.RESET);
        System.out.println("Nhập tài khoản ( số căn cước công dân )");
        String idUser = input.nextLine();
        System.out.println("Nhập mật khẩu");
        String passwordUser = input.nextLine();
        for (Customer customer : customerManage.getAll()) {
            if (idUser.equals(customer.getIdPerson()) && passwordUser.equals(customer.getPassword())) {
                CurrentUser.idCurrentUser = idUser;
                menuOder.showOderMenu();
                break;
            } else if (idUser.equals("Admin") && passwordUser.equals("123456")) {
                menuAdmin.showMenuAdmin();
                break;
            }
        }
        System.out.println("Tài khoản hoặc mật khẩu không chính xác. Vui lòng nhập lại");
    }
}
