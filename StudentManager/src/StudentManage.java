import java.util.ArrayList;
import java.util.List;

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
    public void search(String name) {
        boolean found = false;
        this.students = readAndWriteStudent.readFile();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Student " +
                        "id: " + student.getId() +
                        ", name: " + student.getName() +
                        ", age: " + student.getAge() +
                        ", adress: " + student.getAddress());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh phù hợp.");
        }
    }

    @Override
    public List<Student> getAll() {
        return this.readAndWriteStudent.readFile();
    }
}
