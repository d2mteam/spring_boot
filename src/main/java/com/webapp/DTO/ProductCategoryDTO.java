package com.webapp.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
public class ProductCategoryDTO {
    private Integer id;
    private String categoryName;
    private Set<ProductDTO> productDTOs = new LinkedHashSet<>();
}
