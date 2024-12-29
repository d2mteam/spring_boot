package com.webapp.Controller;

import com.webapp.DTO.Product.ProductItemDTO;
import com.webapp.Service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-items")
public class ProductItemController {
    @Autowired
    private ProductItemService productItemService;

    @PostMapping
    public ResponseEntity<ProductItemDTO> createProductItem(@RequestBody ProductItemDTO productItem) {
        return ResponseEntity.ok(productItemService.createProductItem(productItem));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductItemDTO> getProductItemById(@PathVariable Integer id) {
        return ResponseEntity.ok(productItemService.getProductItemByID(id));
    }

    @GetMapping
    public ResponseEntity<List<ProductItemDTO>> getAllProductItem() {
        return ResponseEntity.ok(productItemService.getAllProductItem());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductItem(@PathVariable Integer id) {
        try {
            productItemService.deleteProductItem(id);
            return ResponseEntity.ok("ProductItem deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("ProductItem not found");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProductItem(@PathVariable Integer id, @RequestBody ProductItemDTO productItem) {
        try {
            productItemService.updateProductItem(id, productItem);
            return ResponseEntity.ok("ProductItem updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("ProductItem not found");
        }
    }
}
