package view;

import check.CheckInput;
import check.CheckRegex;
import model.entity.Customer;
import model.entity.Oder;
import model.entity.Room;
import model.sevice.CustomerManage;
import model.sevice.OderManage;
import model.sevice.RoomManage;
import view.MenuUser.CurrentUser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenuOder {
    private Scanner input = new Scanner(System.in);
    private CheckInput checkInput = new CheckInput();
    private OderManage oderManage = new OderManage();
    private RoomManage roomManage = new RoomManage();
    private CustomerManage customerManage = new CustomerManage();
    private CheckRegex checkRegex = new CheckRegex();
    private MenuRoom menuRoom = new MenuRoom();
    private Date currentDate = new Date();

    public void showOderMenu() {
        int choice;
        do {
            System.out.println("++++++ MENU ODER ++++++");
            System.out.println("1. Hiển thị danh sách phòng trọ");
            System.out.println("2. Hiển thị danh sách phòng trọ đang còn trống");
            System.out.println("3. Đặt phòng trọ");
            System.out.println("4. Hiển thị Bill");
            System.out.println("5. Xem thông tin cá nhân");
            System.out.println("6. Sửa thông tin cá nhân");
            System.out.println("0. Đăng xuất");
            System.out.println("Nhập lựa chọn");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 6) {
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
                    menuRoom.showAllRoom();
                    break;
                case 2:
                    menuRoom.findByStatusFalse();
                    break;
                case 3:
                    addBillRoom();
                    break;
                case 4:
                    showBill();
                    break;
                case 5:
                    showInfoCustomer();
                    break;
                case 6:
                    showEditCustomer();
                    break;
            }
        } while (choice != 0);
    }

    public void addBillRoom() {
        System.out.println("+++++ Menu đặt phòng trọ +++++");
        int idCustomer;
        while (true) {
            System.out.println("Nhập căn cước công dân");
            idCustomer = checkInput.checkInputInt();
            if (idCustomer != CurrentUser.idCurrentUser) {
                System.out.println("Căn cước không trùng khớp với tài khoản đăng ký. vui lòng nhập lại");
            } else {
                break;
            }
        }
        String idRoom;
        while (true) {
            System.out.println("Nhập mã phòng muốn đặt");
            idRoom = input.nextLine();
            boolean checkStatus = false;
            for (Room room : roomManage.getAll()) {
                if (idRoom.equals(room.getIdRoom()) && !room.isStatus())
                    checkStatus = true;
            }
            if (checkStatus) {
                break;
            } else {
                System.out.println("Thông tin phòng sai hoặc phòng đã được thuê");
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String timeStartOder = dateFormat.format(currentDate);

        Oder oder = new Oder(idCustomer, idRoom, timeStartOder);
        oderManage.oderBill(oder);
        for (Room room : roomManage.getAll()) {
            if (idRoom.equals(room.getIdRoom())) {
                room.setStatus(true);
                roomManage.edit(idRoom, room);
                break;
            }
        }
    }

    public void showBill() {
        for (Oder oder : oderManage.showBill()) {
            if (CurrentUser.idCurrentUser == oder.getIdCustomer()) {
                System.out.println(oder);
            }
        }
    }

    public void showInfoCustomer() {
        for (Customer customer : customerManage.getAll()) {
            if (CurrentUser.idCurrentUser == customer.getIdPerson()) {
                System.out.println(customer);
            }
        }
    }

    public void showEditCustomer() {
        System.out.println("+++++ Menu sửa khách hàng +++++");
        int idPerson = CurrentUser.idCurrentUser;
        System.out.println("Nhập tên khách hàng mới");
        String namePerson = input.nextLine();
        System.out.println("Nhập mật khẩu mới");
        String password = input.nextLine();
        System.out.println("Nhập tuổi khách hàng mới");
        int age = checkInput.checkInputInt();
        System.out.println("Nhập giới tính(0.Nữ | 1.Nam | 2.Khác)");
        String gender = input.nextLine();
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
                gender = input.nextLine();
            }
        }
        System.out.println("Nhập số điện thoại khách hàng mới");
        int phone = checkInput.checkInputInt();
        System.out.println("Nhập địa chỉ khách hàng mới");
        String address = input.nextLine();

        Customer customer = new Customer(idPerson, namePerson, password, age, gender, phone, address);
        customerManage.edit(idPerson, customer);
    }
}
