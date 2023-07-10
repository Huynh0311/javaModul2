package view;

import check.CheckInput;
import check.CheckRegex;
import fontColor.SetFontColor;
import model.entity.Room;
import model.sevice.RoomManage;

import java.util.Scanner;

public class MenuRoom {
    private Scanner input = new Scanner(System.in);
    private RoomManage roomManage = new RoomManage();
    private CheckInput checkInput = new CheckInput();
    private CheckRegex checkRegex = new CheckRegex();

    public void showMenuRoom() {
        int choice;
        do {
            System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Menu Phòng Trọ *****" + SetFontColor.RESET);
            System.out.println("1. Thêm phòng");
            System.out.println("2. Sửa phòng");
            System.out.println("3. Xóa phòng");
            System.out.println("4. Hiển thị danh sách phòng");
            System.out.println("5. Hiển thị phòng đang còn trống");
            System.out.println("6. Hiển thị phòng đã có người ở");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 6) {
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
                    showAddRoom();
                    break;
                case 2:
                    showEditRoom();
                    break;
                case 3:
                    deleteRoom();
                    break;
                case 4:
                    showAllRoom();
                    break;
                case 5:
                    findByStatusFalse();
                    break;
                case 6:
                    findByStatusTrue();
                    break;
            }
        } while (choice != 0);
    }

    public void showAddRoom() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Menu Thêm phòng *****" + SetFontColor.RESET);
        String idRoom;
        while (true) {
            System.out.println("Nhập mã phòng:");
            while (true) {
                idRoom = input.nextLine();
                boolean checkIdRoom = checkRegex.validate(idRoom, CheckRegex.Regex_IdRoom);
                if (checkIdRoom) {
                    break;
                } else {
                    System.out.println(SetFontColor.RED_BOLD + "Mã phòng phải có chữ P ở đầu và ít nhất 1 số. Nhập lại mã phòng:" + SetFontColor.RESET);
                }
            }
            if (roomManage.findIndexById(idRoom) == -1) {
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Mã phòng đã có. Nhập lại mã phòng mới" + SetFontColor.RESET);
            }
        }
        System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
        int checkStatus = checkInput.checkInputInt();
        boolean status;
        while (true) {
            if (checkStatus == 0) {
                status = false;
                break;
            } else if (checkStatus == 1) {
                status = true;
                break;
            } else {
                System.out.println(SetFontColor.RED_BOLD + "Nhập vào số 0 hoặc 1" + SetFontColor.RESET);
                System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
                checkStatus = checkInput.checkInputInt();
            }
        }
        System.out.println("Nhập diện tích phòng");
        double squareMeters = checkInput.checkInputDouble();
        System.out.println("Nhập tiền phòng");
        double moneyRoom = checkInput.checkInputDouble();
        System.out.println("Nhập tiền điện / 1 số");
        double moneyElectric = checkInput.checkInputDouble();
        System.out.println("Nhập tiền nước / đầu người");
        double moneyWater = checkInput.checkInputDouble();
        System.out.println("Nhập tiền mạng / đầu người");
        double moneyInternet = checkInput.checkInputDouble();
        System.out.println("Nhập tiền vệ sinh / đầu người");
        double moneyCleaning = checkInput.checkInputDouble();

        Room room = new Room(idRoom, status, squareMeters, moneyRoom, moneyElectric, moneyWater, moneyInternet, moneyCleaning);
        roomManage.add(room);
    }

    public void showEditRoom() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Menu sửa phòng *****" + SetFontColor.RESET);
        while (true) {
            System.out.println("Nhập mã phòng cần sửa:");
            String idRoom = input.nextLine();
            if (roomManage.findIndexById(idRoom) == -1) {
                System.out.println("Không tìm thấy mã phòng.");
            } else {
                System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
                int checkStatus = checkInput.checkInputInt();
                boolean status;
                while (true) {
                    if (checkStatus == 0) {
                        status = false;
                        break;
                    } else if (checkStatus == 1) {
                        status = true;
                        break;
                    } else {
                        System.out.println("Nhập vào số 0 hoặc 1");
                        System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
                        checkStatus = checkInput.checkInputInt();
                    }
                }
                System.out.println("Nhập diện tích phòng");
                double squareMeters = checkInput.checkInputDouble();
                System.out.println("Nhập tiền phòng");
                double moneyRoom = checkInput.checkInputDouble();
                System.out.println("Nhập tiền điện / 1 số");
                double moneyElectric = checkInput.checkInputDouble();
                System.out.println("Nhập tiền nước / đầu người");
                double moneyWater = checkInput.checkInputDouble();
                System.out.println("Nhập tiền mạng / đầu người");
                double moneyInternet = checkInput.checkInputDouble();
                System.out.println("Nhập tiền vệ sinh / đầu người");
                double moneyCleaning = checkInput.checkInputDouble();

                Room room = new Room(idRoom, status, squareMeters, moneyRoom, moneyElectric, moneyWater, moneyInternet, moneyCleaning);
                roomManage.edit(idRoom, room);
                System.out.println("Sửa phòng thành công");
                System.out.println("*********************");
                System.out.println();
                break;
            }
        }
    }

    public void deleteRoom() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Menu Xóa phòng *****" + SetFontColor.RESET);
        while (true) {
            System.out.println("Nhập mã phòng muốn xóa:");
            String idRoom = input.nextLine();
            if (roomManage.findIndexById(idRoom) == -1) {
                System.out.println(SetFontColor.RED_BOLD + "Không tìm thấy mã phòng" + SetFontColor.RESET);
            } else {
                roomManage.delete(idRoom);
                System.out.println("Xóa phòng thành công");
                System.out.println("*********************");
                System.out.println();
                break;
            }
        }
    }

    public void findByStatusFalse() {
        System.out.println();
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Danh sách phòng đang trống *****" + SetFontColor.RESET);
        boolean check = false;
        for (Room room : roomManage.findByStatusFalse()) {
            System.out.println();
            System.out.println(room);
            System.out.println("----------------------");
            check = true;
        }
        if (!check) {
            System.out.println("Tất cả các phòng đều đã có người thuê");
        }
        System.out.println();
    }

    public void findByStatusTrue() {
        boolean check = false;
        System.out.println();
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Danh sách phòng đã có người thuê *****" + SetFontColor.RESET);
        for (Room room : roomManage.findByStatusTrue()) {
            System.out.println();
            System.out.println(room);
            System.out.println("---------------------------");
            check = true;
        }
        if (!check) {
            System.out.println("Tất cả các phòng đều đang trống");
        }
        System.out.println();
    }

    public void showAllRoom() {
        System.out.println(SetFontColor.BLACK + SetFontColor.BLUE_BACKGROUND + "***** Danh sách phòng *****" + SetFontColor.RESET);
        if (roomManage.getAll().size() == 0) {
            System.out.println(SetFontColor.RED_BOLD + "Hiện chưa có phòng nào" + SetFontColor.RESET);
            System.out.println("******************");
        } else {
            for (Room room : roomManage.getAll()) {
                System.out.println(room);
                System.out.println("******************");
                System.out.println();
            }
        }
    }
}
