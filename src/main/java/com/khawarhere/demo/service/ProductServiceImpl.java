package com.khawarhere.demo.service;

import com.khawarhere.demo.model.Product;
import com.khawarhere.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by khawar on 2/13/19.
 */
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product save(Product item) {
        return repository.save(item);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
}
