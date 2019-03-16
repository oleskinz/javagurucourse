package com.javaguru.shoppinglist;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

private ProductService productService = new ProductService();
    public void execute() {
        while (true) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("1) Create product");
            System.out.println("2) Find product by ID");
            System.out.println("3) Exit");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    createProduct();
                case 2:
                    findProduct();
                case 3:
                    return;

            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    private void createProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product category: ");
        String category = scanner.nextLine();
        System.out.println("Enter product description: ");
        String description = scanner.nextLine();
        System.out.println("Enter product price: ");
        String price = scanner.nextLine();
        System.out.println("Enter product discount: ");
        String discount = scanner.nextLine();

        Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        product.setDescription(description);
        product.setPrice(new BigDecimal(price));
        product.setDiscount(new Double(discount));

        Long id = ProductService.createProduct(product);
        System.out.println("Result: " + id);
    }

    private void findProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID:");
        Long id = scanner.nextLong();
        Product product = productService.findProductById(id);
        System.out.println(product);
    }

}




    //private final List<Action> actions;

   // public ConsoleUI(List<Action> actions) {
        //this.actions = actions;
    //}

    //public void start() {
        //Scanner scanner = new Scanner(System.in);
       // int response = 0;

       // while (response >= 0) {
            //printMenu();
            //try {
              //  response = scanner.nextInt();
               // actions.get(response).execute();
          //  } catch (Exception e) {
           //     System.out.println("Error! Please try again.");
           // }
      //  }
   // }

    //private void printMenu() {
        //for (int i = 0; i < actions.size(); i++) {
            //System.out.println(i + ". " + actions.get(i));
      //  }
   // }
//}
