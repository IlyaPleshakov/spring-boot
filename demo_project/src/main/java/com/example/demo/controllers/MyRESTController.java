package com.example.springmvc;

import com.example.springmvc.entity.ProductNames;
import com.example.springmvc.exception_handling.NoSuchProductNameException;
import com.example.springmvc.service.ProductNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private ProductNameService productNameService;

    @GetMapping("/get")
    public List<ProductNames> getAllProductNames(){
        List<ProductNames> allProductNames=productNameService.getAllProductNames();
        return allProductNames;
    }

    @GetMapping("/get/{id}")
    public ProductNames getProductNameById(@PathVariable int id){
        ProductNames productNames=productNameService.getProductName(id);
        if (productNames==null){
            throw new NoSuchProductNameException("There is no product name with ID = "+
                    id+ " in Database");
        }
        return productNames;
    }

    @PostMapping("/get")
    public ProductNames addNewProductName(@RequestBody ProductNames productNames){
        productNameService.saveProductName(productNames);
        return productNames;
    }
}
