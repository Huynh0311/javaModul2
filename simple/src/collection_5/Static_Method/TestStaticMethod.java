package collection_5.Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        //tạo đối tượng
        Student s1 = new Student(1, "Hoang");
        Student s2 = new Student(2, "Khanh");
        Student s3 = new Student(3, "Quang");

        s1.display();
        s2.display();
        s3.display();
    }
}
