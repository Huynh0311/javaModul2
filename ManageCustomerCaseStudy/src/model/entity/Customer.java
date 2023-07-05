package model.entity;

public class Customer {
    private int idPerson;
    private String namePerson;
    private int age;
    private String gender;
    private int phone;
    private String address;


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

    public Customer(int idPerson, String namePerson, int age, String gender, int phone, String address) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Căn cước công dân: " + idPerson +
                ", Tên khách hàng: " + namePerson +
                ", tuổi: " + age +
                ", giới tính: " + gender +
                ", điện thoại: " + phone +
                ", địa chỉ: " + address;
    }
}
