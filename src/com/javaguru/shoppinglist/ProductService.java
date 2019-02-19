package com.javaguru.shoppinglist;


public interface ProductService {

    Long create(Product product) throws ValidationException;

    Product findBy(Long id);

}
