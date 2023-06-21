package Student_Manage.Menu;

import Student_Manage.Manage.ManageBlockB;
import Student_Manage.Model.StudentBlockB;

import java.util.Scanner;

public class MenuBlockB {
    ManageBlockB manageBlockB = new ManageBlockB();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Nhập số báo danh: ");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên thí sinh: ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String studentAddress = scanner.nextLine();
        System.out.println("Nhập mức ưu tiên: ");
        int priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm toán: ");
        double mathScores = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm hóa: ");
        double chemistryScores = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm sinh: ");
        double biologyScore = Double.parseDouble(scanner.nextLine());

        StudentBlockB studentBlockB = new StudentBlockB(candidateNumber, studentName, studentAddress, priority, mathScores, chemistryScores, biologyScore);
        manageBlockB.addStudent(studentBlockB);
    }

    public void showAllStudent() {
        for (int i = 0; i < manageBlockB.showStudent().size(); i++) {
            System.out.println(manageBlockB.showStudent().get(i).toString());

        }
    }

    public void findStudentByCandidateNumber() {
        System.out.println("Nhập số báo danh cần tìm: ");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        int index = manageBlockB.findIndexByCandidateNumber(candidateNumber);

        if (index != -1) {
            System.out.println(manageBlockB.showStudent().get(index).toString());
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
