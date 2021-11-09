package com.example.demo.dao;

import com.example.demo.entity.ProductNames;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductNamesRepository extends JpaRepository<ProductNames, Long> {

    public List<ProductNames> findAll();
    public Optional<ProductNames> findById(Long id);
}
