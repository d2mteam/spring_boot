package com.webapp.Service;

import com.webapp.Model.Product.ProductConfiguration;
import com.webapp.Model.Product.ProductConfigurationId;
import java.util.List;

public interface ProductConfigurationService {
    List<ProductConfiguration> getAllProductConfigurations();
    ProductConfiguration getProductConfigurationById(ProductConfigurationId id);
    ProductConfiguration saveProductConfiguration(ProductConfiguration productConfiguration);
    void deleteProductConfiguration(ProductConfigurationId id);
}
