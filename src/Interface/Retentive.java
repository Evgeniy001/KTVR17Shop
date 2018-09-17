/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Retentive {
    public void saveCustomer(Customer costomer);
    public void saveProduct(Product product);
    public void savePurchase(Purchase purchase);
    public List<Customer>loadCustomer();
    public List<Product>loadProduct();
    public List<Purchase>loadPurchase();
    public void freeResources();
}
