package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.repository.ProductInMemoryRepository;
import com.javaguru.shoppinglist.service.validation.ProductValidationRules;
import com.javaguru.shoppinglist.service.validation.ValidationException;

public class DefaultProductService implements ProductService {

    private final ProductInMemoryRepository repository;

    public DefaultProductService() {
        repository = new ProductInMemoryRepository();
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Long create(Product product) throws ValidationException {
        ProductValidationRules.validate(product);
        return repository.create(product);
    }

}
