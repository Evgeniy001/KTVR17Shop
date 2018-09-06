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
public class Customer {

    public Customer(Long id, String name, String surname, Integer money) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.money = money;
    }
    Long id;//создаем поля
    String name;
    String surname;
    Integer money;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "customer{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", money=" + money + '}';
    }
}
