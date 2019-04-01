package com.javaguru.shoppinglist;

import com.javaguru.shoppinglist.console.ConsoleUI;
import com.javaguru.shoppinglist.console.actions.Action;
import com.javaguru.shoppinglist.console.actions.CreateProductAction;
import com.javaguru.shoppinglist.console.actions.ExitAction;
import com.javaguru.shoppinglist.console.actions.FindProductByIdAction;
import com.javaguru.shoppinglist.service.DefaultProductService;
import com.javaguru.shoppinglist.service.ProductService;

import java.util.ArrayList;
import java.util.List;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductService productService = new DefaultProductService();

        Action exitAction = new ExitAction();
        Action createUserAction = new CreateProductAction(productService);
        Action findUserByIdAction = new FindProductByIdAction(productService);

        List<Action> actions = new ArrayList<>();
        actions.add(findUserByIdAction);
        actions.add(createUserAction);
        actions.add(exitAction);

        ConsoleUI ui = new ConsoleUI(actions);
        ui.start();
    }
}
