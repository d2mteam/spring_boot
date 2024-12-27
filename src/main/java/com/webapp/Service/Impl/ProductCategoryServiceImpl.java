package com.webapp.Service.Impl;

import com.webapp.DTO.ProductCategoryDTO;
import com.webapp.Model.Product.ProductCategory;
import com.webapp.Repository.ProductCategoryRepository;
import com.webapp.Service.ProductCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductCategoryDTO createProductCategory(ProductCategoryDTO productCategoryDTO) {
        ProductCategory productCategory = modelMapper.map(productCategoryDTO, ProductCategory.class);
        productCategory = productCategoryRepository.save(productCategory);
        return modelMapper.map(productCategory, ProductCategoryDTO.class);
    }

    @Override
    public ProductCategoryDTO getProductCategoryById(Integer id) {
        ProductCategory productCategory = productCategoryRepository.findById(id).orElse(null);
        return modelMapper.map(productCategory, ProductCategoryDTO.class);
    }

    @Override
    public ProductCategoryDTO updateProductCategory(Integer id, ProductCategoryDTO productCategoryDTO) {
        productCategoryDTO.setId(id);
        ProductCategory productCategory = modelMapper.map(productCategoryDTO, ProductCategory.class);
        productCategory = productCategoryRepository.save(productCategory);
        return modelMapper.map(productCategory, ProductCategoryDTO.class);
    }

    @Override
    public void deleteProductCategory(Integer id) {
        productCategoryRepository.deleteById(id);
    }

    @Override
    public List<ProductCategoryDTO> getAllProductCategories() {
        List<ProductCategory> productCategories = productCategoryRepository.findAll();
        return productCategories.stream()
                .map(productCategory -> modelMapper.map(productCategory, ProductCategoryDTO.class))
                .toList();
    }
}