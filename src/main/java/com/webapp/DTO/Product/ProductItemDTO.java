package com.webapp.DTO.Product;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductItemDTO {
    private Integer id;
    private ProductDTO product;
    private String sku;
    private Integer qtyInStock;
    private String productImage;
    private BigDecimal price;
}
