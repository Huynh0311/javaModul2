package Student_Manage.Manage;

import Library_Manage.Model.Book;
import Student_Manage.Model.StudentBlockB;

import java.util.ArrayList;
import java.util.List;

public class ManageBlockB implements Management<StudentBlockB> {
    ArrayList<StudentBlockB> studentBlockBs = new ArrayList<>();
    @Override
    public void addStudent(StudentBlockB studentBlockB) {
        studentBlockBs.add(studentBlockB);
    }

    @Override
    public List<StudentBlockB> showStudent() {
        return studentBlockBs;
    }

    @Override
    public int findIndexByCandidateNumber(int candidateNumber) {
        for (int i = 0; i < studentBlockBs.size(); i++) {
            if(studentBlockBs.get(i).getCandidateNumber() == candidateNumber){
                return i;
            }
        }
        return -1;
    }
}
