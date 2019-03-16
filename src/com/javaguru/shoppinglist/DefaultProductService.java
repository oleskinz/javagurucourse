package com.javaguru.shoppinglist;

import java.util.HashMap;
import java.util.Map;

public class DefaultProductService implements ProductService {

    //private Map<Long, Product> database = new HashMap<>();
    //private Long productIdSequence = 0L;

    public Product findBy(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id must be not null");
        }
        return database.get(id);
    }

    @Override
    public Long create(Product product) throws ValidationException {
        ProductValidationRules.validate(product);
        product.setId(productIdSequence);

        database.put(productIdSequence, product);
        return productIdSequence++;
    }

}
