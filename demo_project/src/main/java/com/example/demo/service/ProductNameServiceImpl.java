package com.example.demo.service;
import com.example.demo.repository.ProductNamesRepository;
import com.example.demo.entity.ProductNames;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class ProductNameServiceImpl implements ProductNameService{

    @Autowired
    private ProductNamesRepository productNamesRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<ProductNames> getAllProductNames() {

        //List<ProductNames> productNames=productNamesRepository.findAll();
        Query query=entityManager.createQuery("from ProductNames");
        List<ProductNames> allProductNames =query.getResultList();
        return allProductNames;
    }

//    @Override
//    public Optional<ProductNames> getProductNameById(Long id) {
//        return Optional.empty();
//    }

//    @Override
//    public <ProductNames getProductNameById(Long id) {
//        Optional<> optional=
//        return productNamesRepository.findById(id);
//    }


}
