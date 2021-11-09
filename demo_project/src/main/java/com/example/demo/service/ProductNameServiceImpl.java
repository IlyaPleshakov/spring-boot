package com.example.springmvc.service;

import com.example.springmvc.dao.OrderDAO;
import com.example.springmvc.dao.ProductNamesDAO;
import com.example.springmvc.entity.Order;
import com.example.springmvc.entity.ProductNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductNameServiceImpl implements ProductNameService{

    @Autowired
    private ProductNamesDAO productNamesDAO;

    @Autowired
    private OrderDAO orderDAO;

    @Override
    @Transactional
    public List<ProductNames> getAllProductNames() {
        return productNamesDAO.getAllProductNames();
    }

    @Override
    @Transactional
    public List<Order> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @Override
    @Transactional
    public void saveProductName(ProductNames productNames) {
        productNamesDAO.saveProductName(productNames);
    }

    @Override
    @Transactional
    public void deleteProductName(int id) {
        productNamesDAO.deleteProductName(id);
    }

    @Override
    @Transactional
    public ProductNames getProductName(int id) {
        ProductNames productNames = productNamesDAO.getProductName(id);
        return productNames;
    }
}
