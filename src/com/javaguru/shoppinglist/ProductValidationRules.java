package com.javaguru.shoppinglist;


import javax.xml.bind.ValidationException;

public class ProductValidationRules {

    public static void validate(Product product) throws ValidationException {
        if (product == null) {
            throw new ValidationException("Cannot be null");
        }

            if (product.getPrice() == null) {
                throw new ValidationException("Price must be not null");

            }
            if (product.getDiscount() != null && product.getDiscount() == 100) {
                throw new ValidationException("Discount must not be 100%");

            }

            if (product.getName() == null || product.getName().length() < 3 || product.getName().length() > 32) {
                throw new ValidationException("Product name must be longer then 3 characters, and shorter then 32 characters ");
            }

        }


    }



