/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import classes.CustomerCreator;
import classes.ProductCreator;
import entity.Customer;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
  private List <Product> products = new ArrayList <>();
  private List <Customer> customera = new ArrayList <>();
    public void run(){
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do{
            System.out.println("Выберите нужное действие:");
            System.out.println("0 - для выхода из программы");
            System.out.println("1 - для добавления товара");
            System.out.println("2 - для добавления покупателя");
            System.out.println("3 - для продажи товара");
            System.out.println("4 - для возврата товара");
            String action = scanner.next();
            
            switch (action) {
                case "0":
                    repeat = "r";
                    break;
                case "1":
                    ProductCreator productCreator = new ProductCreator();
                    product.add(productCreator.returnNewProduct());  
                    System.out.println("товар добавлен!");
                    break;
                case "2":
                    CustomerCreator customerCreator = new CustomerCreator();
                    customer.add(customerCreator.returnNewCustomer());  
                    System.out.println("товар добавлен!");
                    break;
        }
        
    }
}
