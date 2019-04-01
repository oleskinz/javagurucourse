package com.javaguru.shoppinglist.repository;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.service.validation.ValidationException;

import java.util.HashMap;
import java.util.Map;

public class ProductInMemoryRepository {

    private Map<Long, Product> database = new HashMap<>();
    private Long productIdSequence = 0L;

    public Product findById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id must be not null");
        }
        return database.get(id);
    }

    public Long create(Product product) throws ValidationException {
        product.setId(productIdSequence);
        database.put(productIdSequence, product);
        return productIdSequence++;
    }
}
