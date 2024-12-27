package com.webapp.Repository;

import com.webapp.Model.Product.ProductConfiguration;
import com.webapp.Model.Product.ProductConfigurationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductConfigurationRepository extends JpaRepository<ProductConfiguration, ProductConfigurationId> {
}
