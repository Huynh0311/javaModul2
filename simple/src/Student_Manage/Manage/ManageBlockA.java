package Student_Manage.Manage;

import Student_Manage.Model.StudentBlockA;

import java.util.ArrayList;
import java.util.List;

public class ManageBlockA implements Management<StudentBlockA>{
    ArrayList<StudentBlockA> studentBlockAs= new ArrayList<>();
    @Override
    public void addStudent(StudentBlockA studentBlockA) {
        studentBlockAs.add(studentBlockA);
    }

    @Override
    public List<StudentBlockA> showStudent() {
        return studentBlockAs;
    }

    @Override
    public int findIndexByCandidateNumber(int candidateNumber) {
        for (int i = 0; i < studentBlockAs.size(); i++) {
            if (studentBlockAs.get(i).getCandidateNumber() == candidateNumber){
                return i;
            }
        }
        return -1;
    }
}
