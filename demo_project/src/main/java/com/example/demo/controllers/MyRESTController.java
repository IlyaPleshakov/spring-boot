package com.example.demo.controllers;

import com.example.demo.entity.ProductNames;
import com.example.demo.service.exception_handling.NoSuchProductNameException;
import com.example.demo.service.ProductNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRESTController {

    @GetMapping("/")
    public String showStart(){

        return "Hello";
    }
    @Autowired
    private ProductNameService productNameService;

    @GetMapping("/get")
    public List<ProductNames> getAllProductNames(){
        List<ProductNames> allProductNames=productNameService.getAllProductNames();
        return allProductNames;
    }
//
//    @GetMapping("/get/{id}")
//    public ProductNames getProductNameById(@PathVariable Long id){
//        ProductNames productNames=productNameService.getProductNameById(id);
//        if (productNames==null){
//            throw new NoSuchProductNameException("There is no product name with ID = "+
//                    id+ " in Database");
//        }
//        return productNames;
//    }
//
//    @PostMapping("/get")
//    public ProductNames addNewProductName(@RequestBody ProductNames productNames){
//        productNameService.saveProductName(productNames);
//        return productNames;
//    }
}
