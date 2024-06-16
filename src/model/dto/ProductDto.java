package model.dto;

import java.util.Date;

public record ProductDto(
        Integer id,
        String ProductName,
        Boolean isDeleted,
        Date importAt,
        Date expiredAt,
        String Product_description
) {
}
