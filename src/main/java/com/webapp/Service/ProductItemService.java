package com.webapp.Service;

import com.webapp.DTO.Product.ProductItemDTO;

import java.util.List;

public interface ProductItemService {
    ProductItemDTO createProductItem(ProductItemDTO productItemDTO);
    ProductItemDTO updateProductItem(Integer id, ProductItemDTO productItemDTO);
    ProductItemDTO getProductItemByID(Integer id);
    List<ProductItemDTO> getAllProductItem();
    void deleteProductItem(Integer id);
}
