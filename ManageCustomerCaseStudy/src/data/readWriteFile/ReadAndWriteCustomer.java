package data.readWriteFile;

import model.entity.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    File fileCustomer = new File("D:\\Code-Gym\\javaMd2\\ManageCustomerCaseStudy\\src\\data\\file\\Customer.csv");

    public void writeFileCustomer(List<Customer> customers) {
        try {
            if (!fileCustomer.exists()) {
                throw new FileNotFoundException();
            }
            String data = "";
            for (Customer customer : customers) {
                data += customer.getIdPerson() + "," + customer.getNamePerson() + "," + customer.getPassword() + "," +
                        customer.getAge() + "," + customer.getGender() + "," +
                        customer.getPhone() + "," + customer.getAddress() + "\n";
            }
            FileWriter fileWriter = new FileWriter(fileCustomer);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi 2");
        }
    }

    public List<Customer> readFileCustomer() {
        List<Customer> customers = new ArrayList<>();
        try {
            if (!fileCustomer.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(fileCustomer);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                customers.add(new Customer(data[0], data[1], data[2], Integer.parseInt(data[3]),
                        data[4], data[5], data[6]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi 2");
        }
        return customers;
    }
}
