package com.example.springmvc.entity;

import com.example.springmvc.entity.Order;

import javax.persistence.*;

@Entity
@Table(name = "product_names")
public class ProductNames {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="order_id")
    private int order;


    @Column(name="product_name")
    private String productName;

    @Column(name="quantity")
    private int quantity;

    @Column(name="price")
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order)
    {
        this.order = order;
    }


    public ProductNames() {
    }

    public ProductNames(int order, String productName, int quantity, double price) {
        this.order = order;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductNames{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
