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
        customers.add(customer);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public void edit(int id, Customer customer) {
        int index = findIndexById(id);
        customers.set(index, customer);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public void delete(int id) {
        int index = findIndexById(id);
        customers.remove(index);
        readAndWriteCustomer.writeFileCustomer(customers);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getIdPerson()) {
                return i;
            }
        }
        return -1;
    }

    public List<Customer> getAll() {
        return customers;
    }
}
