package Student_Manage.Manage;

import java.util.List;

public interface Management<E> {
    void addStudent(E e);
    List<E> showStudent();
    int findIndexByCandidateNumber(int candidateNumber);
}
