/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Interface.Retentive;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author pupil
 */
public class PersistToDatabase implements Retentive {
 

    private final EntityManager em;
    private final EntityTransaction tx;

    @Override
    public void saveCustomer(Customer customer) {
        tx.begin();
        em.persist(customer);
        tx.commit();
    }

    @Override
    public void saveProduct(Product product) {
        tx.begin();
        em.persist(product);
        tx.commit();
    }

    @Override
    public void savePurchase(Purchase purchase) {
        tx.begin();
        em.persist(purchase);
        tx.commit();
    }

    @Override
    public List<Customer> loadCustomer() {
        try{
            return em.createQuery("").getResultList();
            
        }catch(Exception e){
            return new ArrayList<Customer>();
        }
    }

    @Override
    public List<Product> loadProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Purchase> loadPurchase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void freeResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
