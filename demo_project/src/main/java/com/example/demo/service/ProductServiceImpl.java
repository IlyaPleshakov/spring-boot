package com.example.demo.service;
import com.example.demo.repository.ProductRepository;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {

        List<Product> allProducts= productRepository.findAll();

        return allProducts;
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        Optional<Product> optional=productRepository.findById(id);
        optional.ge
        return ;
    }



}
