package model.entity;

public class Customer {
    private String idPerson;
    private String namePerson;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String password;


    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String idPerson, String namePerson, String password, int age, String gender, String phone, String address) {
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
        return "Căn cước công dân: " + idPerson + "\n" +
                "Tên khách hàng: " + namePerson + "\n" +
                "Mật khẩu: " + password + "\n" +
                "Tuổi: " + age + "\n" +
                "Giới tính: " + gender + "\n" +
                "Điện thoại: " + phone + "\n" +
                "Địa chỉ: " + address;
    }
}
