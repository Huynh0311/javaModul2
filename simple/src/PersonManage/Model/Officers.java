package PersonManage.Model;

public class Person {
    private String name;
    private int age;
    private String Sex;
    private String adress;

    public Person(String name, int age, String sex, String adress) {
        this.name = name;
        this.age = age;
        Sex = sex;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
