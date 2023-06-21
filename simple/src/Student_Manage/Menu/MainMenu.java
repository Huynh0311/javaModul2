package Student_Manage.Menu;

import java.util.Scanner;

public class MainMenu {
    private MenuBlockA menuBlockA = new MenuBlockA();
    private MenuBlockB menuBlockB = new MenuBlockB();
    private MenuBlockC menuBlockC = new MenuBlockC();
    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        int choice;
        do {
            System.out.println("=====Quản Lý sinh viên dự thi=====");
            System.out.println("1. Quản lý sinh viên thi khối A");
            System.out.println("2. Quản lý sinh viên thi khối B");
            System.out.println("3. Quản lý sinh viên thi khối C");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    showStudentBlockA();
                    break;
                case 2:
                    showStudentBlockB();
                    break;
                case 3:
                    showStudentBlockC();
                    break;
            }
        }while (choice != 0);
    }
    public void showStudentBlockA(){
        int choice;
        do {
            System.out.println("=====Quản Lý sinh viên thi khối A=====");
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị thí sinh");
            System.out.println("3. Tìm kiếm thí sinh (theo số báo danh)");
            System.out.println("0. Quay lại mục quản lý sinh viên dự thi");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    menuBlockA.addStudent();
                    break;
                case 2:
                    menuBlockA.showAllStudent();
                    break;
                case 3:
                    menuBlockA.findStudentByCandidateNumber();
                    break;
            }
        }while (choice != 0);
    }
    public void showStudentBlockB(){
        int choice;
        do {
            System.out.println("=====Quản Lý sinh viên thi khối B=====");
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị thí sinh");
            System.out.println("3. Tìm kiếm thí sinh (theo số báo danh)");
            System.out.println("0. Quay lại mục quản lý sinh viên dự thi");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    menuBlockB.addStudent();
                    break;
                case 2:
                    menuBlockB.showAllStudent();
                    break;
                case 3:
                    menuBlockB.findStudentByCandidateNumber();
                    break;
            }
        }while (choice != 0);
    }
    public void showStudentBlockC(){
        int choice;
        do {
            System.out.println("=====Quản Lý sinh viên thi khối C=====");
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị thí sinh");
            System.out.println("3. Tìm kiếm thí sinh (theo số báo danh)");
            System.out.println("0. Quay lại mục quản lý sinh viên dự thi");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    menuBlockC.addStudent();
                    break;
                case 2:
                    menuBlockC.showAllStudent();
                    break;
                case 3:
                    menuBlockC.findStudentByCandidateNumber();
                    break;
            }
        }while (choice != 0);
    }
}
