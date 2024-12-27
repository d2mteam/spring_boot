package com.webapp.Configuration.Mapper;

import com.webapp.DTO.ProductCategoryDTO;
import com.webapp.Model.Product.ProductCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductCategoryMapper {
    ProductCategoryMapper INSTANCE = Mappers.getMapper(ProductCategoryMapper.class);
    ProductCategoryDTO toProductCategoryDTO(ProductCategory productCategory);
    ProductCategory toEntity(ProductCategoryDTO productCategoryDTO);
}
