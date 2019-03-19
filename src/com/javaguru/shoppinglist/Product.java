package com.javaguru.shoppinglist;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private String category;
    private String description;

    private BigDecimal price;
    private Double discount;




    public Long getId() { return id; }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getDiscount() { return discount; }
    public void setDiscount(Double discount) { this.discount = discount; }



    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Product product = (Product) object;
        return java.util.Objects.equals(id, product.id) &&
                java.util.Objects.equals(name, product.name) &&
                java.util.Objects.equals(category, product.category) &&
                java.util.Objects.equals(description, product.description) &&
                java.util.Objects.equals(price, product.price) &&
                java.util.Objects.equals(discount, product.discount);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}