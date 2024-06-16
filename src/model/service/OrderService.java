package model.service;

import exception.CatchException;
import model.dto.CustomerDto;
import model.dto.OrderDto;
import model.entity.Customer;
import model.entity.Order;

import java.util.List;

public interface OrderService {
    List <OrderDto> queryAllOrders() throws CatchException;
    void insertOrder(Order order) throws CatchException;
    int updateOrder(Integer id) throws CatchException;
    void deleteOrderById(Integer id);
    OrderDto searchOrders(Integer id) throws CatchException;
}
