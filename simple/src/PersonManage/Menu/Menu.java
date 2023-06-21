package PersonManage.Menu;

import PersonManage.ManegerMent.WorkerManage;
import PersonManage.Model.Worker;

import java.util.Scanner;

public class Menu {
    private WorkerManage workerManage;
    private Scanner scanner = new Scanner(System.in);

    public Menu() {
        workerManage = new WorkerManage();
    }

    public void showMainMenu() {
        String menu = "------ Menu chính ------ \n" +
                "1. Quản lí công nhân \n" +
                "2. Quản lí kỹ sư \n" +
                "3. Quản lí nhân viên \n" +
                "0. Thoát \n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("-------");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    showMenuOfWoker();
            }
        } while (choice != 0);
    }

    public void showMenuOfWoker() {
        String menuOfWoker = "------ Quản lí Công Nhân ------ \n" +
                "1. Thêm công nhân \n" +
                "2. Xóa công nhân \n" +
                "3. Sửa công nhân \n" +
                "4. Tìm kiếm công nhân \n" +
                "5. Hiển thị tất cả công nhân \n" +
                "0. Quay lại menu chính \n";
        int choice;
        do {
            System.out.println(menuOfWoker);
            System.out.println("--------------");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addWoker();
                    break;
                case 2:
                    deleteWorker();
                    break;
                case 3:
                    editWoker();
                    break;
                case 4:
                    findWorkerByName();
                    break;
                case 5:
                    showAllWorker();
                    break;
            }
        } while (choice != 0);
    }

    public void addWoker() {
        System.out.println("-----Thêm công nhân-----");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính(1.Nam | 2.Nữ | 3.Khác):");
        int sex = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Bậc:");
        int places = Integer.parseInt(scanner.nextLine());

        Worker worker = new Worker(name, age, sex, address, places);
        workerManage.add(worker);
    }

    public void deleteWorker() {
        System.out.println("----Xóa công nhân----");
        System.out.println("Nhập ID công nhân muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());

        if (id < 0 || id > WorkerManage.size) {
            System.out.println("Không có thông tin ID công nhân này");
        } else {
            workerManage.delete(id);
        }
    }

    public void editWoker() {
        System.out.println("----- Sửa Công Nhân-----");
        System.out.println("Nhập ID công nhân muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính(1.Nam | 2.Nữ | 3.Khác):");
        int sex = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Bậc:");
        int places = Integer.parseInt(scanner.nextLine());

        Worker worker = new Worker(name, age, sex, address, places);
        workerManage.edit(id, worker);
    }
    public void findWorkerByName(){
        System.out.println("-----Tìm kiếm Công Nhân-----");
        System.out.println("Nhập tên công nhân muốn tìm");
        String name = scanner.nextLine();

        System.out.println(workerManage.findByName(name));
    }
    public void showAllWorker(){
        Worker[] workers = workerManage.showAllOfficers();
        int size = workerManage.size;
        System.out.println("-----Danh sách công nhân-----");
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": "+ workers[i].toString());
        }
    }
}
