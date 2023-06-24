package Town_Manage.Manage;

public class Person {
    private int id;
    private String Name;
    private int age;
    private String job;

    public Person(int id, String name, int age, String job) {
        this.id = id;
        Name = name;
        this.age = age;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person " +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ' ';
    }
}
