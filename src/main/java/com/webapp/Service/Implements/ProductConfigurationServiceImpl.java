package com.webapp.Service.Implements;


import com.webapp.Model.Product.ProductConfiguration;
import com.webapp.Model.Product.ProductConfigurationId;
import com.webapp.Repository.ProductConfigurationRepository;
import com.webapp.Service.ProductConfigurationService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductConfigurationServiceImpl implements ProductConfigurationService {

    private final ProductConfigurationRepository productConfigurationRepository;

    public List<ProductConfiguration> getAllProductConfigurations() {
        return productConfigurationRepository.findAll();
    }

    public ProductConfiguration getProductConfigurationById(ProductConfigurationId id) {
        return productConfigurationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ProductConfiguration not found with id: " + id));
    }

    public ProductConfiguration saveProductConfiguration(ProductConfiguration productConfiguration) {
        return productConfigurationRepository.save(productConfiguration);
    }

    public void deleteProductConfiguration(ProductConfigurationId id) {
        if (!productConfigurationRepository.existsById(id)) {
            throw new EntityNotFoundException("ProductConfiguration not found with id: " + id);
        }
        productConfigurationRepository.deleteById(id);
    }
}
