package model.dto;

import lombok.Builder;
import model.entity.Customer;

import java.sql.Date;
@Builder
public record OrderDto(
        Integer id,
        String orderName,
        String orderDescription,
        String bio,
        CustomerDto customer
){
}
