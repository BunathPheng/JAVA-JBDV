package controller;

import exception.CatchException;
import model.dao.CustomerDao;
import model.dao.CustomerDaoImpl;
import model.dto.CustomerDto;
import model.entity.Customer;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;
import org.postgresql.gss.GSSOutputStream;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CustomerController {
    private final CustomerService customerService = new CustomerServiceImpl();
    public List<CustomerDto> getAllCustomers() {
        return customerService.queryAllCustomers();
    }
    public void insertCustomer() {
        System.out.print("[+] Insert Name:");
        String name = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert Email:");
        String email = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert password:");
        String password = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert IsDelete:");
        Boolean isDelete = new Scanner(System.in).nextBoolean();
        Customer customer;
        customer = Customer.builder()
                .name(name)
                .email(email)
                .password(password)
                .isDeleted(isDelete)
                .createdAt(Date.valueOf(LocalDate.now()))
                .build();
        customerService.insertCustomer(customer);
    }
    public void deleteCustomer() throws CatchException {
        System.out.print("[+] Insert ID to Delete Customer:");
        Integer id  = new Scanner(System.in).nextInt();
        customerService.deleteCustomer(id);
    }
    public void updateCustomer() throws CatchException {
        System.out.print("[+] Insert ID to Update Customer:");
        Integer id  = new Scanner(System.in).nextInt();
        customerService.updateCustomer(id);
    }
    public CustomerDto searchCustomer() throws CatchException {
        System.out.print("[+] Insert ID to Search Customer:");
        Integer id  = new Scanner(System.in).nextInt();
        return customerService.searchCustomer(id);
    }
}
