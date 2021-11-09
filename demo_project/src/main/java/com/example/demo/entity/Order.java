package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="order_number")
    private int orderNumber;

    @Column(name="customer")
    private String customer;

//    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="order")
//    private List<ProductNames> listProducts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderName) {
        this.orderNumber = orderName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }


    public Order() {
    }

    public Order(int orderName, String customer, double price, int quantity) {
        this.orderNumber = orderName;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderNumber + '\'' +
                '}';
    }
}
