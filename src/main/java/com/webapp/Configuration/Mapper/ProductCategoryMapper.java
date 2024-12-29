package com.webapp.Configuration.Mapper;

import com.webapp.DTO.Product.ProductCategoryDTO;
import com.webapp.Model.Product.ProductCategory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    @Mapping(source = "parentCategory", target = "parentCategory", ignore = true)
    ProductCategoryDTO toDTO(ProductCategory productCategory);

    @Mapping(source = "parentCategory", target = "parentCategory", ignore = true)
    ProductCategory toEntity(ProductCategoryDTO productCategoryDTO);
}
