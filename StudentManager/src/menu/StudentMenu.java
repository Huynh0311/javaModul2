package menu;

import Manager.StudentManage;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMenu {
    private Scanner input = new Scanner(System.in);
    private StudentManage studentManage = new StudentManage();

    public void StudentMenu() {
        int choice;
        do {
            System.out.println("===== Quản lý học sinh THPT ======");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Sửa học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh theo tên");
            System.out.println("5. Hiển thị danh sách học sinh");
            System.out.println("0. Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            while (true) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 5) {
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
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    SearchStudent();
                    break;
                case 5:
                    showAllStudent();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public void addStudent() {
        System.out.println("Nhập ID");
        String id;
        while (true) {
            id = input.nextLine();
            if (studentManage.findIndexById(id) == -1){
                break;
            }else {
                System.out.println("ID đã có. Nhập lại ID");
            }
        }
        System.out.println("Nhập tên học sinh");
        String name = input.nextLine();
        System.out.println("Nhập tuổi học sinh");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tuổi cần nhập bằng số");
            }
        }
        System.out.println("Nhập quê quán");
        String address = input.nextLine();

        Student student = new Student(id, name, age, address);
        studentManage.add(student);
        System.out.println("Thêm học sinh thành công");
        System.out.println("------------------------------");
    }

    public void editStudent() {
        System.out.println("==== Menu sửa học sinh ====");
        System.out.println("Nhập ID muốn sửa");
        String id = input.nextLine();
        if (studentManage.findIndexById(id) == -1) {
            System.out.println("Không tìm thấy ID");
        } else {
            System.out.println("Nhập tên học sinh mới");
            String name = input.nextLine();
            System.out.println("Nhập tuổi học sinh mới");
            int age;
            while (true) {
                try {
                    age = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Tuổi cần nhập bằng số");
                }
            }
            System.out.println("Nhập quê quán mới");
            String address = input.nextLine();

            Student student = new Student(id, name, age, address);
            studentManage.edit(id, student);
            System.out.println("Sửa học sinh thành công");
            System.out.println("------------------------------");
        }

    }

    public void deleteStudent() {
        System.out.println("******************************");
        System.out.println("Nhập ID học sinh muốn xóa");
        String id = input.nextLine();
        if (studentManage.findIndexById(id) == -1) {
            System.out.println("Không tìm thấy ID");
        } else {
            studentManage.delete(id);
            System.out.println("Xóa học sinh thành công");
            System.out.println("------------------------------");
        }

    }

    public void SearchStudent() {
        System.out.println("******************************");
        System.out.println("Nhập tên học sinh muốn tìm kiếm");
        String name = input.nextLine();
        List<Student> studentList = studentManage.findByName(name);
        if (studentList.size() != 0) {
            for (Student student : studentManage.findByName(name)) {
                System.out.println();
                System.out.println(student);
            }
        } else {
            System.out.println("Không tìm thấy học sinh");
        }
        System.out.println("------------------------------");
    }

    public void showAllStudent() {
        System.out.println("==== Danh sách học sinh ====");
        for (int i = 0; i < studentManage.getAll().size(); i++) {
            System.out.println(studentManage.getAll().get(i).toString());
        }
        System.out.println("------------------------------");
    }
}
