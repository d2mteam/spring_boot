package com.webapp.DTO.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCategoryDTO {
    private Integer id;
    private String categoryName;
    private ProductCategoryDTO parentCategory;
}
