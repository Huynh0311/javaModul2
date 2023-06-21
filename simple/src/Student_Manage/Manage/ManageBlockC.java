package Student_Manage.Manage;
import Student_Manage.Model.StudentBlockC;

import java.util.ArrayList;
import java.util.List;

public class ManageBlockC implements Management<StudentBlockC>{
    ArrayList<StudentBlockC> studentBlockCS = new ArrayList<>();

    @Override
    public void addStudent(StudentBlockC studentBlockC) {
        studentBlockCS.add(studentBlockC);
    }

    @Override
    public List<StudentBlockC> showStudent() {
        return studentBlockCS;
    }

    @Override
    public int findIndexByCandidateNumber(int candidateNumber) {
        for (int i = 0; i < studentBlockCS.size(); i++) {
            if(studentBlockCS.get(i).getCandidateNumber() == candidateNumber){
                return i;
            }
        }
        return -1;
    }
}
