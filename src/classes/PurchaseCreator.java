/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseCreator {

    public Purchase returnNewPurchase(List<Customer> customers,List<Product> products) {
        System.out.println("-----prodaga tovara------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("spisok tovarov:");
        int countProducts = products.size();
        for(int i = 0;i<countProducts;i++){
            System.out.println(i+1+". "+products.get(i).getName()+" "+products.get(i).getCount()+": "+products.get(i).getPrice());
        }
        System.out.println("spisok klientov");
        int countCustomers = customers.size();
        for(int i = 0;i<countCustomers;i++){
            System.out.println(i+1+". "+customers.get(i).getName()+" "+customers.get(i).getSurname()+": "+customers.get(i).getMoney());
        
        }
        System.out.println("выберите название продукта");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct-1);
        System.out.println("выберите имя клиента: ");
        int numberCustomer = scanner.nextInt();
        Customer customer = customers.get(numberCustomer-1);
        System.out.println("колличество: ");
        int quantity = scanner.nextInt();
        Calendar c = new GregorianCalendar();
        Purchase purchase = new Purchase (null,product,customer,c.getTime(),quantity);
        return purchase;
    }
    
}
