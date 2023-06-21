package Student_Manage.Menu;

import Student_Manage.Manage.ManageBlockA;
import Student_Manage.Model.StudentBlockA;

import java.util.Scanner;

public class MenuBlockA {
    ManageBlockA manageBlockA = new ManageBlockA();
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
        System.out.println("Nhập điểm vật lý: ");
        double physicsScores = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm hóa: ");
        double chemistryScores = Double.parseDouble(scanner.nextLine());

        StudentBlockA studentBlockA = new StudentBlockA(candidateNumber, studentName, studentAddress, priority, mathScores, physicsScores, chemistryScores);
        manageBlockA.addStudent(studentBlockA);
    }

    public void showAllStudent() {
        for (int i = 0; i < manageBlockA.showStudent().size(); i++) {
            System.out.println(manageBlockA.showStudent().get(i).toString());

        }
    }

    public void findStudentByCandidateNumber() {
        System.out.println("Nhập số báo danh cần tìm: ");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        int index = manageBlockA.findIndexByCandidateNumber(candidateNumber);

        if (index != -1) {
            System.out.println(manageBlockA.showStudent().get(index).toString());
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
