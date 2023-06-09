package model.sevice;

import data.readWriteFile.ReadAndWriteCustomer;
import model.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManage {
    private List<Customer> customers = new ArrayList<>();
    private ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();


    public CustomerManage() {
        this.customers = readAndWriteCustomer.readFileCustomer();
    }

    public void add(Customer customer) {
        this.customers = readAndWriteCustomer.readFileCustomer();
        customers.add(customer);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public void edit(String id, Customer customer) {
        this.customers = readAndWriteCustomer.readFileCustomer();
        int index = findIndexById(id);
        customers.set(index, customer);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public void delete(String id) {
        this.customers = readAndWriteCustomer.readFileCustomer();
        int index = findIndexById(id);
        customers.remove(index);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public int findIndexById(String id) {
        for (int i = 0; i < customers.size(); i++) {
            if (id.equals(customers.get(i).getIdPerson())) {
                return i;
            }
        }
        return -1;
    }

    public List<Customer> getAll() {
        return readAndWriteCustomer.readFileCustomer();
    }
}
