package com.webapp.Model.Product;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "variation_option")
public class VariationOption {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "variation_id")
    private Variation variation;

    @Size(max = 255)
    @NotNull
    @Column(name = "value", nullable = false)
    private String value;

    @ManyToMany
    @JoinTable(name = "product_configuration",
            joinColumns = @JoinColumn(name = "variation_option_id"),
            inverseJoinColumns = @JoinColumn(name = "product_item_id"))
    private Set<ProductItem> productItems = new LinkedHashSet<>();

}