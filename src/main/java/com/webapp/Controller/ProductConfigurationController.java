package com.webapp.Controller;

import com.webapp.Model.Product.ProductConfiguration;
import com.webapp.Model.Product.ProductConfigurationId;
import com.webapp.Service.ProductConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-configurations")
public class ProductConfigurationController {
    @Autowired
    private ProductConfigurationService productConfigurationService;

    // API: Lấy danh sách tất cả ProductConfiguration
    @GetMapping
    public ResponseEntity<List<ProductConfiguration>> getAllProductConfigurations() {
        return ResponseEntity.ok(productConfigurationService.getAllProductConfigurations());
    }

    // API: Lấy ProductConfiguration theo ID
    @GetMapping("/{productItemId}/{variationOptionId}")
    public ResponseEntity<ProductConfiguration> getProductConfigurationById(
            @PathVariable Integer productItemId,
            @PathVariable Integer variationOptionId) {
        ProductConfigurationId id = new ProductConfigurationId();
        id.setProductItemId(productItemId);
        id.setVariationOptionId(variationOptionId);
        return ResponseEntity.ok(productConfigurationService.getProductConfigurationById(id));
    }

    @PostMapping
    public ResponseEntity<ProductConfiguration> createOrUpdateProductConfiguration(
            @RequestBody ProductConfiguration productConfiguration) {
        return ResponseEntity.ok(productConfigurationService.saveProductConfiguration(productConfiguration));
    }

    // API: Xóa ProductConfiguration theo ID
    @DeleteMapping("/{productItemId}/{variationOptionId}")
    public ResponseEntity<Void> deleteProductConfiguration(
            @PathVariable Integer productItemId,
            @PathVariable Integer variationOptionId) {
        ProductConfigurationId id = new ProductConfigurationId();
        id.setProductItemId(productItemId);
        id.setVariationOptionId(variationOptionId);
        productConfigurationService.deleteProductConfiguration(id);
        return ResponseEntity.noContent().build();
    }
}
