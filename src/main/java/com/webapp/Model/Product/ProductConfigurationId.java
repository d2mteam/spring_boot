package com.webapp.Model.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ProductConfigurationId implements java.io.Serializable {
    private static final long serialVersionUID = -5842806028568093436L;
    @NotNull
    @Column(name = "product_item_id", nullable = false)
    private Integer productItemId;

    @NotNull
    @Column(name = "variation_option_id", nullable = false)
    private Integer variationOptionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductConfigurationId entity = (ProductConfigurationId) o;
        return Objects.equals(this.productItemId, entity.productItemId) &&
                Objects.equals(this.variationOptionId, entity.variationOptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productItemId, variationOptionId);
    }

}