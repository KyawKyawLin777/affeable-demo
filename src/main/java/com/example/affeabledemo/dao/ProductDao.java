package com.example.affeabledemo.dao;

import com.example.affeabledemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    @Query("""
    select p from Product p where p.category.id=:id
    """)
    List<Product> findProductByCategoryId(int id);
}
