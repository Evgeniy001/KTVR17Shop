/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerCreator {
    public Customer returnNewCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------добавления покупателя--------");
        Customer customer = new Customer();
        System.out.println("name customer");
        customer.setCustomerName(scanner.nextLine());
        System.out.println("surname customer");
        customer.setCustomerSurname(scanner.nextLine());
        System.out.println("ID customer");
        customer.setID(scanner.nextLine());
        System.out.println("money customer");
        customer.setMoney(scanner.nextInt());
        return customer;
        
                
    }
}
