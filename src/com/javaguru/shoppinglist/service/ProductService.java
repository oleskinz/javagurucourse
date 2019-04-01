package com.javaguru.shoppinglist.service;


import com.javaguru.shoppinglist.domain.Product;
import com.javaguru.shoppinglist.service.validation.ValidationException;

public interface ProductService {

    Long create(Product product) throws ValidationException;

    Product findById(Long id);

}
