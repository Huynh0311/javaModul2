import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    File file = new File("StudentManager/src/data.csv");

    public void writeFile(List<Student> students) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String data = "";
            for (Student student : students) {
                data += student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress() + "\n";
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
        return students;
    }
}
