package view;

import check.CheckInput;
import check.CheckRegex;
import fontColor.SetFontColor;
import model.entity.Customer;
import model.sevice.CustomerManage;

import java.util.Scanner;

public class MenuCustomer {
    private Scanner scanner = new Scanner(System.in);
    private CustomerManage customerManage = new CustomerManage();
    private CheckInput checkInput = new CheckInput();
    private CheckRegex checkRegex = new CheckRegex();

    public void showMenuCustomer() {
        int choice;
        do {
            System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "+++++ Menu Khách Hàng +++++" + SetFontColor.RESET);
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
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "+++++ Menu thêm khách hàng +++++" + SetFontColor.RESET);
        System.out.println("Nhập Căn cước công dân khách hàng");
        String idPerson;
        while (true) {
            idPerson = scanner.nextLine();
            boolean checkIdPerson = checkRegex.validate(idPerson, CheckRegex.Regex_IdPerson);
            if (checkIdPerson) {
                if (customerManage.findIndexById(idPerson) == -1) {
                    break;
                } else {
                    System.out.println(SetFontColor.RED_BOLD + "Số căn cước công dân đã tồn tại." + SetFontColor.RESET);
                    System.out.println("Nhập Căn cước công dân khách hàng");
                }
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Căn cước công dân phải có 12 số" + SetFontColor.RESET);
                System.out.println("Nhập Căn cước công dân khách hàng");
            }
        }
        System.out.println("Nhập tên khách hàng");
        String namePerson;
        while (true) {
            namePerson = scanner.nextLine();
            boolean checkNamePerson = checkRegex.validate(namePerson, CheckRegex.Regex_Name);
            if (checkNamePerson) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Tên không có khoảng trắng ở đầu và không có dấu" + SetFontColor.RESET);
                System.out.println("Nhập tên khách hàng");
            }
        }
        System.out.println("Nhập mật khẩu");
        String password;
        while (true) {
            password = scanner.nextLine();
            boolean checkPassword = checkRegex.validate(password, CheckRegex.Regex_PassWord);
            if (checkPassword) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Mật khẩu chứa ít nhất 8 kí tự, có chữ thường, chữ in hoa, số và kí tự đặc biệt" + SetFontColor.RESET);
                System.out.println("Nhập mật khẩu");
            }
        }
        System.out.println("Nhập tuổi khách hàng");
        int age;
        while (true) {
            age = checkInput.checkInputInt();
            if (age > 17) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Tuổi khách hàng phải từ 18 trở lên" + SetFontColor.RESET);
                System.out.println("Nhập tuổi khách hàng");
            }
        }
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
                System.out.println(SetFontColor.RED_BOLD + "Cần nhập vào số 0, 1 hoặc 2" + SetFontColor.RESET);
                System.out.println("Nhập lại là số( 0.Nữ | 1.Nam | 2.Khác )");
                gender = scanner.nextLine();
            }
        }
        System.out.println("Nhập số điện thoại khách hàng");
        String phone;
        while (true) {
            phone = scanner.nextLine();
            boolean checkPhone = checkRegex.validate(phone, CheckRegex.Regex_Phone);
            if (checkPhone) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Số điện thoại phải có số 0 ở đầu và có 10 số" + SetFontColor.RESET);
                System.out.println("Nhập lại số điện thoại:");
            }
        }
        System.out.println("Nhập địa chỉ khách hàng:");
        String address;
        while (true) {
            address = scanner.nextLine();
            boolean checkAddress = checkRegex.validate(address, CheckRegex.Regex_Address);
            if (checkAddress) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Địa chỉ tối thiểu 3 kí tự." + SetFontColor.RESET);
                System.out.println("Nhập lại địa chỉ:");
            }
        }

        Customer customer = new Customer(idPerson, namePerson, password, age, gender, phone, address);
        customerManage.add(customer);
        System.out.println("Thêm thành công");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println();
    }

    public void showEditCustomer() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "+++++ Menu sửa khách hàng +++++" + SetFontColor.RESET);
        System.out.println("Nhập Căn cước công dân khách hàng:");
        String idPerson;
        while (true) {
            idPerson = scanner.nextLine();
            boolean checkIdPerson = checkRegex.validate(idPerson, CheckRegex.Regex_IdPerson);
            if (checkIdPerson) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Căn cước công dân phải có 12 số." + SetFontColor.RESET);
                System.out.println("Nhập Căn cước công dân khách hàng:");
            }
        }
        System.out.println("Nhập tên khách hàng mới:");
        String namePerson;
        while (true) {
            namePerson = scanner.nextLine();
            boolean checkNamePerson = checkRegex.validate(namePerson, CheckRegex.Regex_Name);
            if (checkNamePerson) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Tên không có khoảng trắng ở đầu và không có dấu." + SetFontColor.RESET);
                System.out.println("Nhập tên khách hàng mới:");
            }
        }
        System.out.println("Nhập mật khẩu mới:");
        String password;
        while (true) {
            password = scanner.nextLine();
            boolean checkPassword = checkRegex.validate(password, CheckRegex.Regex_PassWord);
            if (checkPassword) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Mật khẩu chứa ít nhất 8 kí tự, có chữ thường, chữ in hoa, số và kí tự đặc biệt" + SetFontColor.RESET);
                System.out.println("Nhập mật khẩu mới");
            }
        }
        System.out.println("Nhập tuổi khách hàng mới");
        int age;
        while (true) {
            age = checkInput.checkInputInt();
            if (age > 17) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Tuổi khách hàng phải từ 18 trở lên" + SetFontColor.RESET);
                System.out.println("Nhập tuổi khách hàng");
            }
        }
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
                System.out.println(SetFontColor.RED_BOLD + "Cần nhập vào số 0, 1 hoặc 2" + SetFontColor.RESET);
                System.out.println("Nhập lại là số( 0.Nữ | 1.Nam | 2.Khác )");
                gender = scanner.nextLine();
            }
        }
        System.out.println("Nhập số điện thoại khách hàng mới");
        String phone;
        while (true) {
            phone = scanner.nextLine();
            boolean checkPhone = checkRegex.validate(phone, CheckRegex.Regex_Phone);
            if (checkPhone) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Số điện thoại phải có số 0 ở đầu và có 10 số" + SetFontColor.RESET);
                System.out.println("Nhập lại số điện thoại");
            }
        }
        System.out.println("Nhập địa chỉ khách hàng mới");
        String address;
        while (true) {
            address = scanner.nextLine();
            boolean checkAddress = checkRegex.validate(address, CheckRegex.Regex_Address);
            if (checkAddress) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Địa chỉ tối thiểu 3 kí tự, và không có dấu" + SetFontColor.RESET);
                System.out.println("Nhập lại địa chỉ");
            }
        }

        Customer customer = new Customer(idPerson, namePerson, password, age, gender, phone, address);
        customerManage.edit(idPerson, customer);
        System.out.println("Sửa thành công");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println();
    }

    public void deleteCustomer() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "+++++ Menu xóa khách hàng +++++" + SetFontColor.RESET);
        System.out.println("Nhập Căn cước công dân khách hàng muốn xóa");
        String idPerson = scanner.nextLine();
        if (customerManage.findIndexById(idPerson) == -1) {
            System.out.println(SetFontColor.RED_BOLD + "Không tìm thấy căn cước công dân vừa nhập" + SetFontColor.RESET);
        } else {
            customerManage.delete(idPerson);
            System.out.println("Xóa khách hàng thành công");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println();
        }
    }

    public void showAllCustomer() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "++++++ Danh sách khách hàng ++++++" + SetFontColor.RESET);
        if (customerManage.getAll().size() == 0) {
            System.out.println(SetFontColor.RED_BOLD + "Hiện chưa có khách hàng nào" + SetFontColor.RESET);
            System.out.println("------------------------");
        } else {
            System.out.println();
            for (Customer customer : customerManage.getAll()) {
                System.out.println(customer);
                System.out.println();
            }
            System.out.println("------------------------");
        }
    }
}
