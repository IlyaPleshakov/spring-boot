package com.example.demo.repository;

import com.example.demo.entity.ProductNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductNamesRepository extends JpaRepository<ProductNames, Long> {


    public List<ProductNames> findAll();
    public Optional<ProductNames> findById(Long id);
}
