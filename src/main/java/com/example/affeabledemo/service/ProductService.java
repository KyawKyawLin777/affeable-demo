package com.example.affeabledemo.service;

import com.example.affeabledemo.dao.ProductDao;
import com.example.affeabledemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> listProductByCategory(int id){
        return productDao.findProductByCategoryId(id);
    }


}
