package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class StoreApp
{
    // the key is the product id, the value is a product object
    public static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();

    public static void main(String[] args)
    {
// this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null)
        {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory()
    {
        inventory.put(1, new Product(1, "Box of Nails", 9.29));
        inventory.put(2, new Product(2, "Hammer", 14.99));
        inventory.put(3, new Product(3, "Screwdriver Set", 19.49));
        inventory.put(4, new Product(4, "Electric Drill", 59.99));
        inventory.put(5, new Product(5, "Tape Measure", 7.89));
        inventory.put(6, new Product(6, "Level Tool", 12.75));
        inventory.put(7, new Product(7, "Wrench Set", 24.30));
        inventory.put(8, new Product(8, "Pliers", 11.60));
    }
}