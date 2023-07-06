package view;

import model.entity.Customer;
import model.entity.Oder;
import model.sevice.CustomerManage;
import model.sevice.OderManage;
import view.MenuUser.MenuLoginLogout;

import java.util.Scanner;

public class MenuOder {
    private OderManage oderManage = new OderManage();
    private Scanner input = new Scanner(System.in);
    private CustomerManage customerManage = new CustomerManage();

    private CurrentUser currentUser = new CurrentUser();
    public void showOderMenu() {
        int choice;
        do {
            System.out.println("++++++ MENU ODER ++++++");
            System.out.println("1. Đặt phòng trọ");
            System.out.println("2. Thanh toán");
            System.out.println("3. Hiển thị Bill");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 3) {
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice != 0);
    }

    public void addBillRoom() {
        System.out.println("+++++ Menu đặt phòng trọ +++++");
//        currentUser.;
        String idRoom;
        String idOder;
        boolean status;
        String timeStartOder;
        String timeOder;

    }
}
