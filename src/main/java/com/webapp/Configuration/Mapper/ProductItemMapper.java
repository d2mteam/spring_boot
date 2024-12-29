package com.webapp.Configuration.Mapper;

import com.webapp.DTO.Product.ProductItemDTO;
import com.webapp.Model.Product.ProductItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductItemMapper {
    @Mapping(source = "product", target = "product")
    ProductItemDTO toDTO(ProductItem productItem);

    @Mapping(source = "product", target = "product")
    ProductItem toEntity(ProductItemDTO productItemDTO);
}
