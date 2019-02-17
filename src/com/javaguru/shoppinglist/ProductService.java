package com.javaguru.shoppinglist;

import javax.xml.bind.ValidationException;

public interface ProductService {

    Long create(Product product) throws ValidationException;

    Product findBy(Long id);

}
