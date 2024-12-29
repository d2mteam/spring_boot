package com.webapp.Service.Implements;

import com.webapp.Configuration.Mapper.ProductItemMapper;
import com.webapp.DTO.Product.ProductItemDTO;
import com.webapp.Model.Product.ProductItem;
import com.webapp.Repository.ProductItemRepository;
import com.webapp.Service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductItemServiceImpl implements ProductItemService {
    @Autowired
    private ProductItemRepository productItemRepository;

    @Autowired
    private ProductItemMapper productItemMapper;

    @Override
    public ProductItemDTO createProductItem(ProductItemDTO productItemDTO) {
        ProductItem productItem = productItemMapper.toEntity(productItemDTO);
        productItemRepository.save(productItem);
        return productItemMapper.toDTO(productItem);
    }

    @Override
    public ProductItemDTO updateProductItem(Integer id, ProductItemDTO productItemDTO) {
        productItemDTO.setId(id);
        ProductItem productItem = productItemMapper.toEntity(productItemDTO);
        productItemRepository.save(productItem);
        return productItemMapper.toDTO(productItem);
    }

    @Override
    public ProductItemDTO getProductItemByID(Integer id) {
        ProductItem productItem = productItemRepository.findById(id).orElse(null);
        return productItemMapper.toDTO(productItem);
    }

    @Override
    public List<ProductItemDTO> getAllProductItem() {
        List<ProductItem> productItems = productItemRepository.findAll();
        return productItems.stream()
                .map(productItemMapper::toDTO)
                .toList();
    }

    @Override
    public void deleteProductItem(Integer id) {
        productItemRepository.deleteById(id);
    }
}
