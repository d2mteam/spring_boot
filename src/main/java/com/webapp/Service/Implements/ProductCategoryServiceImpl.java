package com.webapp.Service.Implements;

import com.webapp.Configuration.Mapper.ProductCategoryMapper;
import com.webapp.DTO.Product.ProductCategoryDTO;
import com.webapp.Model.Product.ProductCategory;
import com.webapp.Repository.ProductCategoryRepository;
import com.webapp.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ProductCategoryMapper productCategoryMapper; 
    
    @Override
    public ProductCategoryDTO createProductCategory(ProductCategoryDTO productCategoryDTO) {
        ProductCategory productCategory = productCategoryMapper.toEntity(productCategoryDTO);
        productCategory = productCategoryRepository.save(productCategory);
        return productCategoryMapper.toDTO(productCategory);
    }

    @Override
    public ProductCategoryDTO getProductCategoryById(Integer id) {
        ProductCategory productCategory = productCategoryRepository.findById(id).orElse(null);
        return productCategoryMapper.toDTO(productCategory);
    }

    @Override
    public ProductCategoryDTO updateProductCategory(Integer id, ProductCategoryDTO productCategoryDTO) {
        productCategoryDTO.setId(id);
        ProductCategory productCategory = productCategoryMapper.toEntity(productCategoryDTO);
        productCategory = productCategoryRepository.save(productCategory);
        return productCategoryMapper.toDTO(productCategory);
    }

    @Override
    public void deleteProductCategory(Integer id) {
        productCategoryRepository.deleteById(id);
    }

    @Override
    public List<ProductCategoryDTO> getAllProductCategories() {
        List<ProductCategory> productCategories = productCategoryRepository.findAll();
        return productCategories.stream()
                .map(productCategoryMapper::toDTO)
                .toList();
    }
}