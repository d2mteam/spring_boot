package com.webapp.Configuration.Mapper;

import com.webapp.DTO.Product.ProductDTO;
import com.webapp.Model.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductCategoryMapper.class})
public interface ProductMapper {

    @Mapping(source = "category", target = "category")
    ProductDTO toDTO(Product product);

    @Mapping(source = "category", target = "category")
    Product toEntity(ProductDTO productDTO);

}
