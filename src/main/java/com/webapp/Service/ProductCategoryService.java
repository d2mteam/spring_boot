package com.webapp.Service;

import com.webapp.DTO.Product.ProductCategoryDTO;

import java.util.List;

public interface ProductCategoryService {
    ProductCategoryDTO createProductCategory(ProductCategoryDTO productCategoryDTO);
    ProductCategoryDTO getProductCategoryById(Integer id);
    ProductCategoryDTO updateProductCategory(Integer id, ProductCategoryDTO productCategoryDTO);
    void deleteProductCategory(Integer id);
    List<ProductCategoryDTO> getAllProductCategories();
}
