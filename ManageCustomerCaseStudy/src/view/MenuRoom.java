package view;

import model.entity.Room;
import model.sevice.RoomManage;

import java.util.Scanner;

public class MenuRoom {
    private Scanner input = new Scanner(System.in);
    private RoomManage roomManage = new RoomManage();
    public double checkInputDouble(){
        double inputDouble;
        while (true){
            try {
                inputDouble = Double.parseDouble(input.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập vào là số");
            }
        }
        return inputDouble;
    }

    public void showMenuRoom() {
        int choice;
        do {
            System.out.println("***** Menu Phòng Trọ *****");
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
                        System.out.println("Bạn cần nhập đúng số trong menu");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập đúng số trong menu");
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
        System.out.println("***** Menu Thêm phòng *****");
        System.out.println("Nhập mã phòng:");
        String idRoom;
        while (true) {
            idRoom = input.nextLine();
            if (roomManage.findIndexById(idRoom) == -1) {
                break;
            } else {
                System.out.println("Mã phòng đã có. Nhập lại mã phòng mới");
            }
        }
        System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
        int checkStatus = Integer.parseInt(input.nextLine());
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
                checkStatus = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Nhập diện tích phòng");
        double squareMeters = checkInputDouble();
        System.out.println("Nhập tiền phòng");
        double moneyRoom = checkInputDouble();
        System.out.println("Nhập tiền điện / 1 số");
        double moneyElectric = checkInputDouble();
        System.out.println("Nhập tiền nước / đầu người");
        double moneyWater = checkInputDouble();
        System.out.println("Nhập tiền mạng / đầu người");
        double moneyInternet = checkInputDouble();
        System.out.println("Nhập tiền vệ sinh / đầu người");
        double moneyCleaning = checkInputDouble();

        Room room = new Room(idRoom, status, squareMeters, moneyRoom, moneyElectric, moneyWater, moneyInternet, moneyCleaning);
        roomManage.add(room);
    }

    public void showEditRoom() {
        System.out.println("***** Menu sửa phòng *****");
        while (true) {
            System.out.println("Nhập mã phòng cần sửa:");
            String idRoom = input.nextLine();
            if (roomManage.findIndexById(idRoom) == -1) {
                System.out.println("Không tìm thấy mã phòng. Nhập lại mã phòng");
            } else {
                System.out.println("Trạng thái phòng (0.chưa được thuê/1.đã được thuê)");
                int checkStatus = Integer.parseInt(input.nextLine());
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
                        checkStatus = Integer.parseInt(input.nextLine());
                    }
                }
                System.out.println("Nhập diện tích phòng");
                double squareMeters = checkInputDouble();
                System.out.println("Nhập tiền phòng");
                double moneyRoom = checkInputDouble();
                System.out.println("Nhập tiền điện / 1 số");
                double moneyElectric = checkInputDouble();
                System.out.println("Nhập tiền nước / đầu người");
                double moneyWater = checkInputDouble();
                System.out.println("Nhập tiền mạng / đầu người");
                double moneyInternet = checkInputDouble();
                System.out.println("Nhập tiền vệ sinh / đầu người");
                double moneyCleaning = checkInputDouble();

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
        while (true) {
            System.out.println("Nhập mã phòng muốn xóa:");
            String idRoom = input.nextLine();
            if (roomManage.findIndexById(idRoom) == -1) {
                System.out.println("Không tìm thấy mã phòng");
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
        System.out.println("***** Danh sách phòng đang trống *****");
        boolean check = false;
        for (Room room : roomManage.findByStatusFalse()) {
            System.out.println(room);
            check = true;
        }
        if (!check) {
            System.out.println("Tất cả các phòng đều đã có người thuê");
        }
        System.out.println("--------------------------------------");
        System.out.println();
    }

    public void findByStatusTrue() {
        boolean check = false;
        System.out.println();
        System.out.println("***** Danh sách phòng đã có người thuê *****");
        for (Room room : roomManage.findByStatusTrue()) {
            System.out.println(room);
            check = true;
        }
        if (!check) {
            System.out.println("Tất cả các phòng đều đang trống");
        }
        System.out.println("--------------------------------------");
        System.out.println();
    }

    public void showAllRoom() {
        for (Room room : roomManage.getAll()) {
            System.out.println(room);
        }
    }
}
