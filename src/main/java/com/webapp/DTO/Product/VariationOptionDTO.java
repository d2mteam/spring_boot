package com.webapp.DTO.Product;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
public class VariationOptionDTO {
    private Integer id;
    private VariationDTO variation;
    private String value;
    private Set<ProductItemDTO> productItems = new LinkedHashSet<>();
}
