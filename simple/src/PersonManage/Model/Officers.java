package PersonManage.Model;

public class Officers {
    private int id;
    private String name;
    private int age;
    private int Sex;
    private String adress;
    public Officers(){

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", Sex='" + Sex + '\'' +
                ", adress='" + adress + '\'' +
                ' ';
    }

    public Officers(int id, String name, int age, int sex, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        Sex = sex;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
