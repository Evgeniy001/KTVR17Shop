/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;



/**
 *
 * @author pupil
 */
public class KTVR17Shop {
    /*public static void main(String[] args) {
        Product p1 = new Product (1L, "Moloko", 50,10);
        Product p2 = new Product (2L, "Hleb", 30,15);
        Product p3 = new Product (3L, "Kolbasa", 130,20);
        
        Customer c1 = new Customer (1L, "Ivan ", "Ivanov ", 1000);
        Customer c2 = new Customer (2L, "Sidor ", "Sidorov ", 1000);
        Customer c3 = new Customer (3L, "Petr ", "Petrov ", 1000);
        
        System.out.println("Status p1: "+ p1.toString());
        System.out.println("Status c1: "+ c1.toString());
        
        Calendar calendar = new GregorianCalendar();
        Purchase purchase1 = new Purchase (1L, p1, c1, new Date(), 2 );
        p1.setCount(p1.getCount() - purchase1.getQuantity());
        c1.setMoney(c1.getMoney() - purchase1.getQuantity()* p1.getPrice());
        
        System.out.println(purchase1.getCustomer().getName() + " " + purchase1.getCustomer().getSurname()+ "����� " + purchase1.getProduct().getName() + " � �������� " + purchase1.getQuantity() + " ����");
        System.out.println("Status p1: "+ p1.toString());
        System.out.println("Status c1: "+ c1.toString());
    } */
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    }