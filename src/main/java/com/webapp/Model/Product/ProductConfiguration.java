package com.webapp.Model.Product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_configuration")
public class ProductConfiguration {
    @EmbeddedId
    private ProductConfigurationId id;

    @MapsId("productItemId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_item_id", nullable = false)
    private ProductItem productItem;

    @MapsId("variationOptionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "variation_option_id", nullable = false)
    private VariationOption variationOption;

}