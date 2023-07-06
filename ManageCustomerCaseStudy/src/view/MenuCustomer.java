package view;

import model.entity.Customer;
import model.sevice.CustomerManage;

import java.util.Currency;
import java.util.Scanner;

public class MenuCustomer {
    private Scanner scanner = new Scanner(System.in);
    private CustomerManage customerManage = new CustomerManage();

    public int checkInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input Phai La Dang So");
            }
        }
        return input;
    }

    public void showMenuCustomer() {
        int choice;
        do {
            System.out.println("+++++ Menu Khách Hàng +++++");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Sửa khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Hiển thị khách hàng");
            System.out.println("0. Thoát chương trình");
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 0 && choice <= 4) {
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
                    showAddCustomer();
                    break;
                case 2:
                    showEditCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    showAllCustomer();
                    break;
            }
        } while (choice != 0);
    }

    public void showAddCustomer() {
        System.out.println("+++++ Menu thêm khách hàng +++++");
        System.out.println("Nhập Căn cước công dân khách hàng");
        int idPerson = checkInput();
        System.out.println("Nhập tên khách hàng");
        String namePerson = scanner.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = scanner.nextLine();
        System.out.println("Nhập tuổi khách hàng");
        int age = checkInput();
        System.out.println("Nhập giới tính(0.Nữ | 1.Nam | 2.Khác)");
        String gender = scanner.nextLine();
        while (true) {
            if (gender.equals("0")) {
                gender = "Nữ";
                break;
            } else if (gender.equals("1")) {
                gender = "Nam";
                break;
            } else if (gender.equals("2")) {
                gender = "Khác";
                break;
            } else {
                System.out.println("Cần nhập vào số 0, 1 hoặc 2");
                System.out.println("Nhập lại là số( 0.Nữ | 1.Nam | 2.Khác )");
                gender = scanner.nextLine();
            }
        }
        System.out.println("Nhập số điện thoại khách hàng");
        int phone = checkInput();
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();

        Customer customer = new Customer(idPerson, namePerson, password, age, gender, phone, address);
        customerManage.add(customer);
    }

    public void showEditCustomer() {
        System.out.println("+++++ Menu sửa khách hàng +++++");
        System.out.println("Nhập Căn cước công dân khách hàng");
        int idPerson = checkInput();
        System.out.println("Nhập tên khách hàng mới");
        String namePerson = scanner.nextLine();
        System.out.println("Nhập mật khẩu mới");
        String password = scanner.nextLine();
        System.out.println("Nhập tuổi khách hàng mới");
        int age = checkInput();
        System.out.println("Nhập giới tính(0.Nữ | 1.Nam | 2.Khác)");
        String gender = scanner.nextLine();
        while (true) {
            if (gender.equals("0")) {
                gender = "Nữ";
                break;
            } else if (gender.equals("1")) {
                gender = "Nam";
                break;
            } else if (gender.equals("2")) {
                gender = "Khác";
                break;
            } else {
                System.out.println("Cần nhập vào số 0, 1 hoặc 2");
                System.out.println("Nhập lại là số( 0.Nữ | 1.Nam | 2.Khác )");
                gender = scanner.nextLine();
            }
        }
        System.out.println("Nhập số điện thoại khách hàng mới");
        int phone = checkInput();
        System.out.println("Nhập địa chỉ khách hàng mới");
        String address = scanner.nextLine();

        Customer customer = new Customer(idPerson, namePerson, password, age, gender, phone, address);
        customerManage.edit(idPerson, customer);
    }

    public void deleteCustomer() {
        System.out.println("+++++ Menu xóa khách hàng +++++");
        System.out.println("Nhập Căn cước công dân khách hàng muốn xóa");
        int idPerson = checkInput();
        if (customerManage.findIndexById(idPerson) == -1) {
            System.out.println("Không tìm thấy mã phòng");
        } else {
            customerManage.delete(idPerson);
            System.out.println("Xóa khách hàng thành công");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println();
        }
    }

    public void showAllCustomer() {
        for (Customer customer : customerManage.getAll()) {
            System.out.println(customer);
        }
    }
}
