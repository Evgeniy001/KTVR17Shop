/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {

    public Product(Long id, String name, Integer price, Integer count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    Long id;//создаем поля
    String name;
    Integer price;
    Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", price=" + price + ", count=" + count + '}';
    }
    
public Product(){
    }    
   



    
}



