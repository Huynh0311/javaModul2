package Manager;


import java.util.ArrayList;
import java.util.List;

import file.ReadAndWriteStudent;
import model.Student;

public class StudentManage implements Manager<Student>{
    private ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();
    private List<Student> students = new ArrayList<>();

    public StudentManage() {
        this.students = this.readAndWriteStudent.readFile();
    }

    @Override
    public void add(Student student) {
        students.add(student);
        readAndWriteStudent.writeFile(students);
    }

    @Override
    public void edit(String id, Student student) {
        this.students = this.readAndWriteStudent.readFile();
        int index = findIndexById(id);
        students.set(index, student);
        this.readAndWriteStudent.writeFile(students);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        this.students = this.readAndWriteStudent.readFile();
        students.remove(index);
        readAndWriteStudent.writeFile(students);
    }

    @Override
    public int findIndexById(String id) {
        this.students = readAndWriteStudent.readFile();
        for (int i = 0; i < students.size(); i++) {
            if(id.equals(students.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                studentList.add(student);
            }
        }
        return studentList;
    }

    @Override
    public List<Student> getAll() {
        return this.readAndWriteStudent.readFile();
    }
}
