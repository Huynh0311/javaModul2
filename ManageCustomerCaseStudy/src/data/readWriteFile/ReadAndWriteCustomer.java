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
                data += customer.getIdPerson() + "," + customer.getNamePerson() + "," +
                        customer.getAge() + "," + customer.getGender() + "," +
                        customer.getPhone() + "," + customer.getAddress() + "\n";
            }
            FileWriter fileWriter = new FileWriter(fileCustomer);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
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
                customers.add(new Customer(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]),
                        data[3], Integer.parseInt(data[4]), data[5]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return customers;
    }
}
