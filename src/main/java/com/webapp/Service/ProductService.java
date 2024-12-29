package com.webapp.Service;

import com.webapp.DTO.Product.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductById(Integer id);
    ProductDTO updateProduct(Integer id, ProductDTO productDTO);
    List<ProductDTO> getAllProducts();
    void deleteProduct(Integer id);
}
