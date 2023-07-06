package model.entity;

public class Customer {
    private int idPerson;
    private String namePerson;
    private int age;
    private String gender;
    private int phone;
    private String address;
    private String password;


    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int idPerson, String namePerson, String password, int age, String gender, int phone, String address) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Căn cước công dân: " + idPerson +
                ", Tên khách hàng: " + namePerson +
                ", Mật khẩu: " + password +
                ", tuổi: " + age +
                ", giới tính: " + gender +
                ", điện thoại: " + phone +
                ", địa chỉ: " + address;
    }
}
