package com.webapp.Configuration.Mapper;

import com.webapp.DTO.ProductCategoryDTO;
import com.webapp.DTO.ProductDTO;
import com.webapp.Model.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ProductCategoryDTO.class})
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toProductDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
