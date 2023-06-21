package Student_Manage.Menu;

import Student_Manage.Manage.ManageBlockC;
import Student_Manage.Model.StudentBlockC;

import java.util.Scanner;

public class MenuBlockC {
    ManageBlockC manageBlockC = new ManageBlockC();
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
        System.out.println("Nhập điểm văn: ");
        double literaryScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm lịch sử: ");
        double historyScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm địa lý: ");
        double geographyScore = Double.parseDouble(scanner.nextLine());

        StudentBlockC studentBlockC = new StudentBlockC(candidateNumber, studentName, studentAddress, priority, literaryScore, historyScore, geographyScore);
        manageBlockC.addStudent(studentBlockC);
    }

    public void showAllStudent() {
        for (int i = 0; i < manageBlockC.showStudent().size(); i++) {
            System.out.println(manageBlockC.showStudent().get(i).toString());

        }
    }

    public void findStudentByCandidateNumber() {
        System.out.println("Nhập số báo danh cần tìm: ");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        int index = manageBlockC.findIndexByCandidateNumber(candidateNumber);

        if (index != -1) {
            System.out.println(manageBlockC.showStudent().get(index).toString());
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
