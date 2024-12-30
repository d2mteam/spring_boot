package com.webapp.DTO.Product;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
public class VariationDTO {
    private Integer id;
    private ProductCategoryDTO category;
    private String name;
    private Set<VariationOptionDTO> variationOptions = new LinkedHashSet<>();
}
