/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductCreator {
    public Product returnNewProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------добавления товара--------");
        Product product = new Product();
        System.out.println("name producta");
        product.setProductName(scanner.nextLine());
        System.out.println("ID producta");
        product.setID(scanner.nextLine());
        System.out.println("price producta");
        product.setPrice(scanner.nextInt());
        System.out.println("count producta");
        product.setCount(scanner.nextInt());
        return product;
    }
}
