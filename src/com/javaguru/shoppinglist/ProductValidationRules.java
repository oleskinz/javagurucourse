package com.javaguru.shoppinglist;


public class ProductValidationRules {

    public static final int MIN_NAME_LENGTH = 3;
    public static final int MAX_NAME_LENGTH = 32;

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

        if (product.getName() == null || product.getName().length() < MIN_NAME_LENGTH || product.getName().length() > MAX_NAME_LENGTH) {
            throw new ValidationException(String.format("Product name must be longer then %s characters, and shorter then %s characters ",MIN_NAME_LENGTH,MAX_NAME_LENGTH));
        }

    }
}



