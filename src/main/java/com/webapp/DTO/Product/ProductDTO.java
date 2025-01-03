package com.webapp.DTO.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private String productImage;
    private ProductCategoryDTO category;
}
