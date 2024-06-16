package model.dao;

import model.entity.Customer;
import model.service.CustomerService;

import java.util.List;

public interface CustomerDao {
    List<Customer> queryAllCustomer();
    int deleteCustomer(Integer id);
    int deleteAllCustomers();
    int updateCustomer(Customer customer , Integer id);
    int insertCustomer(Customer customer);
    Customer searchCustomerById(Integer id);
}
