package com.example.affeabledemo.dao;


import com.example.affeabledemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
