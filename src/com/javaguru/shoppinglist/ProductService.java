package com.javaguru.shoppinglist;


public interface ProductService {

    static Long createProduct(Product product) {
    }

    Long create(Product product) throws ValidationException;

    Product findBy(Long id);

    Product findProductById(Long id);
}
