package com.example.springmvc.service;

import com.example.springmvc.entity.Order;
import com.example.springmvc.entity.ProductNames;

import java.util.List;

public interface ProductNameService {

    public List<ProductNames> getAllProductNames();

    public List<Order> getAllOrders();

    public void saveProductName(ProductNames productNames);

    public void deleteProductName(int id);

    ProductNames getProductName(int id);
}
