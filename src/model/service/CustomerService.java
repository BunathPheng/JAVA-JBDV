package model.service;

import exception.CatchException;
import model.dto.CustomerDto;
import model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> queryAllCustomers();
    void insertCustomer(Customer customer);
    int deleteCustomer(Integer id) throws CatchException;
    int updateCustomer(Integer id) throws CatchException;
    CustomerDto searchCustomer(Integer id) throws CatchException;
}
