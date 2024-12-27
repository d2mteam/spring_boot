package com.webapp.Controller;

import com.webapp.DTO.ProductCategoryDTO;
import com.webapp.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping
    public ResponseEntity<ProductCategoryDTO> createProductCategory(@RequestBody ProductCategoryDTO productCategoryDTO) {
        return ResponseEntity.ok(productCategoryService.createProductCategory(productCategoryDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategoryDTO> getProductCategoryById(@PathVariable Integer id) {
        ProductCategoryDTO productCategory = productCategoryService.getProductCategoryById(id);
        return ResponseEntity.ok(productCategory);
    }

    @GetMapping
    public ResponseEntity<List<ProductCategoryDTO>> getAllProductCategories() {
        return ResponseEntity.ok(productCategoryService.getAllProductCategories());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductCategory(@PathVariable Integer id) {
        try {
            productCategoryService.deleteProductCategory(id);
            return ResponseEntity.ok("Product category deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Product category not found");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProductCategory(@PathVariable Integer id, @RequestBody ProductCategoryDTO productCategoryDTO) {
        try {
            ProductCategoryDTO updatedProductCategory = productCategoryService.updateProductCategory(id, productCategoryDTO);
            return ResponseEntity.ok("Product category updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Product category not found");
        }
    }

}
