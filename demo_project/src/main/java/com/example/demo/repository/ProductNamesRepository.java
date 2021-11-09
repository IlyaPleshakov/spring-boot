package com.example.demo.repository;

import com.example.demo.entity.ProductNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


public interface ProductNamesRepository extends JpaRepository<ProductNames, Long> {

}
